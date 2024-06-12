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

WebUI.navigateToUrl('https://www.bdu.ac.in/')

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_Official Website of Bharathidasan Univ_f3d32a/button_New_btn-close'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_Official Website of Bharathidasan Univ_f3d32a/a'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_Official Website of Bharathidasan Univ_f3d32a/button_New_btn-close'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_Official Website of Bharathidasan Univ_f3d32a/a_Alumni'))

WebUI.switchToWindowTitle('BDU Alumni Association')

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/button_BDU Alumni Portal_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/a_Home'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/button_BDU Alumni Portal_navbar-toggler'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/a_Gallery'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/p_Ambulance Donated by Bharathidasan Univer_afd64d'))

WebUI.click(findTestObject('Object Repository/BHARTHI/Page_BDU Alumni Association/img_About Bharathidasan University Alumni A_e84b88'))

