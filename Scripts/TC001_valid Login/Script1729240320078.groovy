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

//open browser
	WebUI.openBrowser('https://www.saucedemo.com/v1/index.html')
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/Katalon Studio/SauceDemo/Screenshot/TC005_valid Login/open_saucelabs.png')
//input credentials
	WebUI.setText(findTestObject('Object Repository/Login/input_Username'), username)
	WebUI.setText(findTestObject('Object Repository/Login/input_Password'), password)
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/Katalon Studio/SauceDemo/Screenshot/TC005_valid Login/input_credentials.png')
//login button
	WebUI.click(findTestObject('Object Repository/Login/button_Login'))
	//screenshot
	WebUI.takeScreenshot('C:/Users/ficky/Katalon Studio/SauceDemo/Screenshot/success_login.png')

