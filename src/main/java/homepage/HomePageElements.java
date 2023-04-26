package homepage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class HomePageElements extends UIInteractionSteps {

    WebElementFacade getChannelFilter() {
        return $("[data-key='channels-checkBoxList']");
    }

    WebElementFacade getHomePageHeading() {
        return $(".css-r8yb50");
    }

}
