package com.demoblaze.steps.signUp;

import com.demoblaze.pages.signUp.SignUpPage;
import net.thucydides.core.annotations.Step;

public class SignUpStep extends SignUpPage {
    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton Sign up principal")
    public void clickSignUpForm(){
        btn_signUpForm.click();
    }
    @Step("Click en el boton Sign up formulario")
    public void clickSignUpRegister(){
        btn_singUpRegister.click();
    }
}
