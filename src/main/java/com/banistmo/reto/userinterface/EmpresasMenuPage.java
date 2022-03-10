package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasMenuPage extends PageObject {
    public static final Target MENU_PRODUCTOS_SERVICIOS_LINK = Target.the("opción del menú Productos & Servicios").
            located(By.xpath("//a[.='Productos & Servicios']"));
    public static final Target OPCION_DEPOSITOS_URL = Target.the("opción Depósitos").
            located(By.cssSelector("[href='/wps/portal/banistmo/empresas/productos-y-servicios/depositos/']"));

}
