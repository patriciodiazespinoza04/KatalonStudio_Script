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

//***********************************************************************
mydate = new Date()

formattedDate_Inicio = mydate.format('dd/MM/yyyy')

use(TimeCategory, {
		today = new Date()

		NextYear = (today + 2.year)
	})

formattedDate_Fin = NextYear.format('dd/MM/yyyy')

//***********************************************************************
WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.bnamericas.com/manager/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz@bnamericas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'kjblLDGyaYt8RhZtaCIlLQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Cuentas'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Agregar_Cuenta'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Name_Company'),'Empresa Automatizada ' + RandomStringUtils.randomNumeric(5))

//***********************************************************************************************************************
Random rnd = new Random()
 
randomNumber = (10000000 + rnd.nextInt(99999999))
 
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/ID_Sap'), String.valueOf(randomNumber))
 
//***********************************************************************************************************************
 
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Facturacion'), 'string:OLD_BNA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Ejecutivo'), 'string:_rosbelys.rondon@testbnamericas.test_', true)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Razon_Social'),'Razon Social Automatizada ' + RandomStringUtils.randomNumeric(5))

//***********************************************************************************************************************

int optionListLength = 249
Random rand = new Random()
int index = rand.nextInt(optionListLength + 1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_BNamericas - Manager/Pais_Company'), index)

//***********************************************************************************************************************

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Email_Primary_Contact'),'patricio_diaz_espinoza@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Name_Primary_Contact'),'Patricio Diaz')

//***********************************************************************************************************************

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Idioma_Primary_Contact'), 'es', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Idioma_Primary_Contact'), 'en', true)

//***********************************************************************************************************************