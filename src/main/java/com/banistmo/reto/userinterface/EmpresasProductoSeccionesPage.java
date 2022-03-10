package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductoSeccionesPage extends PageObject {
    public static final Target SECCION_DOCUMENTOS_LINK = Target.the("sección Documentos").
            located(By.xpath("//a[.='Documentos']"));

}
