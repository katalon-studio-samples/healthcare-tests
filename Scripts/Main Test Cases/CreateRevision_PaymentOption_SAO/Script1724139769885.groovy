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

WebUI.navigateToUrl('http://barista-uat.perkeso.gov.my:13491/login/ActiveDirectory?returnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/input_User Name_userNameOrEmail'), 
    'uat_redzuan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/input_Password_password'), 
    '0hdp5Svzt/o1ZbChA5i2CQ==')

WebUI.click(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT - BARISTA Main/a_My Cases'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/span_My Tasks'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/td_Revision Payment Option SAO'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/span_Open Task'))

WebUI.switchToWindowTitle('eForm')

WebUI.click(findTestObject('Object Repository/Page_eForm/label_Revision Info'))

WebUI.click(findTestObject('Object Repository/Page_eForm/div_Endorsement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectApproveReject'), '10203', true)

WebUI.click(findTestObject('Object Repository/Page_eForm/label_Supporting Doc'))

WebUI.click(findTestObject('Object Repository/Page_eForm/label_Preview  Submission'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_Preview  Submission_ShowPreview'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_B32TEMP_NTO202400113.pdf_Submit'))

WebUI.click(findTestObject('Object Repository/Page_eForm/button_Yes'))

