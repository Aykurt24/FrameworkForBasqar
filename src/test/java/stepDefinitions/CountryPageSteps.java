package stepDefinitions;

import POM.BaseClass;
import POM.CountryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CountryPageSteps {

    CountryPage countryPage = new CountryPage();
    BaseClass baseClass = new BaseClass();

    @Then("^Navigate to country page$")
    public void navigateToCountryPage() {

        countryPage.clickOnElement("Setup");
        countryPage.clickOnElement("Parameters");
        countryPage.clickOnElement("Countries");


    }

    @And("^Add the new country and delete the country$")
    public void addTheNewCountryAndDeleteTheCountry() {
        countryPage.clickOnElement("Add");
        countryPage.SendKeysToElement("Name","SOMECOUNTRY");
        countryPage.SendKeysToElement("Code","2345623131");
        countryPage.clickOnElement("Save");
        baseClass.waiting(2000);
        countryPage.clickOnElement("Delete");
        countryPage.clickOnElement("Yes");

    }
}
