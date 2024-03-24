package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {

    @When("User succesfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException{
        sendkeys_username();
        sendkeys_password();
        click_login_btn();


    }
}