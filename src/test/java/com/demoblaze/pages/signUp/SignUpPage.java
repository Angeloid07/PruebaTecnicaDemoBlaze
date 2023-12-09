package com.demoblaze.pages.signUp;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignUpPage extends PageObject {
    @FindBy(id = "sign-username")
    protected WebElementFacade txt_username;

    @FindBy(id = "sign-password")
    protected WebElementFacade txt_password;

    @FindBy(id = "signin2")
    protected WebElementFacade btn_signUpForm;

    @FindBy(xpath = "//button[@class='btn btn-primary' and text()='Sign up']")
    protected WebElementFacade btn_singUpRegister;

}
