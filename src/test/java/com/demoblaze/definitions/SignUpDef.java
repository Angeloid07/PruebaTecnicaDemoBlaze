package com.demoblaze.definitions;

import com.demoblaze.steps.signUp.SignUp;
import com.demoblaze.steps.validations.ValidationStep;
import com.demoblaze.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

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
        validate.signUpLabelIsDisplayed();
        signUp.typeUsername("angelPrueba001");
        signUp.typePassword("hola123");
        signUp.clickSignUpRegister();
    }

    @Then("la aplicación debería ocultar el formulario de registro")
    public void signUpIsNotDisplayed() {
        Assert.assertTrue(validate.namePageLabelIsDisplayed());
    }
}


    //Segundo escenario



