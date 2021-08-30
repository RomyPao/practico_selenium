import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ejercicio_6 {

    @Test
    public void spotifyTitleTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com");

        if (driver.getTitle().equals("Escuchar es todo - Spotify")) {
            System.out.println("Test Passed!!");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}



  /*  @Test
    public void spotifyTitleTest() {
        String URL_Spotify = "https://www.spotify.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL_Spotify);
        String titulo =driver.getTitle();
        System.out.println("Título de la pagina: " + titulo);
        if (titulo == "Escuchar es todo - Spotify"){
            System.out.println("Test Passed!!");
        } else {

            System.out.println("Test Failed");
        }

    }*/