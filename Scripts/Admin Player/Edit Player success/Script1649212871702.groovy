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

WebUI.callTestCase(findTestCase('Admin Player/select Player and click edit'), [('player_name') : player_name], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Admin Player/filleditPlayer'), [('surname') : surname, ('othernames') : othernames, ('dob') : dob
        , ('gender') : gender, ('hkid_type') : hkid_type, ('expiry_date') : expiry_date], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Common/inpSearch'), surname, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Verify View Present'), [('text') : surname], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Verify View Present'), [('text') : othernames], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Verify View Present'), [('text') : dob], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Verify View Present'), [('text') : expiry_date], FailureHandling.STOP_ON_FAILURE)

