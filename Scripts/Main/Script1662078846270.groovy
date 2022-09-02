import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import java.awt.image.BufferedImage
import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path qrcodeList = projectDir.resolve("Include/data/qrcode_list.csv")

List<String> qrcodes = qrcodeList.toFile().text.readLines()
// iterate over the list of QRCode IDs
for (line in qrcodes) {
	items = line.split(",")
	if (items.size() > 0 & items[0].startsWith("qr")) {
		String qrcodeId = items[0]
		WebUI.comment("qrcodeId: ${qrcodeId}")
		
		// fetch the image of the QRCode by id
		BufferedImage qrcodeImage = WebUI.callTestCase(findTestCase("Test Cases/qrcode_fetcher"), ["id":items[0]])
		assert qrcodeImage != null
		
		// perform whatever processing over the QRCode image 
		WebUI.callTestCase(findTestCase("Test Cases/qrcode_processor"), ["qrcodeId": qrcodeId, "image": qrcodeImage])
	}
}
