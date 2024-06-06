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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Feedback/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Feedback/Page_STORE/input_Username_loginusername'), 'wahid1')

WebUI.setEncryptedText(findTestObject('Object Repository/Feedback/Page_STORE/input_Password_loginpassword'), 'k+PYzaMv8xTxY88oWAN6hQ==')

WebUI.click(findTestObject('Object Repository/Feedback/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Feedback/Page_STORE/a_Contact'))

WebUI.setText(findTestObject('Object Repository/Feedback/Page_STORE/input_Contact Email_recipient-email'), 'wahid@gmail.co.id')

WebUI.setText(findTestObject('Object Repository/Feedback/Page_STORE/input_Contact Name_recipient-name'), 'wahid')

WebUI.setText(findTestObject('Object Repository/Feedback/Page_STORE/textarea_Message_message-text'), 'product bagus')

WebUI.click(findTestObject('Object Repository/Feedback/Page_STORE/button_Send message'))

WebUI.closeBrowser()

