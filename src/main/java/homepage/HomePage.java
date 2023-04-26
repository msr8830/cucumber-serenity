package homepage;

import common.Base;
import net.thucydides.core.annotations.Step;

public class HomePage extends Base {
    HomePageElements homePageElements;

    @Step("Get the title of the page")
    public String getTitle() {
        waitForVisibilityOfElement(homePageElements.getHomePageHeading());
        return getDriver().getTitle();
    }

    @Step("The filter module includes filter")
    public boolean filterDisplayed() {
        waitForVisibilityOfElement(homePageElements.getChannelFilter());
        return homePageElements.getChannelFilter().isDisplayed();
    }
}

