package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductoDepositosPage extends PageObject {
    public static final Target CUENTA_AHORROS_COMERCIAL_BUTTON_CARD = Target.the("card de Cuenta de Ahorro Comercial").
            located(By.cssSelector(".leer-mas > [title='Cuenta de Ahorro Comercial']"));

}
