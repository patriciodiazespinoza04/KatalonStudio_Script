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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import groovy.time.TimeCategory as TimeCategory
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

// INGRESO A MANAGER
WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.bnamericas.com/manager/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz@bnamericas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'kjblLDGyaYt8RhZtaCIlLQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.delay(5)

// SE SELECCIONA EL TAB ACCOUNT
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Cuentas'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Search_Account'), ACCOUNT_NAME)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas - Manager/Search_Account'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/select_Usuarios'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/button_Edit_Account'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Account_Name'), 'Salesforce Automatizado Editado ' + RandomStringUtils.randomNumeric(5))

/*
WebUI.delay(1)

//***********************************************************************************************************************
Random rnd = new Random()
   
randomNumber = (10000000 + rnd.nextInt(99999999))
   
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Account_Number'), String.valueOf(randomNumber))

//***********************************************************************************************************************
*/

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Bill_Source'), 'string:FREE', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Account_Save_Button'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/button_Consult'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/button_Edit_Contract'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Active_Contract'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Type'), 'string:RENEWAL', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/button_Save_Edit_Contract'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_User'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/button_Edit_User'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Name'), 'Patricio_2')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Last_Name'), 'Diaz_2')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/Edit_Email'), 'patricio.diaz.espinoza.2@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager - Editar/button_Save_Edit_User'))

WebUI.delay(5)

WebUI.closeBrowser()