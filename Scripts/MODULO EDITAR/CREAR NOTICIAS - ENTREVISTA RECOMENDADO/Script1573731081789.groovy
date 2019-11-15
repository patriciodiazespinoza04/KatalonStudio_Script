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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.bnamericas.com/cms/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz.espinoza@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'Q/1VZRScvPhCtXranT/CyQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/i_Cargando_fal fa-marker'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Noticias'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Nuevo Artculo'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona uno                                    Ingls                                    Espaol'), 
    'string:en', true)

//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Noticia_control__indicator d-inline-block p-relative mr-2'))
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Entrevista_control__indicator d-inline-block p-relative mr-2'))

//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Opinin_control__indicator d-inline-block p-relative mr-2'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Anlisis_control__indicator d-inline-block p-relative mr-2'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Reportaje_control__indicator d-inline-block p-relative mr-2'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Comunicado de Prensa_control__indicator d-inline-block p-relative mr-2'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Columnista Invitado_control__indicator d-inline-block p-relative mr-2'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Native_control__indicator d-inline-block p-relative mr-2'))
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_Ttulo _title'), 'Titulo Noticias Automatizacion ' + 
    RandomStringUtils.randomNumeric(5))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/a_Agregar URL'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

//WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

WebUI.delay(2)

// RESUMEN
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Prueba de Froala automatizada'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Resumen de Froala automatizada'), 
    'Resumen de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

// INTRODUCCION
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_5'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Introduccion QA'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Introduccion qa PADE'), 'Introduccion de Froala automatizada ' + 
    RandomStringUtils.randomNumeric(5))

// CUERPO
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_6'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Cuerpo QA PADE'), 'Cuerpo de Froala automatizada ' + 
    RandomStringUtils.randomNumeric(5))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/i_Guardar y enviar_fas fa-save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Relacionar_Company'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'test')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Check_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Relacionar_Company'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Compaa del entrevistado                                                                            Noticia relacionada a una Compaa'), 
    'string:ARTICLE_COMPANY_INTERVIEWED', true)

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Reportes'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar reportes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar reportes_form'), 
    'mineria')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Minera proyecciones de gasto de capital para 2019_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar reporte'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Set De Datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar set de datos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), 
    'gas')

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'), 
    'gas')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Tarifas de gas natural residencial en Colombia_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar set de datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar personas'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), 
    'rogelio sanchez martinez')

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'), 
    'rogelio sanchez martinez')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Rogelio Snchez Martnez_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar persona                                                Relacionar 1 personas'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Persona_Tipo de Relacion'), 
    'string:ARTICLE_INTERVIEWED', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Hitos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'), 'Descripcion de la tabla')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Seleccione_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Noticias'))

WebUI.delay(1)


WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticias'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'),'chu')

//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'),'rogelio sanchez martinez')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Chu_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticias'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Persona_Tipo de Relacion'),
	'string:ARTICLE_TIMELINE', true)




WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Publicar'))

WebUI.delay(5)

WebUI.closeBrowser()

