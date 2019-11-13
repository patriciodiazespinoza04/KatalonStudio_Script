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

//***********************************************************************
mydate = new Date()

formattedDate_Inicio = mydate.format('dd/MM/yyyy')

use(TimeCategory, { 
        today = new Date()

        NextYear = (today + 1.year)
    })

formattedDate_Fin = NextYear.format('dd/MM/yyyy')

//***********************************************************************
WebUI.openBrowser('')

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Agregar_URL'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Prueba de Froala automatizada'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Resumen de Froala automatizada'), 
    'Resumen de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Estado del Proyecto'), 
    'string:ACTIVE', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Tipo de Propiedad'), 
    'string:PRIVATE', true)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/i_Guardar y enviar_fas fa-save'))

WebUI.delay(3)

//SE SELECCIONA LA PESTAÑA "ETAPA"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Agregar_Etapa'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Etapa'), 
    'string:TENDERING', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Calendario_Inicio'), formattedDate_Inicio)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Calendario_Termino'), formattedDate_Fin)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Actual'))

WebUI.delay(1)

//SE SELECCIONA LA PESTAÑA "CONTENIDO RELACIONADO Y TEMAS"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Proyectos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar proyectos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar proyectos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'),
	'minera')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Planta De Reciclaje De Solventes Y Produccin De Combustible Alternativo Lquido Y Slido_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar proyecto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Hitos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/Buscar_Hitos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/Buscar_Hitos'), 'Descripcion de la tabla')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/Seleccione_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Company'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Relacionar_Company'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'test')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Check_Button_Company'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Relacionar_Company'))

WebUI.delay(1)




WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Temas'))

WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Noticias'))

WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Reportes'))

WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Set De Datos'))

WebUI.delay(1)



WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Personas'))

WebUI.delay(1)