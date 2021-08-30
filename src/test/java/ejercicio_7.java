import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ejercicio_7 {

    @Test
    public void getWindowsSizeTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //ver tamaño
        System.out.println(driver.manage().window().getSize());

        //setear un nuevo tamaño
        Dimension tamaño = new Dimension(1024, 768);
        driver.manage().window().setSize(tamaño);

        System.out.println(driver.manage().window().getSize());
        driver.quit();
    }
}
