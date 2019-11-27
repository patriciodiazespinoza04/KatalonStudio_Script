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

WebUI.delay(10)

WebUI.click(findTestObject('Page_BNamericas/i_Cargando_fal fa-marker'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Proyectos'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Nuevo Proyecto'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Idioma'), 
    'string:es', true)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Proyecto_PRA'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_Proyecto_title'), 'Titulo Proyecto PRA Automatizacion ' + 
    RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Agregar_URL'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Prueba de Froala automatizada'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Resumen de Froala automatizada'), 
    'Resumen de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Estado del Proyecto'), 
    'string:ACTIVE', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Tipo de Propiedad'), 
    'string:PRIVATE', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Actualizar_Capex'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas/Capex_Tipo_Moneda'), 'string:USD', true)

//**************************************
Random rnd = new Random()
 
randomNumber = (100000 + rnd.nextInt(999999))
 
WebUI.setText(findTestObject('Object Repository/Page_BNamericas/Capex_Inversion'), String.valueOf(randomNumber))
 
//**************************************

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Capex_Fecha_Anuncio'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Capex_Aceptar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Cancelar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Fecha_Inicio_PRA'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Actualizar_Fecha_Termino'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Fecha_Termino_PRA'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Fecha_Anuncio_PRA'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Fecha_Termino_Aceptar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/button_Cancelar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/div_Regin pas o localidad'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/input_Zona geogrfica_input ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'), 
    'Chile')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/input_Zona geogrfica_input ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/p_Texto trabajo principal'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/div_Texto trabajo principal'), 
    'Texto trabajo principal')

WebUI.delay(1)

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Calendario_Inicio'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Calendario_Termino'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'), 'Big River Gold')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Seleccione_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Company'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Relacionar_Company'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'Citibank')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Company test OFG Principal_control__indicator'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/span_Relacionar compaa'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/a_Rol_dropdownMenuButton-0'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/a_Rol_dropdownMenuButton-0'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/div_-_control__indicator custom_control_indicator'))

WebUI.delay(1)

// AGREGAR DETALLE DEL ROL

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Agregar_Detalle_Rol'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/label_Detalle del rol Espaol'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas/p'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/div_Detalle del Rol QA'), 'Detalle del Rol QA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Traducir al                        Ingls'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Guardar'))

// FIN AGREGAR DETALLE

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_-_control__indicator custom_control_indicator_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Noticias'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticias'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'), 
    'michael chu')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Michael Chu es designado consejero suplente de mexicano Grupo Compartamos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticia                                                Relacionar 1 noticias'))

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Tarifas de gas natural residencial en Colombia_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar set de datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar personas'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), 
    'rogelio sanchez martinez')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Rogelio Snchez Martnez_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar persona                                                Relacionar 1 personas'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Persona_Tipo de Relacion_Cargo'), 
    'string:PROJECT_POSITION_IT', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Propiedades_Modulo Proyecto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Energa Elctrica_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Infraestructura_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Minera y Metales_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Petrleo y Gas_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Petroqumicos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Aguas y Residuos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Fecha de publicacin_form-control w-260px mt-3 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Periodo de Actualizacion'), 
    'string:ANNUAL', true)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Traduction'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Traducir a Espaol'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Publicar'))

WebUI.delay(5)

WebUI.closeBrowser()