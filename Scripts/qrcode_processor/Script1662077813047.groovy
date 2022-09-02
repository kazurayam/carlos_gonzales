import java.awt.image.BufferedImage

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// make sure the id is given by the Main
assert qrcodeId != null

WebUI.comment("processing ${qrcodeId}")


// make sure the image is given by the Main
assert image != null

// make sure the image is an instance of BufferedImage
assert image instanceof BufferedImage

// you can do whatever you like 
Mobile.comment("${qrcodeId}: " + image.toString())
