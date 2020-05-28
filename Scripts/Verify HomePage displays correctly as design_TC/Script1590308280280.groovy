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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Mobile.callTestCase(findTestCase('Test Cases/Login_TC'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

'Verify add new prospect icon buttton should be displayed on the Home Page'
Mobile.verifyElementVisible(findTestObject('Home_page/btn_NewProspect'), 10)

'Verify icon button Agent Prefers should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Home_page/btn_AgentPrefers'), 10)

'Verify Search box should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Home_page/box_Search'), 10)

'Verify tab Lead should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Lead_page/tab_Lead'), 10)

'Verify tab Accept should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Accept_page/tab_Accept'), 10)

'Verify tab Contact Attempt should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Contact_page/tab_ContactAttempt'), 10)

'Verify tab Meeting should be present on the Home Page'
Mobile.verifyElementVisible(findTestObject('Meeting_page/tab_Meeting'), 10)

//Mobile.closeApplication()

