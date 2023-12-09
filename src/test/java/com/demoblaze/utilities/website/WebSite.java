package com.demoblaze.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
@Steps(shared = true)
    PageObject demoblaze;

@Step("Navegar al sitio web")
public void navigateTo(String url){
    demoblaze.setDefaultBaseUrl(url);
    demoblaze.open();
}
}
