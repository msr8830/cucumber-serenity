package homepage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageTest {

    @Steps
    HomePage homePage;

    @When("Filter panel loads all items")
    public void filter_panel_loads_all_items() {
        assertThat(homePage.filterDisplayed()).isEqualTo(true);
    }
}
