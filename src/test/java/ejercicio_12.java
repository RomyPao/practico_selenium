import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio_12 {

    @Test
    public void facebookPageTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de div en el sitio son: " + listaDiv.size());

        System.out.println("************************************************");

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de links en el sitio son: " + listaLinks.size());
        System.out.println("----> LINKS <----");
        for (WebElement links : listaLinks) {
            if (links.getText().isEmpty() == false) {
                System.out.println("* " + links.getText());
            }
        }

        System.out.println("************************************************");

        List<WebElement> listaButtons = driver.findElements(By.tagName("button"));
        System.out.println("La cantidad de botones en el sitio son: " + listaButtons.size());
        for (WebElement buttons : listaButtons) {
            System.out.println("* " + buttons.getText());
        }
        driver.quit();
    }
}
