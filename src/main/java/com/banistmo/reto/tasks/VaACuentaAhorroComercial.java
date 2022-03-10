package com.banistmo.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.banistmo.reto.userinterface.EmpresasMenuPage.*;
import static com.banistmo.reto.userinterface.EmpresasProductoDepositosPage.CUENTA_AHORROS_COMERCIAL_BUTTON_CARD;


public class VaACuentaAhorroComercial implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTOS_SERVICIOS_LINK),
                Click.on(OPCION_DEPOSITOS_URL),
                Scroll.to(CUENTA_AHORROS_COMERCIAL_BUTTON_CARD).andAlignToTop(),
                Click.on(CUENTA_AHORROS_COMERCIAL_BUTTON_CARD)
        );
    }

    public static VaACuentaAhorroComercial delProductoDepositosEmpresas(){
        return Tasks.instrumented(VaACuentaAhorroComercial.class);
    }
}
