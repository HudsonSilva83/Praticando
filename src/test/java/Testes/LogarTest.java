package Testes;

import Page.FormularioLogarPage;
import Page.LogarPage;
import Suporte.Navegador;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
/**
 * Created by hudson on 17/12/2017.
 */

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "LogarTest.csv")
public class LogarTest {
private WebDriver navegador;

    @Before
    public void Setup(){
      //navegador = Navegador.InciarNavegador();
      navegador = Navegador.createBrowserStack();
    }


    @Test
public void Logar(@Param(name="email")String Email,@Param(name="senha") String senha){

        //public void Logar(){
        new LogarPage(navegador)
       .clicarSignIn()
       .digitarEmail(Email)
       .digitarSenha(senha)
       .clicarGmail();

    }

    @After
    public void fechar(){

      navegador.quit();

    }


}
