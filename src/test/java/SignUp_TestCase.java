import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SignUp_TestCase
{
    WebDriver driver;

    @Test
    public void Signup_Testcases()
    {
        Random DropdownSelection = new Random();
        int rdnumber = 0;

        for (int counter = 1; counter <= 1; counter++) {
            rdnumber = DropdownSelection.nextInt(4);
        }
        String intrest="B";

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://register-summits-india.virtual.awsevents.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SignUp_Page sp = new SignUp_Page(driver);
        sp.firstname().sendKeys("Shubham");
        sp.lastname().sendKeys("Talegaonkar");
        sp.country().sendKeys("India");
        sp.city().sendKeys("Mumbai");
        sp.postalcode().sendKeys("401209");
        sp.phone().sendKeys("8888821406");

        if(intrest=="B")
        {
            sp.business().click();
        }
        else
        {
            sp.personal().click();
        }
        sp.title().sendKeys("Software Tester");
        Select SelectJobRole = new Select(sp.jobrole());
        SelectJobRole.selectByIndex(rdnumber);
        sp.companyname().sendKeys("Vernost");
        Select SelectIndustry = new Select(sp.industry());
        SelectIndustry.selectByIndex(rdnumber);

        Select selectCompanyType = new Select(sp.companytype());
        selectCompanyType.selectByIndex(rdnumber);

        Select SelectCompanySize = new Select(sp.companysize());
        SelectCompanySize.selectByIndex(rdnumber);
        sp.companysize();
        Select SelectAwsUsage = new Select(sp.awsusage());
        SelectAwsUsage.selectByIndex(rdnumber);

        Select SelectProjectFrame = new Select(sp.projectframe());
        SelectProjectFrame.selectByIndex(rdnumber);

        Select SelectUseCase = new Select(sp.usecase());
        SelectUseCase.selectByIndex(rdnumber);

        sp.email().sendKeys("Tesing@gmail.com");
        sp.password().sendKeys("Testing@12345");
        sp.repeatpassword().sendKeys("Testing@12345");
        sp.captcha().click();
        sp.register().click();

    }
}
