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

WebUI.callTestCase(findTestCase('Login/Login by parent success'), [('email') : 'thaolele@gmail.com', ('pass') : '12345'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Common/btnIsPresent by Text', [('text') : 'menu']), 0)

Mobile.tap(findTestObject('Common/find OJ by accessibility id', [('name') : 'person outline User profile']), 0)

Mobile.tap(findTestObject('Common/textIsPresent by Text', [('text') : 'Edit']), 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Surname']), 'Admin', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Other']), 'League', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Email']), 'lethao123@ezactive.com', 0)

Mobile.tap(findTestObject('User Profile/btnSave'), 0)

x=Mobile.getElementLeftPosition(findTestObject('Common/btnIsPresent by Text', [('text') : 'Logout']), 2)
y=Mobile.getElementTopPosition(findTestObject('Common/btnIsPresent by Text', [('text') : 'Logout']), 2)

Mobile.tapAtPosition(x+20, y+10)

Mobile.tap(findTestObject('User Profile/btnYes'), 3)

WebUI.callTestCase(findTestCase('Login/Login by parent success'), [('email') : 'thaole123@gmail.com', ('pass') : '12345'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Common/find OJ by accessibility id', [('name') : 'person outline User profile']), 3)

Mobile.tap(findTestObject('Common/textIsPresent by Text', [('text') : 'Edit']), 3)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Surname']), 'Thao', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Other']), 'Le', 0)

Mobile.setText(findTestObject('Registation/inpInfomation', [('name') : 'Email']), 'thaolele@ezactive.com', 0)

Mobile.tap(findTestObject('User Profile/btnSave'), 0)

