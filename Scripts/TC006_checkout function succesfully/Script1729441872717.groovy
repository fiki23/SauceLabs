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
//open cart
WebUI.click(findTestObject('Object Repository/menu/button_Cart'))

//screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC006_checkout function succesfully/open_cart.png')


//click button checkout
WebUI.click(findTestObject('Object Repository/menu/button_Checkout'))

//screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC006_checkout function succesfully/information_page.png')


//Input data information
WebUI.setText(findTestObject('Object Repository/Checkout/input_FirstName'), firstName)
WebUI.setText(findTestObject('Object Repository/Checkout/input_LastName'), lastName)
WebUI.setText(findTestObject('Object Repository/Checkout/input_ZipCode'), zipCode)

//screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC006_checkout function succesfully/input_data.png')

//print console
println('Currently input first name: ' + firstName)
println('Currently input last name: ' + lastName)
println('Currently input zipcode: ' + zipCode)

//checkout
WebUI.click(findTestObject('Object Repository/Checkout/button_Continue'))
//screenshot
WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC006_checkout function succesfully/checkoutpage.png')

//retrieve product price
def productPriceText = WebUI.getText(findTestObject('Object Repository/checkout/ProductPrice1'))
def displayedTotalText = WebUI.getText(findTestObject('Object Repository/checkout/itemTotal'))
def displayedTotalWithTaxText = WebUI.getText(findTestObject('Object Repository/checkout/TotalText'))

//convert price ke BigDecimal
BigDecimal productPrice = new BigDecimal(productPriceText.replaceAll("[^\\d.]", ""))
BigDecimal displayedTotal = new BigDecimal(displayedTotalText.replaceAll("[^\\d.]", ""))
BigDecimal displayedTotalWithTax = new BigDecimal(displayedTotalWithTaxText.replaceAll("[^\\d.]", ""))
BigDecimal taxRate = new BigDecimal("0.08") // 8% tax rate
//29.99×0.08=2.40	
//29.99+2.40=32.39
BigDecimal expectedTotalWithTax = productPrice.multiply(taxRate).add(productPrice)

//round total with tax 2 decimal
BigDecimal roundedTotalWithTax = expectedTotalWithTax.setScale(2, RoundingMode.HALF_UP)

//validate total price before tax
boolean isPriceEqual = WebUI.verifyEqual(displayedTotal, productPrice)
println("Verification of product price before tax: Expected = " + productPrice + ", Displayed = " + displayedTotal + ", Result = " + isPriceEqual)

//validate total price after tax
boolean isTotalWithTaxEqual = WebUI.verifyEqual(displayedTotalWithTax, roundedTotalWithTax)
println("Verification of product price after tax: Expected = " + roundedTotalWithTax + ", Displayed = " + displayedTotalWithTax + ", Result = " + isTotalWithTaxEqual)

//finish button
WebUI.click(findTestObject('Object Repository/checkout/button_Finish'))


//assertion
WebUI.verifyElementPresent(findTestObject('Object Repository/checkout/text_finishOrder'), 10)

//screenshot
boolean finishorder = WebUI.verifyElementPresent(findTestObject('Object Repository/checkout/text_finishOrder'), 10)
	//screenshot
    WebUI.takeScreenshot('C:/Users/ficky/git/SauceLabs/Screenshot/TC006_checkout function succesfully/successcheckout.png')
