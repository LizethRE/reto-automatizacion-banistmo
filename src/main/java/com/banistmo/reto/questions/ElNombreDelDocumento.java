package com.banistmo.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class ElNombreDelDocumento implements Question<Boolean> {
    String nombreDocumento;

    public ElNombreDelDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String url = driver.getCurrentUrl();
        System.out.println("#####");
        System.out.println(url);
        if (url.contains(nombreDocumento)){
            resultado = true;
        }
        return resultado;
    }

    public static ElNombreDelDocumento es(String nombreDocumento) {
        return new ElNombreDelDocumento(nombreDocumento);
    }
}