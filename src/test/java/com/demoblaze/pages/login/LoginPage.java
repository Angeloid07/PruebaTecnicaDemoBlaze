package com.demoblaze.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {


    @FindBy(id = "loginusername")
    protected WebElementFacade txt_username;

    @FindBy(id = "loginpassword")
    protected WebElementFacade txt_password;

    @FindBy(id = "login2")
    protected WebElementFacade btn_loginForm;

    @FindBy(xpath = "//button[@class='btn btn-primary' and text()='Log in']")
    protected WebElementFacade btn_loginRegister;

    @FindBy(id = "nameofuser")
    protected  WebElementFacade btn_NameOfUser;
}
