import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.booking.com/index.pt-br.html?label=gen173nr-1BCAEoggI46AdIM1gEaCCIAQGYAS24ARfIAQzYAQHoAQGIAgGoAgO4AvS2-7EGwAIB0gIkMzhmMTkyM2UtNGJkMi00Nzc1LWFmZjItMjkzYWRkMDg2NmY32AIF4AIB&sid=65683b2ea93f04cc30a93ab5d66762f4&keep_landing=1&sb_price_type=total&')

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/Page_Booking.com  Site oficial  Os melhores_fc08cd/span_Pesquisar'))

WebUI.verifyElementText(findTestObject('Page_Booking.com  Site oficial  Os melhores hotis, voos, aluguis de carro e acomodaes/div_Por favor, insira um destino para comear a pesquisar'), 
    'Por favor, insira um destino para começar a pesquisar.')

