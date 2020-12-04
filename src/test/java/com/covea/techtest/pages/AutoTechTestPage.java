package com.covea.techtest.pages;

import com.covea.techtest.baseClasses.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoTechTestPage extends Base {
    public AutoTechTestPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.CSS, using = "a[title=\"Get Quote\"]")
    public WebElement btnStartGetQuote;

    @FindBy(how = How.ID, using = "dd0f1581-3d6d-42bf-a7b8-d2a414fe1b7b")
    public WebElement inputEmailAddress;

    @FindBy(how = How.CSS, using = "#container-dd0f1581-3d6d-42bf-a7b8-d2a414fe1b7b .field-validation-error")
    public WebElement errorEmailAddressValidationError;

    @FindBy(how = How.ID, using = "b0e51f84-c91f-4478-ae33-7e8ba198536c")
    public WebElement inputConfirmEmailAddress;

    @FindBy(how = How.CSS, using = "#container-b0e51f84-c91f-4478-ae33-7e8ba198536c .field-validation-error")
    public WebElement errorConfirmEmailAddressValidationError;

    @FindBy(how = How.ID, using = "dd0f1581-3d6d-42bf-a7b8-d2a414fe1b7b")
    public WebElement inputTelephoneNumber;

    @FindBy(how = How.XPATH, using = "(//input[contains(@class,\"dd form-control\")])[1]")
    public WebElement inputDayofDOBMainApplicant;

    @FindBy(how = How.XPATH, using = "(//input[contains(@class,\"mm form-control\")])[1]")
    public WebElement inputMonthofDOBMainApplicant;

    @FindBy(how = How.XPATH, using = "(//input[contains(@class,\"yyyy form-control\")])[1]")
    public WebElement inputYearofDOBMainApplicant;

    @FindBy(how = How.CSS, using = "#container-7c85c4e9-c2fb-4743-8caf-28d1ed31b44b div[class=\"validation-message date\"]")
    public WebElement errorDateUnacceptableMessage;


    public void enterEmailAddressAndClickOnConfirmEmailAddress(String emailAddress) {
        waitForPageToLoad();
        waitForElementToBeClickable(inputEmailAddress);
        inputEmailAddress.sendKeys(emailAddress);
        inputConfirmEmailAddress.click();
    }

    public void enterConfirmEmailAddressAndClickOnConfirmEmailAddress(String confirmEmailValue) {
        waitForPageToLoad();
        waitForElementToBeClickable(inputConfirmEmailAddress);
        inputConfirmEmailAddress.sendKeys(confirmEmailValue);
        inputTelephoneNumber.click();
    }

    public void enterDayMonthYearInRespectiveFieldAndSelectNextField(int day, int month, int year) {
        waitForPageToLoad();
        waitForElementToBeClickable(inputDayofDOBMainApplicant);
        inputDayofDOBMainApplicant.sendKeys(Integer.toString(day));
        inputMonthofDOBMainApplicant.sendKeys(Integer.toString(month));
        inputYearofDOBMainApplicant.sendKeys(Integer.toString(year));
        inputTelephoneNumber.click();
    }
}
