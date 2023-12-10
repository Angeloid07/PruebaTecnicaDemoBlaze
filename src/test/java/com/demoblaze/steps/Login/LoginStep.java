package com.demoblaze.steps.Login;

import com.demoblaze.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton Log in principal")
    public void clickLogInForm(){
        btn_loginForm.click();
    }
    @Step("Click en el boton Log in formulario")
    public void clickSLogInRegister(){
        btn_loginRegister.click();
    }


}
