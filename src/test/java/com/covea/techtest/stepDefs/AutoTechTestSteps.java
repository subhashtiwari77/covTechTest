package com.covea.techtest.stepDefs;

import com.covea.techtest.baseClasses.ConfigReader;
import com.covea.techtest.baseClasses.WebDriverIntializer;
import com.covea.techtest.pages.AutoTechTestPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.*;

public class AutoTechTestSteps {
    ConfigReader configReader = new ConfigReader("test.properties");
    WebDriver driver = WebDriverIntializer.getDriver(configReader.getProperty("Browser"));
    AutoTechTestPage autoTechTestPage = new AutoTechTestPage(driver);

    @Given("the user is on the quote page")
    public void theUserIsOnTheQuotePage() {
        autoTechTestPage.loadPageMaximized(configReader.getProperty("testurl"));
        autoTechTestPage.btnStartGetQuote.click();
    }


    @When("an invalid email address is entered : {string}")
    public void anInvalidEmailAddressIsEntered(String invalidEmail) {
        autoTechTestPage.enterEmailAddressAndClickOnConfirmEmailAddress(invalidEmail);
    }

    @When("an valid email address is entered : {string}")
    public void anValidEmailAddressIsEntered(String validEmail) {
        autoTechTestPage.enterEmailAddressAndClickOnConfirmEmailAddress(validEmail);
    }

    @And("a different valid confirm email address is entered : {string}")
    public void aDifferentValidConfirmEmailAddressIsEntered(String confirmEmailValue) {
        autoTechTestPage.enterConfirmEmailAddressAndClickOnConfirmEmailAddress(confirmEmailValue);
    }

    @When("an date of birth is entered : {string}, {string}, {string}")
    public void anDateOfBirthIsEntered(String day, String month, String year) {
        int dayOfDOB = parseInt(day);
        int monthOfDOB = parseInt(month);
        int yearOfDOB = parseInt(year);
        autoTechTestPage.enterDayMonthYearInRespectiveFieldAndSelectNextField(dayOfDOB, monthOfDOB, yearOfDOB);
    }

    @Then("an error is displayed")
    public void anErrorIsDisplayed() {
        assertTrue("The validation error message for invalid email is not displayed", autoTechTestPage.errorEmailAddressValidationError.isDisplayed());
        assertTrue("The validation error message for invalid email is not as expected", autoTechTestPage.errorEmailAddressValidationError.getText().equalsIgnoreCase("Email Address:"));
    }

    @Then("no error is displayed")
    public void noErrorIsDisplayed() {
        try{
            assertFalse("The validation error for invalid email is displayed", autoTechTestPage.errorEmailAddressValidationError.isDisplayed());
        } catch (Exception e){
            assertTrue("UNEXPECTED Exception" + e.getMessage(),e.getMessage().contains("Unable to locate element"));
        }
    }

    @Then("an error is displayed for email not matching")
    public void anErrorIsDisplayedForEmailNotMatching() {
        assertTrue("The validation error message for not matching confirm email value is not displayed", autoTechTestPage.errorConfirmEmailAddressValidationError.isDisplayed());
        assertTrue("The validation error message for not matching confirm email value is not as expected", autoTechTestPage.errorConfirmEmailAddressValidationError.getText().equalsIgnoreCase("Confirm Email Address: does not match"));
    }

    @Then("no error is displayed for email not matching")
    public void noErrorIsDisplayedForEmailNotMatching() {
        try{
            assertFalse("The validation error message for not matching confirm email value is displayed", autoTechTestPage.errorConfirmEmailAddressValidationError.isDisplayed());
        } catch (Exception e){
            assertTrue("UNEXPECTED Exception" + e.getMessage(),e.getMessage().contains("Unable to locate element"));
        }
    }

    @Then("an error is displayed for invalid date of birth")
    public void anErrorIsDisplayedForInvalidDateOfBirth() {
        assertTrue("The validation error message for unacceptable date is not displayed", autoTechTestPage.errorDateUnacceptableMessage.isDisplayed());
        assertTrue("The validation error message for unacceptable date is not as expected", autoTechTestPage.errorDateUnacceptableMessage.getText().equalsIgnoreCase("This policy is only available for people aged between 18 and 70"));
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
