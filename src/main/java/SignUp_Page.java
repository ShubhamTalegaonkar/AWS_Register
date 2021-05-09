import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page
{
    WebDriver driver;
    public SignUp_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//input[@id='firstName']")
    WebElement firstname;
    @FindBy(xpath="//input[@id='lastName']")
    WebElement lastname;
    @FindBy(xpath="//select[@id='country']")
    WebElement country;
    @FindBy(xpath="//input[@id='city']")
    WebElement city;
    @FindBy(xpath= "//input[@id='postalCode']")
    WebElement postalcode;
    @FindBy(xpath= "//input[@id='phone']")
    WebElement phone;
    @FindBy(xpath= "//span[@aria-label='Business']")
    WebElement business;

    @FindBy(xpath= "//span[@aria-label='Personal']")
    WebElement personal;
    @FindBy(xpath= "//textarea[@id='title']")
    WebElement title;
    @FindBy(xpath= "//select[@id='jobRole']")
    WebElement jobrole;


    @FindBy(xpath="//*[@id='company']")
    WebElement companyname;
    @FindBy(xpath= "//select[@id='industry']")
    WebElement industry;
    @FindBy(xpath= "//select[@id='companyType']")
    WebElement companytype;
    @FindBy(xpath= "//select[@id='companySize']")
    WebElement companysize;
    @FindBy(xpath= "//select[@id='awsUsageLevel']")
    WebElement awsusage;
    @FindBy(xpath="//select[@id='projectTimeFrame']")
    WebElement projectframe;
    @FindBy(xpath=  "//select[@id='useCase']")
    WebElement usecase;
    @FindBy(xpath= "//input[@id='email']")
    WebElement email;
    @FindBy(xpath= "//input[@id='password']")
    WebElement password;
    @FindBy(xpath= "//input[@id='repeatPassword']")
    WebElement repeatpassword;
    @FindBy(xpath="//*[@id='recaptcha-anchor']/div[1]")
    WebElement captcha;
    @FindBy(xpath= "//div[@class='jss45']")
    WebElement register;

    public WebElement firstname() {
        return firstname;
    }
    public WebElement lastname() {
        return lastname;
    }
    public WebElement country() {
        return country;
    }
    public WebElement city() {
        return city;
    }
    public WebElement postalcode() {
        return postalcode;
    }
    public WebElement phone() {
        return phone;
    }
    public WebElement business() {
        return business;
    }
    public WebElement personal() {
        return personal;
    }
    public WebElement title() {
        return title;
    }
    public WebElement jobrole() {
        return jobrole;
    }
    public WebElement companyname() {
        return companyname;
    }
    public WebElement industry() {
        return industry;
    }
    public WebElement companytype() {
        return companytype;
    }
    public WebElement companysize() {
        return companysize;
    }
    public WebElement awsusage() {
        return awsusage;
    }
    public WebElement projectframe() {
        return projectframe;
    }
    public WebElement usecase() {
        return usecase;
    }
    public WebElement email() {
        return email;
    }
    public WebElement password() {
        return password;
    }
    public WebElement repeatpassword() {
        return repeatpassword;
    }
    public WebElement captcha() {
        return captcha;
    }
    public WebElement register() {
        return register;
    }
}