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

WebUI.navigateToUrl('https://www.booking.com/index.pt-br.html?label=gen173nr-1BCAEoggI46AdIM1gEaCCIAQGYAS24ARfIAQzYAQHoAQGIAgGoAgO4Au2F-7EGwAIB0gIkMjlhOGQyNzUtOTFhZC00ODY2LWFmZTAtNzA1NjhmOWU1NGJl2AIF4AIB&sid=eba077cb2217dd6c7127194e4cf64dab&keep_landing=1&sb_price_type=total&')

WebUI.setText(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/input_Encontre sua prxima estadia_ss'), 
    'São Paulo')

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/div_Salvador'))

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/span_25'))

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/span_1'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/svg'))

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/svg_1'))

WebUI.click(findTestObject('Object Repository/Page_Booking.com  Site oficial  Os melhores_fc08cd/span_Pesquisar'))

WebUI.closeBrowser()

