
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class test {

    String driverPath = "<path to gecko driver executable>";
    public WebDriver driver;

    @Test
    public void launchBrowser() {
        System.out.println("launching firefox browser");
        //System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
        //just the comment

        driver = new FirefoxDriver();
    }

    @Test
    public void openApplication() {
        driver.navigate().to("http://www.google.com");
    }

    @Test
    public void closeDriver() {
        if(driver!=null) {
            driver.close();
        }
    }

}
