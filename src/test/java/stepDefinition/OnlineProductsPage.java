package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductsPage.click_formalshoesdropdown;
import static pages.OnlineProductsPage.getText_formalshoes_firstvalue;
import static pages.RegistrationPage.visibility_user_registration_page;



public class OnlineProductsPage {

    @When("User clicks on Formal Shoes dropdown")
    public void user_clicks_on_Formal_Shoes_dropdown() throws InterruptedException{
        click_formalshoesdropdown();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_Products() throws InterruptedException{
        getText_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham",getText_formalshoes_firstvalue());
    }

}
