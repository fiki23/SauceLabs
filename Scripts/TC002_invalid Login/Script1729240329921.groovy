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

// open browser
WebUI.openBrowser('https://www.saucedemo.com/v1/index.html')

// screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/openBrowser.png')

//Enter username and password
WebUI.setText(findTestObject('Object Repository/Login/input_Username'), username)
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/usernameEntered.png')

WebUI.setText(findTestObject('Object Repository/Login/input_Password'), password)
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/passwordEntered.png')

//click login button
WebUI.click(findTestObject('Object Repository/Login/button_Login'))
// screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/loginClicked.png')

// dynamic test object
String expectedMessage = errorMessage
TestObject dynamicErrorMessage = findTestObject('Object Repository/Login/errorMessage_InvalidLogin', [('errorMessage') : expectedMessage])

// validate error message
boolean isErrorPresent = WebUI.verifyElementPresent(dynamicErrorMessage, 10)
if (isErrorPresent) {
    // screenshot
    WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/errorMessagePresent.png')

    String actualErrorMessage = WebUI.getText(dynamicErrorMessage)
    println('Expected Error Message from Data: ' + expectedMessage)
    println('Actual Error Message from Web: ' + actualErrorMessage)

    // assertion
    boolean doesMessageMatch = WebUI.verifyMatch(actualErrorMessage, expectedMessage, false)
    if (!doesMessageMatch) {
        WebUI.verifyMatch(actualErrorMessage, expectedMessage, false)
    } else {
        // screenshot
        WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC002_invalid Login/matchingErrorMessage.png')
        println('Success: The error message matches as expected.')
    }
}