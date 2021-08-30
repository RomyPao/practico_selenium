import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ejercicio_10 {
    @Test
    public void searchInGoogle() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement search = driver.findElement(By.name("q"));

        WebDriverWait wait = new WebDriverWait(driver, 40);

        search.sendKeys("WebElement");

        WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//ul[@role='listbox']/li)[1]")));
        ele.click();
    }
}