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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
	
//open cart
WebUI.click(findTestObject('Object Repository/menu/button_Cart'))
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC007_checkout not input information/open_cart.png')

//click button checkout
WebUI.click(findTestObject('Object Repository/menu/button_Checkout'))
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC007_checkout not input information/information_page.png')

//checkout page
WebUI.click(findTestObject('Object Repository/Checkout/button_Continue'))
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC007_checkout not input information/checkout_page.png')

// define
TestObject errorElement = findTestObject('Object Repository/checkout/errorMessage_Information')

// assertion
WebUI.verifyElementText(errorElement, 'Error: First Name is required')

//screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC007_checkout not input information/error_information_page.png')

