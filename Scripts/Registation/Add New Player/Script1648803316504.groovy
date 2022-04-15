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

Mobile.tap(findTestObject('Common/btnIsPresent by Text'), 2)

Mobile.tap(findTestObject('Menu/btnRegistration'), 2)

Mobile.tap(findTestObject('Common/btnIsPresent by Text', [('text') : 'SELECT']), 2)

WebUI.delay(3)

//x=Mobile.getElementLeftPosition(findTestObject('Common/textIsPresent by Text', [('text') : 'ADD NEW']), 2)
//y=Mobile.getElementTopPosition(findTestObject('Common/textIsPresent by Text', [('text') : 'ADD NEW']), 2)
//
//Mobile.tapAtPosition(500, 2100)
Mobile.tap(findTestObject('Common/textIsPresent by Text', [('text') : 'ADD NEW']), 2)

WebUI.callTestCase(findTestCase('Registation/fill form registration'), [('surname') : surname, ('othernames') : othernames
        , ('dob') : dob, ('img_player') : gender, ('gender') : gender, ('hkid_type') : hkid_type, ('img_doc') : img_doc, ('club') : club], 
    FailureHandling.STOP_ON_FAILURE)

