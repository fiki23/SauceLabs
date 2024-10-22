import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import java.math.BigDecimal
import java.math.RoundingMode
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

//define screenshot
def takeScreenshot(String filenamePrefix) {
	String screenshotPath = "C:/Users/ficky/git/SauceLabs/Screenshot/TC008_checkout with empty chart/" + filenamePrefix + ".png"
}

//open cart
WebUI.click(findTestObject('Object Repository/menu/button_Cart'))
WebUI.takeScreenshot('open_cart')

//click button checkout
WebUI.click(findTestObject('Object Repository/menu/button_Checkout'))
WebUI.takeScreenshot('information_page')

//Input data information
WebUI.setText(findTestObject('Object Repository/Checkout/input_FirstName'), firstName)
WebUI.setText(findTestObject('Object Repository/Checkout/input_LastName'), lastName)
WebUI.setText(findTestObject('Object Repository/Checkout/input_ZipCode'), zipCode)
WebUI.takeScreenshot('input_data')

//print console
println('Currently input first name: ' + firstName)
println('Currently input last name: ' + lastName)
println('Currently input zipcode: ' + zipCode)

//checkout
WebUI.click(findTestObject('Object Repository/Checkout/button_Continue'))
WebUI.takeScreenshot('checkoutpage')

//finish button
WebUI.click(findTestObject('Object Repository/checkout/button_Finish'))

//assertion
WebUI.verifyElementPresent(findTestObject('Object Repository/checkout/text_finishOrder'), 10)
WebUI.takeScreenshot('successcheckout')
