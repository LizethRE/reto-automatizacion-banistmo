package com.banistmo.reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class SwitchWindows implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        for (String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
    }

    public static SwitchWindows setWindow(){
        return new SwitchWindows();
    }

}
