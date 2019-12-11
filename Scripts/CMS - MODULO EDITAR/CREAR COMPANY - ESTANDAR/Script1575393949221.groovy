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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Company'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/a_Nuevo Company'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas/select_Idioma'), 'string:es', true)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Titulo_Company'), 'Titulo Compañia Automatizacion ' + 
    RandomStringUtils.randomNumeric(5))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Agregar URL'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Titulo_Comercial_Company'), 'Titulo Comercial de Compañia Automatizacion ' + 
    RandomStringUtils.randomNumeric(5))

// DESCRIPCION DE COMPAÑIA
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/p_Prueba de Froala automatizada'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Resumen de Froala automatizada'), 
    'Descripcion de la compañia de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/ZG_Chile'), 'Chile')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas/ZG_Chile'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Guardar_Borrador'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Informacion_Contacto'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas/select_Tipo_Contacto'), 'string:EMAIL', true)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email'), 'patricio.diaz@bnamericas.com')

WebUI.delay(1)

// INICIO AGREGAR FUENTE CONTACTO
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar fuentes_Contenido'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Agregar URL_Contacto'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

// FIN AGREGAR FUENTE CONTACTO
WebUI.delay(1)

// SE SELECCIONA LA PESTAÑA "CONTENIDO RELACIONADO Y TEMAS"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Relacionar_Company'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'Citibank N.A., Sucursal Ecuador')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Company test OFG Principal_control__indicator'))
//WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Check_Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Relacionar_Company'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Compaa del entrevistado                                                                            Noticia relacionada a una Compaa'), 
    'string:COMPANY_SHAREHOLDER', true)

WebUI.delay(1)

// INICIO AGREGAR FUENTE CONTENIDO

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/button_Agregar fuentes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/a_Agregar URL'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/input_URL_resource-url'), 'https://www.bnamericas.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/textarea_Descripcin_text'), 'Descripcion')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'),
	0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/button_Agregar'))

// FIN AGREGAR FUENTE CONTENIDO

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar personas'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), PERSON)
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), 'rogelio sanchez martinez')
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse'), 'rogelio sanchez martinez')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Rogelio Snchez Martnez_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar persona                                                Relacionar 1 personas'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Persona_Tipo de Relacion'), 
    'string:COMPANY_POSITION_MANAGEMENT', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Proyectos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar proyectos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar proyectos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), 
    'Minera Capela (ex Rey de Plata)')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Planta De Reciclaje De Solventes Y Produccin De Combustible Alternativo Lquido Y Slido_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar proyecto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/a_Rol_dropdownMenuButton-0'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/a_Rol_dropdownMenuButton-0'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/Buscar_Fuentes'))
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/Buscar_Fuentes'),'Fiscalizador')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/div_-_control__indicator custom_control_indicator'))

WebUI.delay(1)

// AGREGAR DETALLE DEL ROL

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Nuevo proyecto/Agregar_Detalle_Rol'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/p_1'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Detalle del rol en Spanish'),
	'Detalle del rol en Spanish')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/button_Traducir al                        Ingls'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/button_Guardar'))

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

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'), 'Michael Chu')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Michael Chu es designado consejero suplente de mexicano Grupo Compartamos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticia                                                Relacionar 1 noticias'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Noticias_Tipo de Relacion'), 
    'string:ARTICLE_COMPANY_INTERVIEWED', true)

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Hitos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Hitos'), 'Big River Gold')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Seleccione_Hito'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Set De Datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar set de datos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), DATASET)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Tarifas de gas natural residencial en Colombia_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar set de datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Propiedades_Modulo Proyecto'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Energa Elctrica_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Infraestructura_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Minera y Metales_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Petrleo y Gas_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Petroqumicos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Aguas y Residuos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Banca_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_TIC_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Compaas - Editar Compaa/div_Seguros_control__indicator'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias/Fecha_Publicacion'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Periodo de Actualizacion'), 
    'string:ANNUAL', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/label_Company Estandar'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traduccion'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Company_Traducir a Ingles'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Publicar'))

WebUI.delay(10)

WebUI.closeBrowser()