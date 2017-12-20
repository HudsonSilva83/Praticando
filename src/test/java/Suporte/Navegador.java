package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by hudson on 17/12/2017.
 */
public class Navegador {

    public static final String USERNAME = "hudsonsilva2";
    public static final String AUTOMATE_KEY = "yq3vyB27y97aaqUKnXJ7";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver InciarNavegador(){

        System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://www.google.com.br");


        return navegador;
    }


    public static WebDriver createBrowserStack(){

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "7");
        caps.setCapability("resolution", "1024x768");

        WebDriver navegador = null;
        try {
            navegador = new RemoteWebDriver( new URL(URL), caps);

            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            navegador.get("https://www.google.com.br");

        } catch (MalformedURLException e) {
           System.out.println("Houveram  probemas com a url " + e.getMessage());
        }


        return navegador;

    }
}
