package com.banistmo.reto.stepdefinitions;

import com.banistmo.reto.questions.ElNombreDelDocumento;
import com.banistmo.reto.tasks.DescargaDocumento;
import com.banistmo.reto.tasks.VaACuentaAhorroComercial;
import com.banistmo.reto.tasks.VaALaSeccionDeDocumentos;
import com.banistmo.reto.userinterface.EmpresasHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CuentaAhorrosComercialStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @ParameterType(".*")
    public Actor actor(String actor) {
        return OnStage.theActorCalled(actor);
    }

    @Dado("que el {actor} quiere acceder al servicio Cuenta de ahorro comercial de Depositos Empresas")
    public void queElActorQuiereAccederAlServicioCuentaDeAhorroComercialDeDepositosEmpresas(Actor actor) {
        actor.wasAbleTo(
                Open.browserOn().the(EmpresasHomePage.class),
                VaACuentaAhorroComercial.delProductoDepositosEmpresas()
        );
    }

    @Cuando("va a la seccion de Documentos")
    public void vaALaSeccionDeDocumentos() {
        OnStage.theActorInTheSpotlight().attemptsTo(VaALaSeccionDeDocumentos.delProductoEmpresas());
    }

    @Cuando("^descarga el documento (.*)")
    public void descargaElDocumento(String nombreDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(DescargaDocumento.pdf());
    }

    @Entonces("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElNombreDelDocumento.es("Contrato+Unico+de+Producto+y+Servicios+Bancarios+Oct15.pdf")));
    }
}
