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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://alumni3.cyberlifecafe.com/')

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/Page_/input__Firstname'), 'ณรงค์ฤทธิ์')

WebUI.setText(findTestObject('Object Repository/Page_/input__Lastname'), 'สุปรานนท์')

WebUI.click(findTestObject('Object Repository/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Page_/input__StudentID'))

WebUI.click(findTestObject('Object Repository/Page_/input__Sex'))

WebUI.setText(findTestObject('Object Repository/Page_/input__StudentID'), '634259004')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__Password'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/Page_/input__Section'), '63/50')

WebUI.setText(findTestObject('Object Repository/Page_/input__Major'), 'วิศวกรรมซอฟต์แวร์')

WebUI.setText(findTestObject('Object Repository/Page_/input__EducationYear'), '2563')

WebUI.setText(findTestObject('Object Repository/Page_/input__Address'), '99/1')

WebUI.click(findTestObject('Object Repository/Page_/input__District'))

WebUI.setText(findTestObject('Object Repository/Page_/input__District'), 'สนามจันทร์')

WebUI.setText(findTestObject('Object Repository/Page_/input__District2'), 'เมืองนครปฐม')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_'), 'นครปฐม', true)

WebUI.click(findTestObject('Object Repository/Page_/input__Work'))

WebUI.setText(findTestObject('Object Repository/Page_/input__Phonenumber'), '0989751545')

WebUI.click(findTestObject('Object Repository/Page_/button_'))

WebUI.verifyTextPresent('The Workplace field is required.', false)

WebUI.closeBrowser()

