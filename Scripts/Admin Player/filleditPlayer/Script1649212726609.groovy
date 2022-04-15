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

Mobile.setText(findTestObject('Admin Player/inpInfor by ID', [('id') : 'DTE_Field_players-surname']), surname, 5)

Mobile.setText(findTestObject('Admin Player/inpInfor by ID', [('id') : 'DTE_Field_players-other_name']), othernames, 5)

Mobile.setText(findTestObject('Admin Player/inpInfor by ID', [('id') : 'dob']), dob, 5)

if (gender) {
    Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'gender_0']), 2)
} else {
    Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'gender_1']), 2)
}

switch (hkid_type) {
    case 1:
        Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'type_0']), 2)

        break
    case 2:
        Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'type_1']), 2)

		Mobile.scrollToText('expiry')
		
        Mobile.setText(findTestObject('Admin Player/inpInfor by ID', [('id') : 'expiry_date']), expiry_date, 5)

        break
    case 3:
        Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'type_2']), 2)
		
		Mobile.scrollToText('expiry')

        Mobile.setText(findTestObject('Admin Player/inpInfor by ID', [('id') : 'expiry_date']), expiry_date, 5)

        break
    default:
        Mobile.tap(findTestObject('Admin Player/rdoById', [('id') : 'type_0']), 2)}

Mobile.tap(findTestObject('Common/btnIsPresent by Text', [('text') : 'Save']), 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

