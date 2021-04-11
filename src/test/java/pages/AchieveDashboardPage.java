package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AchieveDashboardPage {
    public AchieveDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//button[@class='navbar-toggler collapsed'])[1]")
    public WebElement menu;


    @FindBy(xpath = "(//*[.='Partners'])[2]")
    public WebElement partners;


    @FindBy(xpath = "//*[@class='post-list-img img-fluid']")
    public WebElement partnersLogos;


    @FindBy(xpath= "(//*[.='Center for College & Career Readiness'])[2]")
    public WebElement partners1stName;


    @FindBy(xpath = "//h3[.='EDU, Inc.']")
    public WebElement EDUIncName;

    @FindBy(xpath = "//h3[.='MetaMetrics']")
    public WebElement MetaMetricsName;

    @FindBy(xpath = "//h3[.='Successful Practices Network']")
    public WebElement SPN_Name;


    @FindBy(xpath = "//h3[.='NWEA']")
    public WebElement NWEA_Name;

    @FindBy(xpath = "//h3[.='Teach For America']")
    public WebElement TFA_Name;

    @FindBy(xpath = "//h3[.='Education Elements']")
    public WebElement Ed_Els_Name;

    @FindBy(xpath = "//h3[.='Microsoft Education Partner']")
    public WebElement MEP_Name;

    @FindBy(xpath = "//h3[.='International Literacy Association']")
    public WebElement ILA_Name;

    @FindBy(xpath = "//h3[.='ClassLink']")
    public WebElement ClassLink_Name;

    @FindBy(xpath = "//h3[.='IMS Global']")
    public WebElement IMS_Global_Name;



    @FindBy(xpath = "(//div[@class='rich-text'])[3]")
    public WebElement cccText;

    @FindBy(xpath = "(//div[@class='rich-text'])[4]")
    public WebElement eduText;

    @FindBy(xpath = "(//div[@class='rich-text'])[5]")
    public WebElement metaMetricsText;

    @FindBy(xpath = "(//div[@class='rich-text'])[6]")
    public WebElement spnText;

    @FindBy(xpath = "(//div[@class='rich-text'])[7]")
    public WebElement nweaText;

    @FindBy(xpath = "(//div[@class='rich-text'])[8]")
    public WebElement TeachForAText;

    @FindBy(xpath = "(//div[@class='rich-text'])[9]")
    public WebElement EEText;

    @FindBy(xpath = "(//div[@class='rich-text'])[10]")
    public WebElement MEPText;

    @FindBy(xpath = "(//div[@class='rich-text'])[11]")
    public WebElement ILAText;

    @FindBy(xpath = "(//div[@class='rich-text'])[12]")
    public WebElement classLinkText;

    @FindBy(xpath = "(//div[@class='rich-text'])[13]")
    public WebElement imsGlobalText;







}

