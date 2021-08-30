import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ejercicio_5 {

    @Test
    public void bbcMundoListas() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        List<WebElement> listaList = driver.findElements(By.tagName("li"));
        System.out.println("La cantidad de listas en el sitio son: " + listaList.size());
        System.out.println("----> LISTAS <----");
        for (WebElement list : listaList) {
            System.out.println("* " + list.getText());//            if (links.getText().isEmpty() == false) {
//                System.out.println("* " + links.getText());
        }
        driver.quit();
    }
}
