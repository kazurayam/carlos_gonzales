import java.awt.image.BufferedImage

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// make sure the id is given by the Main
assert qrcodeId != null

// make sure the image is given by the Main
assert image != null

// make sure the image is an instance of BufferedImage
assert image instanceof BufferedImage

// you can do whatever you like 
Mobile.comment("qrcodeId=${qrcodeId}; " + image.toString())
