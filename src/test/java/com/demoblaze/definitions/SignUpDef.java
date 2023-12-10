package com.demoblaze.definitions;

import com.demoblaze.steps.signUp.SignUp;
import com.demoblaze.steps.validations.ValidationStep;
import com.demoblaze.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class SignUpDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SignUp signUp;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("El usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.demoblaze.com/index.html");
    }

    //Escenario 1

    @When("El usuario ingresa credenciales válidas")
    public void userSignUpWithValidateCredentials() {

        signUp.clickSignUpForm();
        Assert.assertTrue(validate.signUpLabelIsDisplayed());
        signUp.typeUsername("angelPrueba012");
        signUp.typePassword("hola123");
        signUp.clickSignUpRegister();
    }

    @Then("la aplicación debería ocultar el formulario de registro")
    public void signUpIsNotDisplayed() throws InterruptedException {
        sleep(400);
        Assert.assertFalse(validate.signUpLabelIsDisplayed());
    }


    //Segundo escenario

    @When("El usuario ingresa credenciales ya existentes")
    public void userSignUpWithInvalidateCredentials() {

        signUp.clickSignUpForm();
        Assert.assertTrue(validate.signUpLabelIsDisplayed());
        signUp.typeUsername("angelPrueba012");
        signUp.typePassword("hola123");
        signUp.clickSignUpRegister();

    }

    @Then("la aplicación no debería ocultar el formulario de registro")
    public void signUpIsVisible() throws InterruptedException {
        sleep(400);
        Assert.assertTrue(validate.signUpLabelIsDisplayed());
    }

}