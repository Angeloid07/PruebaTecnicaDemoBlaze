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


}


