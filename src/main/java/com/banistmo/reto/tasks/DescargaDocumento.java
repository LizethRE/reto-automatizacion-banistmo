package com.banistmo.reto.tasks;

import com.banistmo.reto.interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.banistmo.reto.userinterface.EmpresasProductoSeccionDocumentoPage.DESCARGAR_PDF_LINK;


public class DescargaDocumento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESCARGAR_PDF_LINK),
                SwitchWindows.setWindow()
        );
    }

    public static DescargaDocumento pdf(){
        return Tasks.instrumented(DescargaDocumento.class);
    }
}
