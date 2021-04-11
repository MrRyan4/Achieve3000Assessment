package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AchieveDashboardPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class AchieveDashboardStepDefinitions {

    AchieveDashboardPage achieveDashboardPage = new AchieveDashboardPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @Given("User is on the website page")
    public void user_is_on_the_website_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website_url"));
        Driver.getDriver().manage().window().maximize();
    }


    @When("User clicks to hamburger menu")
    public void user_clicks_to_hamburger_menu() {

        wait.until(ExpectedConditions.visibilityOf(achieveDashboardPage.menu));
        achieveDashboardPage.menu.click();

    }


    @When("User clicks to Partners")
    public void user_clicks_to_partners() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        achieveDashboardPage.partners.click();

    }


    @Then("User should see all Partners logo, name and some text with description")
    public void user_should_see_all_partners_logo_name_and_some_text_with_description() {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assertion of Paf
        Assert.assertTrue(achieveDashboardPage.partnersLogos.isDisplayed() );


        // Assertion for Partners' name if they are displayed
        Assert.assertEquals("Center for College & Career Readiness", achieveDashboardPage.partners1stName.getText());

        Assert.assertEquals("MetaMetrics", achieveDashboardPage.MetaMetricsName.getText());

        Assert.assertEquals("Successful Practices Network", achieveDashboardPage.SPN_Name.getText());

        Assert.assertEquals("NWEA", achieveDashboardPage.NWEA_Name.getText());

        Assert.assertEquals("Teach For America", achieveDashboardPage.TFA_Name.getText());

        Assert.assertEquals("Education Elements", achieveDashboardPage.Ed_Els_Name.getText());

        Assert.assertEquals("Microsoft Education Partner", achieveDashboardPage.MEP_Name.getText());

        Assert.assertEquals("International Literacy Association", achieveDashboardPage.ILA_Name.getText());

        Assert.assertEquals("ClassLink", achieveDashboardPage.ClassLink_Name.getText());

        Assert.assertEquals("IMS Global", achieveDashboardPage.IMS_Global_Name.getText());


        //Assertion of the partners' text
        Assert.assertTrue(achieveDashboardPage.cccText.isDisplayed());

        Assert.assertTrue(achieveDashboardPage.eduText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.metaMetricsText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.spnText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.nweaText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.TeachForAText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.EEText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.MEPText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.ILAText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.classLinkText.isDisplayed());
        Assert.assertTrue(achieveDashboardPage.imsGlobalText.isDisplayed());

        System.out.println("Yayyyy!!! You have successfully passed all tests :D");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.closeDriver();
    }


}
