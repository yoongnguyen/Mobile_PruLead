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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
/*
String dir_path = RunConfiguration.getProjectDir()
String app_path = dir_path + '/Data Files/' + 'PRUleads.apk'
Mobile.startApplication(app_path, false)
*/
Mobile.delay(3)
Mobile.tap(findTestObject('Lead_page/btn_Accept'), 10)
Mobile.delay(2)
Mobile.tap(findTestObject('Lead_page/btn_Accept'), 10)
Mobile.delay(2)
Mobile.tap(findTestObject('Lead_page/btn_Accept'), 10)

Mobile.delay(2)
'Verify tab Accept is counted increase by 1 when cliking Aceept button'
String count_accept = Mobile.getText(findTestObject('Accept_page/tab_Accept'), 10)
String result = 'Not Run'
if(count_accept == 'Accept(3)'){
	KeywordUtil.markPassed('The Accept function working correctly')
	result = 'PASS'
}else{
	KeywordUtil.markFailed('The Accept btn does not work. PLs check again.')
	result = 'FAILED'
}
KeywordUtil.logInfo('The test result is: ' + result)

Mobile.tap(findTestObject('Accept_page/tab_Accept'), 10)
Mobile.delay(2)
