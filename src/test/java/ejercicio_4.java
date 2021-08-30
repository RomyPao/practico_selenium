import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio_4 {
    @Test
    public void bbcMundoLinks() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de links en el sitio son: " + listaLinks.size());
        System.out.println("----> LINKS <----");
        for (WebElement links : listaLinks) {
            if (links.getText().isEmpty() == false) {
                System.out.println("* " + links.getText());
            }
        }
        driver.quit();
    }
}
