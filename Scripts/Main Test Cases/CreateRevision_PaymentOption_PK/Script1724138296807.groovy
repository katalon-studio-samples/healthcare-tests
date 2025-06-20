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
    'uat_norazrin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/input_Password_password'), 
    'x1UVEr6Iv5gT2/TnQOlt+A==')

WebUI.click(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT - BARISTA Main/a_Create Revision'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BARISTA-UAT/select_Please SelectAdditional MCAppeal MB _e64f7c'), 
    'HUK_PAYOPT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BARISTA-UAT/select_Please SelectBenefit Reference Numbe_881114'), 
    'SchemeRefNo', true)

WebUI.setText(findTestObject('Object Repository/Page_BARISTA-UAT/input_Scheme Reference Number_SchemeReferen_a9bf52'), 'B32NTO20240000062')

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/input_Scheme Reference Number_SearchBySchem_dfb478'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/input_Case Status_btnCreateRevision-4e6d-4e_b064f9'))

WebUI.switchToWindowTitle('eForm')

WebUI.click(findTestObject('Object Repository/Page_eForm/label_Remarks'))

WebUI.click(findTestObject('Object Repository/Page_eForm/div_Revision Information'))

WebUI.click(findTestObject('Object Repository/Page_eForm/label_Payment Option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectLump SumPeriodical'), '92003', 
    true)

WebUI.click(findTestObject('Object Repository/Page_eForm/input__PaymentOptionReceivedDate'))

WebUI.click(findTestObject('Object Repository/Page_eForm/a_1'))

WebUI.click(findTestObject('Object Repository/Page_eForm/div_Supporting Document'))

WebUI.click(findTestObject('Object Repository/Page_eForm/div_Preview  Submission'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_Preview  Submission_ShowPreview'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_B32TEMP_NTO202400113.pdf_Submit'))

WebUI.click(findTestObject('Object Repository/Page_eForm/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_B32TEMP_NTO202400113.pdf_Submit'))

