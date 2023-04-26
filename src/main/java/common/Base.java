package common;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Base extends PageObject {

    public void waitForVisibilityOfElement(WebElementFacade element) {
        waitForCondition().until(visibilityOf(element));
    }

    public void clickByJavaExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public String decodeStringBase64(String password)
    {
        byte[] decodedString = Base64.decodeBase64(password);
        return(new String(decodedString));
    }

    public void waitUntilClickAble(WebElementFacade element) {
        waitForCondition().until(elementToBeClickable(element));
    }
}

