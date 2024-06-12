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

WebUI.navigateToUrl('https://mkuniversity.ac.in/new/')

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/img_Toggle navigation_img-circle img-responsive'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Academics'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_Examination'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Library'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Madurai Kamaraj University Library/a_Photo Gallery'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Madurai Kamaraj University Library/img'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Album - Madurai Kamaraj University Library/a_Events'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Album - Madurai Kamaraj University Library/div_12345678910111213141516171819202122232425'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Album - Madurai Kamaraj University Library/a_Books'))

WebUI.click(findTestObject('Object Repository/MKU TEST1/Page_Books - Madurai Kamaraj University Library/td_Tamil'))

