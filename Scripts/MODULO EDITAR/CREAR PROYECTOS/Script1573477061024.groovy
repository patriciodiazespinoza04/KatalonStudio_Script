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

WebUI.openBrowser('')

//WebUI.navigateToUrl('https://qa.bnamericas.com/access/login;JSESSIONID=18e45aef-7101-485f-8231-1da5550b4396')
WebUI.navigateToUrl('https://qa.bnamericas.com/cms/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz.espinoza@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'Q/1VZRScvPhCtXranT/CyQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.delay(15)

WebUI.click(findTestObject('Page_BNamericas/i_Cargando_fal fa-marker'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Proyectos'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Nuevo Proyecto'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Idioma'), 
    'string:es', true)

//WebUI.click(findTestObject('Object Repository/Page_BNamericas/Proyecto_PRA'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_Proyecto_title'), 'Titulo Proyecto Automatizacion ' + 
    RandomStringUtils.randomNumeric(5))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes'))

//WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Agregar_URL'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

//WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Prueba de Froala automatizada'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Resumen de Froala automatizada'), 
    'Resumen de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_1'))
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Cuerpo de Froala automatizada'), 'Cuerpo de Froala automatizada ' + RandomStringUtils.randomNumeric(5))
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/i_Guardar y enviar_fas fa-save'))

WebUI.delay(3)