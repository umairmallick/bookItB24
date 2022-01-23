package com.project.StepDefinitions;

import com.project.Pages.LoginPage;
import com.project.Pages.MapPage;
import com.project.utility.BrowserUtil;
import com.project.utility.ConfigurationReader;
import com.project.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    MapPage mapPage = new MapPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
    loginPage.login(email,password);

    }
    @Then("Home Page should be displayed with {string} heading")
    public void home_page_should_be_displayed_with_heading(String expectedHeading) {
        BrowserUtil.waitFor(5);
        BrowserUtil.verifyElementDisplayed(mapPage.heading);
        Assert.assertEquals(expectedHeading,mapPage.heading.getText());

    }

}
