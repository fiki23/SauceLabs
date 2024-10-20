import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

//choose product
WebUI.waitForElementPresent(findTestObject('Object Repository/product/inventory_product', [('productName') : productName]), 10)
WebUI.click(findTestObject('Object Repository/product/inventory_product', [('productName') : productName]))
println('Currently clicking product: ' + productName)
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/Katalon Studio/SauceDemo/Screenshot/TC007_Add cart in detail product/home.png')

//add to cart
WebUI.click(findTestObject('Object Repository/product/button_AddToCart_productDetail'))
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/Katalon Studio/SauceDemo/Screenshot/TC007_Add cart in detail product/product_detail.png')

//assertion
WebUI.verifyElementPresent(findTestObject('Object Repository/menu/icon_cartBadge'), 10)
