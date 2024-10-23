import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.util.KeywordUtil
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

//open side menu
WebUI.click(findTestObject('Object Repository/menu/button_sideMenu'))

//screenshot
WebUI.takeScreenshot(GlobalVariable.baseUrl + 'TC004_add cart in home successfully/open_side_menu.png')


//click reset
WebUI.click(findTestObject('Object Repository/menu/button_resetAppState'))

//screenshot
WebUI.takeScreenshot(GlobalVariable.baseUrl + 'TC004_add cart in home successfully/reset.png')

//close side menu
WebUI.click(findTestObject('menu/closeSideMenu'))

//click add to cart
WebUI.waitForElementPresent(findTestObject('Object Repository/product/button_AddToCart', [('productName') : productName]), 10)
WebUI.click(findTestObject('Object Repository/product/button_AddToCart', [('productName') : productName]))
println('Currently adding product to cart: ' + productName)

//assertion
WebUI.verifyElementPresent(findTestObject('Object Repository/menu/icon_cartBadge'), 10)

//screenshot
WebUI.takeScreenshot(GlobalVariable.baseUrl + 'TC004_add cart in home successfully/addcart.png')
