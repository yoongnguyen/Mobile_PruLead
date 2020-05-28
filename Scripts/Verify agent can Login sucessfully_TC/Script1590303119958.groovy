import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/*
String dir_path = RunConfiguration.getProjectDir()

String app_path = dir_path + '/Data Files/' + 'PRUleads.apk'

println(app_path)

Mobile.startApplication(app_path, false)
*/

//Mobile.callTestCase(findTestCase('Test Cases/Login_TC'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

String homePage = Mobile.getText(findTestObject('Login_page/lbl_Home'), 10)

'Check the login is success or not. Success if HomePage title = "Home"'
Boolean login_result = Mobile.verifyMatch(homePage, 'Home', false)
String result = 'Not Run'
if(login_result){
	result = 'PASS'
}else{
	result = 'FAILED'
}
KeywordUtil.logInfo('The test result of login testcase is: ' + result)

/*Mobile.tap(findTestObject('Login_page/btn_Connect'), 10)

Mobile.setText(findTestObject('Login_page/input_AgentCode'), '60000012', 10)

Mobile.setText(findTestObject('Login_page/input_Password'), 'Prudential01', 10)

Mobile.tap(findTestObject('Login_page/btn_Connect'), 10)*/

//Mobile.closeApplication()

