import java.awt.image.BufferedImage
import java.nio.file.Path
import java.nio.file.Paths

import javax.imageio.ImageIO

import com.kms.katalon.core.configuration.RunConfiguration

Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path qrcodeDir = projectDir.resolve("Include/qrcodeImages")

// make sure the "id" is passed from the Main
assert id != null

Path image = qrcodeDir.resolve(id + ".png")
BufferedImage img = ImageIO.read(image.toFile())

return img

