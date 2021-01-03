import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    public void foo_1(){
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
    }

    @Test(priority = 2)
    public void foo_2(){
        System.out.println(driver.getCurrentUrl());
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
