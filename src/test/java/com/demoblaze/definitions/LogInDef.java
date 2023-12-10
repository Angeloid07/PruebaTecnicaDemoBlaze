package com.demoblaze.definitions;

import com.demoblaze.steps.Login.LoginStep;
import com.demoblaze.steps.signUp.SignUpStep;
import com.demoblaze.steps.validations.ValidationStep;
import com.demoblaze.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class LogInDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep logIn;

    @Steps(shared = true)
    ValidationStep validate;

    private String username = "angel07";

    @Given("El usuario ingresa al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.demoblaze.com/index.html");
    }

    //Escenario 1

    @When("El usuario ingresa credenciales válidas")
    public void userLogInWithValidateCredentials() {

        logIn.clickLogInForm();
        //Assert.assertTrue(validate.logInLabelIsDisplayed());
        logIn.typeUsername(username);
        logIn.typePassword("hola123");
        logIn.clickSLogInRegister();

    }

    @Then("Deberia de aparecer el nombre del usuario en la barra de navegacino de la pagina")
    public void usernameFound() throws InterruptedException {
        sleep(1000);
        String fullUsername = "Welcome " + username;
        Assert.assertTrue(validate.usernameButtonIsDisplayed(fullUsername));
    }

    //Scenario 2

    @When("El usuario ingresa credenciales incorrectas")
    public void userLogInWithInvalidateCredentials() {

        logIn.clickLogInForm();
        username = "ngel07";
        logIn.typeUsername(username);
        logIn.typePassword("hola123");
        logIn.clickSLogInRegister();

    }

    @Then("La pagina web no debería ocultar el formulario de registro")
    public void usernameNotFound() throws InterruptedException {
        sleep(1000);
        String fullUsername = "Welcome " + username;
        Assert.assertFalse(validate.usernameButtonIsDisplayed(fullUsername));
    }

}
