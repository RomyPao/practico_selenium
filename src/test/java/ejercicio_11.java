import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ejercicio_11 {
    @Test
    public void searchInGoogleAndGoBack() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        WebElement search = driver.findElement(By.tagName("input"));
        WebDriverWait wait = new WebDriverWait(driver, 40);

        search.sendKeys("WebElement");
        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//ul[@role='listbox']/li)[1]")));
        ele.click();

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.quit();
    }
}
