package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by hudson on 17/12/2017.
 */
public class FormularioLogarPage extends BasePage{

    public FormularioLogarPage(WebDriver navegador) {
        super(navegador);
    }

    public FormularioLogarPage digitarEmail(String Email){

        navegador.findElement(By.id("identifierId")).sendKeys(Email);
        navegador.findElement(By.className("CwaK9")).click();
        return this;

    }

    public AcessarGmailPage digitarSenha(String senha){
        navegador.findElement(By.name("password")).sendKeys(senha);
        navegador.findElement(By.xpath("//div[@class=\"OZliR\"]//div[@role=\"button\"]")).click();

        return new AcessarGmailPage(navegador);
    }
}
