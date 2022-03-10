package com.banistmo.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.banistmo.reto.userinterface.EmpresasProductoSeccionesPage.SECCION_DOCUMENTOS_LINK;


public class VaALaSeccionDeDocumentos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SECCION_DOCUMENTOS_LINK),
                Click.on(SECCION_DOCUMENTOS_LINK)
        );
    }

    public static VaALaSeccionDeDocumentos delProductoEmpresas(){
        return Tasks.instrumented(VaALaSeccionDeDocumentos.class);
    }
}
