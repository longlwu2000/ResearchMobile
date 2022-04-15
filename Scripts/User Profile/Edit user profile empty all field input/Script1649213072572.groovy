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

WebUI.callTestCase(findTestCase('Login/Login by Admin success'), [('email') : 'admin@ezactive.com', ('pass') : '12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Common/btnIsPresent by Text', [('text') : 'menu']), 0)

Mobile.tap(findTestObject('Menu/btnUserProfile'), 0)

Mobile.tap(findTestObject('User Profile/btnUserProfile'), 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Surname']), '', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Other']), '', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Email']), '', 0)

Mobile.tap(findTestObject('User Profile/btnSave'), 0)

WebUI.callTestCase(findTestCase('Common/Verify Text Present'), [('text') : 'Please enter a email'], FailureHandling.STOP_ON_FAILURE)

