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
// INGRESO A SALESFORCE
WebUI.openBrowser('')

WebUI.navigateToUrl('https://cs77.salesforce.com/')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Login_Username'), 'integracion@bnamericas.com.sb5')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SalesForce/Login_Password'), '9JB1vQzOCASYhMFC3fq5xQ==')

WebUI.click(findTestObject('Object Repository/Page_SalesForce/button_Login'))

WebUI.delay(5)

// SE SELECCIONA EL TAB ACCOUNT
WebUI.click(findTestObject('Object Repository/Page_SalesForce/button_Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_SalesForce/button_New'))

WebUI.delay(1)

ValorRandom = RandomStringUtils.randomNumeric(5)

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Account_Name'), 'Salesforce Automatizado ' + ValorRandom)

//***********************************************************************************************************************
Random rnd = new Random()
  
randomNumber = (10000000 + rnd.nextInt(99999999))
  
WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Account_Number'), String.valueOf(randomNumber))

//***********************************************************************************************************************

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Account_WebSite'), 'http://www.bnamericas.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SalesForce/Account_Status'), 'Cuenta Asignada - Ejecutivo', true)

//***********************************************************************************************************************

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_SalesForce/Account_Industry'), 3)

//***********************************************************************************************************************
 
int optionListLength2 = 150
Random rand2 = new Random()
int index2 = rand2.nextInt(optionListLength2 + 1)
 
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_SalesForce/Account_Country'), index2)
 
//***********************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_SalesForce/Account_Button_Save'))

// SE SELECCIONA EL TAB CONTACTS
WebUI.click(findTestObject('Object Repository/Page_SalesForce/button_Contacts'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_SalesForce/button_New'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Contacts_First_Name'), 'Patricio')

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Contacts_Last_Name'), 'Diaz')

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Contacts_Account_Name'), 'Salesforce Automatizado ' + ValorRandom)

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Contacts_Email'), 'patricio.diaz.espinoza@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_SalesForce/Contacts_Phone_Number'), '987654321')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_SalesForce/Contacts_Language'), 'Inglés', true)

WebUI.delay(1)

//***********************************************************************************************************************
 
int optionListLength3 = 150
Random rand3 = new Random()
int index3 = rand3.nextInt(optionListLength3 + 1)
 
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_SalesForce/Contacts_Country'), index3)
 
//***********************************************************************************************************************

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_SalesForce/Contacts_Lead_Source'), 7)

WebUI.click(findTestObject('Object Repository/Page_SalesForce/Account_Button_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

// FIN SALESFORCE

//***********************************************************************************************************************

// INGRESO A MANAGER
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

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Name_Company'), 'Salesforce Automatizado ' + ValorRandom)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/ID_Sap'), String.valueOf(randomNumber))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Facturacion'), 'string:OLD_BNA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Ejecutivo'), 'string:alexander.juarez@bnamericas.com', true)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Razon_Social'),'Razon Social Automatizada ' + RandomStringUtils.randomNumeric(5))

//***********************************************************************************************************************

int optionListLength4 = 200
Random rand4 = new Random()
int index4 = rand4.nextInt(optionListLength4 + 1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_BNamericas - Manager/Pais_Company'), index4)

//***********************************************************************************************************************
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Email_Primary_Contact'), 'patricio.diaz@bnamericas.com')

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Name_Primary_Contact'), 'patricio diaz')

//***********************************************************************************************************************
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Idioma_Primary_Contact'), 'es', true)
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Idioma_Primary_Contact'), 'en', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/button_Add'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Search_Account'), 'Salesforce Automatizado ' + ValorRandom)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas - Manager/Search_Account'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/select_Usuarios'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Add_Contract'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Name_Contract'), 'Contrato Automatizado ' + RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

//***********************************************************************************************************************
Random rnd2 = new Random()
 
randomNumber2 = (10000000 + rnd2.nextInt(99999999))
 
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Billing_Number_Contract'), String.valueOf(randomNumber2))
 
//***********************************************************************************************************************

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Billing_Source_Contract'), 'string:OLD_BNA', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Type'), 'string:SUBSCRIPTION', true)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Max_Users_Contract'), '5')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Start_Date_Contract'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Expiration_Date_Contract'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Active_Contract'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Add_Contract_2'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Name'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/button_Consult'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Add_Users'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/User_Email'), 'patricio.diaz.espinoza@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/User_First_Name'), 'Patricio')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/User_Last_Name'), 'Diaz')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/User_Language'), 'en', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Add_User'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Contract_Add_Bill'))

WebUI.delay(1)

//***********************************************************************************************************************
Random rnd3 = new Random()
  
randomNumber3 = (10000000 + rnd3.nextInt(99999999))
  
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_ID'), String.valueOf(randomNumber3))
  
//***********************************************************************************************************************

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Company_Name'), 'Compañia Bill Automatizado ' + RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Address_1'), 'Los Militares')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Address_2'), '6191')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_City'), 'Las Condes')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Region'), 'Metropolitana')

WebUI.delay(1)

//***********************************************************************************************************************
 
int optionListLength5 = 200
Random rand5 = new Random()
int index5 = rand5.nextInt(optionListLength5 + 1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Country'), index5)

//***********************************************************************************************************************

WebUI.delay(1)

//***********************************************************************************************************************
Random rnd4 = new Random()
   
randomNumber4 = (10000000 + rnd4.nextInt(99999999))
   
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Number'), String.valueOf(randomNumber4))
  
//***********************************************************************************************************************

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Source'), 'string:OLD_BNA', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Dia_Actual'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Add_Item'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Item_Name'), 'Bill Nombre Item Automatizado ' + RandomStringUtils.randomNumeric(5))

WebUI.delay(1)

//***********************************************************************************************************************
Random rnd5 = new Random()
	
randomNumber5 = (10000000 + rnd5.nextInt(99999999))
	
WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Item_Total'), String.valueOf(randomNumber5))
   
//***********************************************************************************************************************
 
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Bill_Add'))