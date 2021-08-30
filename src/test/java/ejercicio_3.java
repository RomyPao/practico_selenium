import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio_3 {

    @Test
    public void bbcMundTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        System.out.println("************************************");

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de H1 en el sitio son: " + listaH1.size());
        System.out.println("----> ELEMENTOS H1 <----");
        for (WebElement elementoH1 : listaH1) {
            System.out.println(elementoH1.getText());
        }

        System.out.println("************************************");

        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de H2 en el sitio son: " + listaH2.size());
        System.out.println("----> ELEMENTOS H2 <----");
        for (WebElement elementoH2 : listaH2) {
            System.out.println(elementoH2.getText());
        }
        driver.quit();
    }
}

