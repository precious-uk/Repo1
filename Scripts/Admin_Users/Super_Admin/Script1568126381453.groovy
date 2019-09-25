import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8082/admin/login')

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_School AdministrationelementelementManagement System/input_face_susername'), 
    'su')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin_User_OR/Page_School AdministrationelementelementManagement System/input_lock_outline_spassword'), 
    'pj7if9M9elU=')

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_School AdministrationelementelementManagement System/button_Lets Go'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/p_Admin Management'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/p_Admin Users'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/i_add'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Longbridge_ps-scrollbar-y'))

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/input_FirstName_firstName'), 
    'SuperAdmin')

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/input_LastName_lastName'), 
    'SuperAdmin')

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/input_LoginId_userloginId'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/input_Email_email'), 'admin@gmail.com')

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Longbridge_ps-scrollbar-y-rail'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Longbridge_ps-scrollbar-y-rail'))

WebUI.setText(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/input_Phone Number_phoneNumber'), 
    '09023456781')

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Default Admin Profile'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Default Admin Profile'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/div_Default Admin Profile'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/span_Default Admin Profile'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/button_Submit'))

WebUI.click(findTestObject('Object Repository/Admin_User_OR/Page_SMS - School Management System/i_power_settings_new'))

