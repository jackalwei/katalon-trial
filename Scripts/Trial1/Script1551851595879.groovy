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

WebUI.openBrowser('https://www.tg9demo.com/#/home')

WebUI.click(findTestObject('Page_TG/pop_up_dialog_delete'))

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_TG/input_login_password'), 0)

WebUI.setText(findTestObject('Page_TG/input_login_username'), 'Test 1234')

WebUI.setText(findTestObject('Page_TG/input_login_password'), 'Password 5678')

WebUI.click(findTestObject('Page_TG/login_btn'))

WebUI.waitForElementPresent(findTestObject('Page_TG/p_'), 10)

WebUI.delay(5)

WebUI.closeBrowser()