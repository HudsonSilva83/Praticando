package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by hudson on 17/12/2017.
 */
public class Navegador {

    public static WebDriver InciarNavegador(){

        System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("https://www.google.com.br");
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return navegador;
    }
}
