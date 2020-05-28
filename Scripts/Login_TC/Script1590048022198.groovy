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
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType


//Mobile.startApplication('kobiton-store:62000', true)
/*
String dir_path = RunConfiguration.getProjectDir()
String app_path = dir_path + '/Data Files/' + 'app-uat-universal-release.apk'
Mobile.startApplication(app_path, false)

/*
String kobitonServerUrl = "https://tamle:7cef9971-0b1d-4705-96df-267887a3070b@api.kobiton.com/wd/hub"

DesiredCapabilities capabilities = new DesiredCapabilities()
capabilities.setCapability("sessionName", "Automation test session")
capabilities.setCapability("sessionDescription", "")
capabilities.setCapability("deviceOrientation", "portrait")
capabilities.setCapability("captureScreenshots", true)
capabilities.setCapability("browserName", "chrome")
// The given group is used for finding devices and the created session will be visible for all members within the group.
capabilities.setCapability("groupId", 1247); // Group: AutoGroup
capabilities.setCapability("deviceGroup", "KOBITON")
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
capabilities.setCapability("deviceName", "Pixel 3a")
capabilities.setCapability("platformVersion", "10")
capabilities.setCapability("platformName", "Android")

capabilities.setCapability('app', 'kobiton-store:62000')
AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(kobitonServerUrl))
//
 */
Mobile.delay(1)




