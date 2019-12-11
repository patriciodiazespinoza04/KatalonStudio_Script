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

WebUI.navigateToUrl('https://qa.bnamericas.com/cms/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz@bnamericas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'kjblLDGyaYt8RhZtaCIlLQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_BNamericas/i_Cargando_fal fa-marker'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_BNamericas/i_Cargando_fal fa-marker'), 0)

//WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/i_Cargando_fal fa-marker'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Hitos'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Nuevo Hito'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Idioma'), 
    'string:es', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias/select_Tipo de Hito'), 'string:COST_OVERRUN', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Agregar_URL'))

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
    'Descripcion corta de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Fecha_Del_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/i_Guardar y enviar_fas fa-save'))

WebUI.delay(2)

//SE SELECCIONA LA PESTAÑA "CONTENIDO RELACIONADO Y TEMAS"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Contenido_Relacionado_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Proyectos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar proyectos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar proyectos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), PROJECT)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Planta De Reciclaje De Solventes Y Produccin De Combustible Alternativo Lquido Y Slido_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar proyecto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Noticias'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticias'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'), 'Michael Chu')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Michael Chu es designado consejero suplente de mexicano Grupo Compartamos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticia                                                Relacionar 1 noticias'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Hitos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'), 'Big River Gold')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Seleccione_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Company'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Relacionar_Company'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'Citibank N.A., Sucursal Ecuador')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Company test OFG Principal_control__indicator'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/span_Relacionar compaa'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar personas'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), PERSON)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Rogelio Snchez Martnez_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar persona                                                Relacionar 1 personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Reportes'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar reportes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar reportes_form'), REPORT)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Minera proyecciones de gasto de capital para 2019_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar reporte'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Set De Datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar set de datos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), DATASET)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Tarifas de gas natural residencial en Colombia_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar set de datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_-_control__indicator custom_control_indicator_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Propiedades'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Energa Elctrica_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Infraestructura_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Minera y Metales_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Petrleo y Gas_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Petroqumicos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Aguas y Residuos_control__indicator'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Fecha de publicacin_form-control w-260px mt-3 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Periodo de Actualizacion'), 
    'string:ANNUAL', true)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/label_Perfil Estandar'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Traduccion'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Traducir a Ingles'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Publicar'))

WebUI.delay(10)

WebUI.closeBrowser()