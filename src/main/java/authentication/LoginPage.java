package authentication;

import common.Base;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.StaleElementReferenceException;

public class LoginPage extends Base {

    LoginPageElements loginPageElements;
    EnvironmentVariables env;

    @Step("Navigate to Microsoft Login Page")
    public void navigateToLoginScreen() {
        open();
        loginPageElements.getSignInButton().shouldBeVisible();
        loginPageElements.getSignInButton().click();
        loginPageElements.getSignInButtonSub().shouldBeVisible();
        loginPageElements.getSignInButtonSub().click();
    }

    @Step("Login with a valid username and a valid password")
    public void login() {
        String user = EnvironmentSpecificConfiguration.from(env).getProperty("username");
        String pass = EnvironmentSpecificConfiguration.from(env).getProperty("password");

        waitForVisibilityOfElement(loginPageElements.getLoginUserNameField());
        loginPageElements.getLoginUserNameField().sendKeys(user);
        loginPageElements.getLoginNextButton().click();
        for(int i = 0; i <= 2; i++){
            try{
                waitForVisibilityOfElement(loginPageElements.getLoginPasswordField());
                break;
            }
            catch(StaleElementReferenceException e){
                System.out.println(e.getMessage());
            }
        }
        loginPageElements.getLoginPasswordField().sendKeys(decodeStringBase64(pass));
        loginPageElements.getLoginSignInButton().click();
        waitForVisibilityOfElement(loginPageElements.getLoginSignInButton());
        loginPageElements.getLoginSignInButton().click();
    }
}