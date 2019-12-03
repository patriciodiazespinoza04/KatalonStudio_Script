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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.bnamericas.com/manager/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_BNamericas/a_Traditional login'))

WebUI.setText(findTestObject('Object Repository/Page_BNamericas/input_Email_email'), 'patricio.diaz@bnamericas.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BNamericas/input_Password_password'), 'kjblLDGyaYt8RhZtaCIlLQ==')

WebUI.click(findTestObject('Object Repository/Page_BNamericas/button_Log in'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Usuarios'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Buscar_Usuarios'), 'alejandro.soto')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas - Manager/Buscar_Usuarios'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_BNamericas - Manager/select_Usuarios'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Login_As'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Logout_As'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_BNamericas - Manager/Buscar_Usuarios'), 'alejandro.soto')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Page_BNamericas - Manager/Buscar_Usuarios'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/select_Usuarios'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Login_As'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_BNamericas - Manager/Logout_As'))

WebUI.delay(5)

WebUI.closeBrowser()