package com.demoblaze.steps.validations;

import com.demoblaze.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.exceptions.ElementNotFoundAfterTimeoutError;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeVisibleException;
import org.openqa.selenium.ElementNotInteractableException;

import javax.swing.text.html.parser.Element;


@SuppressWarnings("ALL")
public class ValidationStep extends ValidationPage {


    //sign up validations
    @Step("Validar visualizacion formulario de resgistro")
    public Boolean signUpLabelIsDisplayed() {
        try {
            boolean isDisplayed = lbl_SignUp.isDisplayed();
            System.out.println("El elemento lbl_SignUp está visible: " + isDisplayed);
            return isDisplayed;
        } catch (ElementNotInteractableException e) {
            return false;
        }

    }

    //log in validation
    @Step("Validar visualizacion formulario de resgistro")
    public Boolean logInLabelIsDisplayed() {
        try {
            boolean isDisplayed = lbl_LogIn.isDisplayed();
            System.out.println("El elemento lbl_LogIn está visible: " + isDisplayed);
            return isDisplayed;
        } catch (ElementNotInteractableException e) {
            return false;
        }

    }

    @Step("Validar inicio de sesion exitoso")
    public Boolean usernameButtonIsDisplayed(String inputUsername) {
       String username =  btn_NameOfUser.getText().toString();

        return inputUsername.equals(username);

    }




}


