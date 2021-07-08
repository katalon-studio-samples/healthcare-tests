import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/overlay')

WebDriver webDriver = DriverFactory.getWebDriver();
WebElement hoverElement = WebUIAbstractKeyword.findWebElement(findTestObject('Page_React App/button'))
WebDriverWait wait = new WebDriverWait(webDriver, 30000);
hoverElement = wait.until(ExpectedConditions.elementToBeClickable(hoverElement));

WebUI.click(findTestObject('Page_React App/button'))

WebUI.closeBrowser()

