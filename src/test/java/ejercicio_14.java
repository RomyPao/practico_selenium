import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio_14 {

    @Test
    public void netflixTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/ar/");

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de h1 en el sitio son: " + listaH1.size());

        System.out.println("************************************************");

        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de h2 en el sitio son: " + listaH2.size());

        System.out.println("************************************************");

        driver.navigate().refresh();

        List<WebElement> listaButtons = driver.findElements(By.tagName("button"));
        System.out.println("La cantidad de botones en el sitio son: " + listaButtons.size());
        for (WebElement buttons : listaButtons) {
            System.out.println("* " + buttons.getText());
        }

        System.out.println("************************************************");

        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de div en el sitio son: " + listaDiv.size());

        System.out.println("************************************************");

        System.out.println(driver.getTitle());

        System.out.println("************************************************");

        List<WebElement> listaLinks = driver.findElements(By.tagName("link"));
        System.out.println("La cantidad de links en el sitio son: " + listaLinks.size());

        //driver.quit();
    }
}
