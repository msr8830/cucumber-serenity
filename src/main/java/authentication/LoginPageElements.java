package authentication;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginPageElements extends UIInteractionSteps {
    WebElementFacade getLoginNextButton() {
        return $("#idSIButton9");
    }

    WebElementFacade getLoginPasswordField() {
        return $("#i0118");
    }

    WebElementFacade getLoginSignInButton() {
        return $("#idSIButton9");
    }

    WebElementFacade getLoginUserNameField() {
        return $("#i0116");
    }

    WebElementFacade getSignInButton() {
        return $("#menu-button-13");
    }

    WebElementFacade getSignInButtonSub() {
        return $("#menu-list-13-menuitem-14");
    }
}
