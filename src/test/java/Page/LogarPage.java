package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by hudson on 17/12/2017.
 */
public class LogarPage extends BasePage{


    public LogarPage(WebDriver navegador) {
        super(navegador);
    }

    public FormularioLogarPage clicarSignIn (){
       navegador.findElement(By.id("gb_70")).click();
       navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       return new FormularioLogarPage(navegador);

    }

}
