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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://thermos.com/')

WebUI.click(findTestObject('Object Repository/Regist_Thermos/Page_Thermos Brand/svg'))

WebUI.setText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Already have an account_customername'), 
    'Azizah Dwi')

WebUI.setText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Already have an account_customeremail'), 
    'az.dwijunia')

WebUI.setText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_concat(id(, , email_99234659, , ))_email'), 
    '')

WebUI.click(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/circle'))

WebUI.setText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Already have an account_customeremail'), 
    'az.dwijuniasari@gmail.com')

WebUI.setText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Already have an account_customerphone'), 
    '087887226212')

WebUI.setEncryptedText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Already have an account_customerpassword'), 
    'X9OPLDrXRdKyTqOTs5fl2A==')

WebUI.setEncryptedText(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/input_Must contain 1 capital letter_custome_851cae'), 
    'X9OPLDrXRdKyTqOTs5fl2A==')

WebUI.click(findTestObject('Object Repository/Regist_Thermos/Page_Create Account  Thermos Brand/button_CREATE AN ACCOUNT'))

WebUI.closeBrowser()

