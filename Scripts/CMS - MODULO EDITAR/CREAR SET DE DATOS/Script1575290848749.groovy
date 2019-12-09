import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Set_De_Datos'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/a_Nuevo Data'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/select_Selecciona Idioma'),
	'string:es', true)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Set De Datos/input_Data_title'), 'Titulo Set de Datos Automatizacion ' +
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
	'Descripcion de Froala automatizada ' + RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Set De Datos/input_Fuente'), 'Ingreso de Fuente automatizada ' +
	RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/div_Regin pas o localidad'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/ZG_Chile'), 'Chile')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas/ZG_Chile'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

//SE SELECCIONA LA PESTAÑA "SET DE DATOS"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Cargar_Archivo'), 'C:\\File\\Oil Production Venezuela esp.csv')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Guardar_Borrador'))

WebUI.delay(3)

//SE SELECCIONA LA PESTAÑA "INSIGHTS"
WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Contenido_Relacionado_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Agregar_Insight'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Set De Datos/input_Insight_Title'), 'Titulo Insight automatizada ' +
	RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

WebUI.scrollToPosition(50, 50)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Eje_X'), 'string:mes', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Eje_Y'), 'string:a_o', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Set De Datos/select_Serie'), 'string:mes',
	true)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/button_Agregar_Condicion'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Condicion_A'), 'string:tipo_de_fuente',
	true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Condicion_B'), 'string:Fuente secundaria',
	true)

//string:Fuente directa
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

//SE SELECCIONA LA PESTAÑA "CONTENIDO RELACIONADO Y TEMAS"
WebUI.click(findTestObject('Page_BNamericas - Set De Datos/Contenido_Relacionado_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Noticias'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticias'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'))

//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'), NOTICIA)
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar noticias'),'Michael Chu')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Michael Chu es designado consejero suplente de mexicano Grupo Compartamos_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar noticia                                                Relacionar 1 noticias'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Proyectos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar proyectos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar proyectos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), PROJECT)
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar proyectos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'),'minera')

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

//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), COMPANY)
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Buscar_Company'), 'Citibank N.A., Sucursal Ecuador')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/div_Company test OFG Principal_control__indicator'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Proyecto - Editar/span_Relacionar compaa'))

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
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar personas_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'),'rogelio sanchez martinez')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Rogelio Snchez Martnez_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar persona                                                Relacionar 1 personas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Reportes'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar reportes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar reportes_form'), REPORT)
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar reportes_form'),'mineria')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Minera proyecciones de gasto de capital para 2019_control__indicator'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar reporte'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Set De Datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Relacionar set de datos'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'), DATASET)
//WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Relacionar set de datos_form-control border-right-0 ng-pristine ng-untouched ng-valid ng-empty'),'gas')

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_Tarifas de gas natural residencial en Colombia_control__indicator'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_Relacionar set de datos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/a_Temas'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/span_'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/div_-_control__indicator custom_control_indicator_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Propiedades'))

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

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/input_Fecha de publicacin_form-control w-260px mt-3 ng-pristine ng-untouched ng-valid ng-empty'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas/Dia_Actual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/select_Periodo de Actualizacion'),
	'string:ANNUAL', true)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Set De Datos/Traduccion'))

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Editar Noticia/button_Traducir a Espaol'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Noticias - Nuevo artculo/Boton_Publicar'))

WebUI.delay(10)

WebUI.closeBrowser()