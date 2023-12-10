package com.demoblaze.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {


    @FindBy(xpath = "//h5[text() = 'Sign up']")
    protected  WebElementFacade lbl_SignUp;

    @FindBy(id = "//h5[text() = 'Log in']")
    protected WebElementFacade lbl_LogIn;

    @FindBy(id = "nameofuser")
    protected  WebElementFacade btn_NameOfUser;


}
