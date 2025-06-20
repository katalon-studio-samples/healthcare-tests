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

def employeeData = findTestData('Data Files/Employee')

//test
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://barista-uat.perkeso.gov.my:13491/login/ActiveDirectory?returnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/input_User Name_userNameOrEmail'), 
    'uat_norazrin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/input_Password_password'), 
    'x1UVEr6Iv5gT2/TnQOlt+A==')

WebUI.click(findTestObject('Object Repository/Page_NXOne - Sign In using your Domain User_d6fcc4/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT - BARISTA Main/a_Pre-Registration'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BARISTA-UAT/select_AccidentDeath - PKTDeath - FOTODILAT'), 
    'Death - FOT', true)



WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BARISTA-UAT/select_Please SelectInsured PersonEmployerOthers'), 
    'Others', true)

WebUI.setText(findTestObject('Object Repository/Page_BARISTA-UAT/input__IdentificationNo'), employeeData.getValue('IC', 1))

WebUI.setText(findTestObject('Object Repository/Page_BARISTA-UAT/input__EmployerCodePreReg'), employeeData.getValue('EmployerCode', 1))

WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/input__SearchOb'))

//need to use scrollview
WebUI.scrollToPosition(0, 2000)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_BARISTA-UAT/input_POC_Next'))


WebUI.click(findTestObject('Object Repository/Page_BARISTA-UAT/input_POC_Next'))



WebUI.switchToWindowTitle('eForm')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_eForm/span_Password_btnClose'), 0)

WebUI.click(findTestObject('Object Repository/Page_eForm/span_Password_btnClose'))

WebUI.delay(10)

//		REMARKS TAB
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Remarks'))

//		IPS TAB
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Insured Person Information'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input__NoticeandBenefitClaimFormReceivedDate1'))

//Hard code date not work
//WebUI.click(findTestObject('Object Repository/Page_eForm/NoticeandBenefitClaimFormReceivedDate1'))

WebUI.click(findTestObject('Object Repository/Page_eForm/a_1'))

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__OccupationBasedonForm34'), 'CS')


WebUI.setText(findTestObject('Object Repository/Page_eForm/input__AddressInsuredPersonInfo'), 'Taman Abadi')

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__AddressInsuredPersonInfo2'), 'Jalan 1/10')

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__AddressInsuredPersonInfo3'), 'Lorong 10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectJOHORKEDAHKELANTANMELAK_7e1e9c'), 
    '200710', true)



WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectRASASEMENYIHBUKIT ROTAN_9c7f7b'), 
    '201430', true)

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__PostcodeInsuredPersonInfo'), '68100')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectMalaysia'), '201749', true)

//		EI TAB
WebUI.click(findTestObject('Object Repository/Page_eForm/div_Employer Information'))

// should populate from ASSIST
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_State_Employer_Info'),
//	'201430', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_City_Employer_Info'),
//	'200710', true)



//		OD Info Tab
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Occupational Disease Information'))

WebUI.setText(findTestObject('Object Repository/Page_eForm/textarea__DescriptionofOD'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_eForm/textarea__Specifydutiesandhowinsuredpersone_db1a46'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_eForm/textarea__Pleaseexplainsymptomssignencountered'), 'test')
//		MC Tab	
//click mc tab first. date still not working
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Medical Certificate Information'))

//WebUI.setText(findTestObject('Object Repository/Page_eForm/input__NameandAddressofClinicHospitalwhichP_250508'), 'HKL')
//
//WebUI.setText(findTestObject('Object Repository/Page_eForm/input__StartDate-cee5f3b0-d7f0-4419-99ad-31_c57f8d'), '')
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/input__StartDate-cee5f3b0-d7f0-4419-99ad-31_c57f8d'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_190019011902190319041905190619071908_246ee1_1'), 
//    '2020', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '6', 
//    true)
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/td_1'))
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/input__EndDateMC-84c939e2-002a-4d3e-9a39-09_8dc319'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_190019011902190319041905190619071908_246ee1_1'), 
//    '2020', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '6', 
//    true)
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/a_23'))
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/input_HUS Status_popActionButtons btnSummar_0363f4'))
//		Wages info tab
WebUI.click(findTestObject('Object Repository/Page_eForm/div_Wages Information'))
//		Wages info tab
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Preferred SOCSO Office'))
//		cert by employer
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Certification by Employer'))

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__NameEmployerCert'), 'MAT')

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__DesignationEmployerCert'), 'CEO')
// date still problem
//WebUI.setText(findTestObject('Object Repository/Page_eForm/input__DateEmployerCert'), '')
//
//WebUI.click(findTestObject('Object Repository/Page_eForm/input__DateEmployerCert'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_190019011902190319041905190619071908_246ee1'), 
//    '2020', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_JanFebMarAprMayJunJulAugSepOctNovDec'), '11', 
//    true)

//WebUI.click(findTestObject('Object Repository/Page_eForm/a_31'))
//		bank info tab
WebUI.click(findTestObject('Object Repository/Page_eForm/div_Bank Information'))
//
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectYesNo'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectLocalOverseas'), '204101', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectAGRO BANKAFFIN ISLAMIC _d4e6db'), 
    '802121', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_eForm/select_Please SelectSavingCurrent'), '204401', true)

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__BankAccountNo'), '34543543')

WebUI.setText(findTestObject('Object Repository/Page_eForm/input__BankBranch'), 'KL')
//		Confirmation of Insured PersonDepend tab
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Confirmation of Insured PersonDependa_d10068'))

WebUI.click(findTestObject('Object Repository/Page_eForm/input_Bank Information Completed_ctrlField666'))
//		Supporting Document tab
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Supporting Document'))

//need to scroll 

WebUI.scrollToElement(findTestObject('Object Repository/Page_eForm/sectionTabs'), 0)

//		Preview  Submission tab
WebUI.click(findTestObject('Object Repository/Page_eForm/label_Preview  Submission'))

//WebUI.click(findTestObject('Object Repository/Page_eForm/input_B32TEMP_NTO202400113.pdf_Submit'))

