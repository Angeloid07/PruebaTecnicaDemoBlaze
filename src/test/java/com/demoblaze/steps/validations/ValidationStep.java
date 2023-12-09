package com.demoblaze.steps.validations;

import com.demoblaze.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {


    @Step("Validar visualizacion formulario de resgistro")
    public Boolean signUpLabelIsDisplayed(){
        return lbl_SignUp.isDisplayed();
    }

    @Step("Validar visualizacion de la pagina principal")
    public Boolean namePageLabelIsDisplayed(){
        return lbl_NamePage.isDisplayed();
    }

}
