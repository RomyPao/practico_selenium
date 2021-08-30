import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ejercicio_13 {

    @Test
    public void sendKeysToFacebook() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement username = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));

        username.sendKeys("test@test.com");
        password.sendKeys("holamundo");

        loginButton.click();

        driver.quit();
    }
}
