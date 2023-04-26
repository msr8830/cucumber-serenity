package authentication;

import homepage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest {

    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;

    @Given("I use Valid username and Valid password")
    public void i_use_Valid_and_Valid() {
        loginPage.login();
    }

    @Given("Navigate to sign in screen")
    public void navigate_to_sign_in_screen() {
        loginPage.navigateToLoginScreen();
    }

    @Then("Verify home page is loaded with {string}")
    public void verify_home_page_is_loaded_with(String pageTitle) {
        assertThat(homePage.getTitle()).containsIgnoringCase(pageTitle);
    }
}
