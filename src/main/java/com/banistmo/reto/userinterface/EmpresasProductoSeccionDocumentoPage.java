package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpresasProductoSeccionDocumentoPage extends PageObject {
    public static final Target DESCARGAR_PDF_LINK = Target.the("descargar PDF").
            located(By.xpath("//div[@class='tab-pane active']//img[@alt='Descargar PDF']"));

}
