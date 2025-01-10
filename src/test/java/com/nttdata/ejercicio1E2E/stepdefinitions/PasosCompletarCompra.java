package com.nttdata.ejercicio1E2E.stepdefinitions;

import com.nttdata.ejercicio1E2E.actors.ActorUsuario;
import com.nttdata.ejercicio1E2E.tasks.TareaIrAlCheckout;
import com.nttdata.ejercicio1E2E.tasks.TareaDeCompletarCompra;
import com.nttdata.ejercicio1E2E.questions.PreguntaMensajeConfirmacion;
import com.nttdata.ejercicio1E2E.utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class PasosCompletarCompra {

    @And("procede al checkout de los productos agregados al carrito")
    public void procedeAlCheckout() {
        ActorUsuario.obtener().attemptsTo(
                TareaIrAlCheckout.ir()
        );
    }

    @And("completa el formulario de compra con los datos del archivo json")
    public void completaElFormularioDeCompraConLosDatosDelArchivoJson() {
        ActorUsuario.obtener().attemptsTo(
                TareaDeCompletarCompra.conDatos(
                        TestContext.getDatos().getDatosCompra().getNombre(),
                        TestContext.getDatos().getDatosCompra().getApellido(),
                        TestContext.getDatos().getDatosCompra().getCodigoPostal()
                )
        );
    }

    @Then("el mensaje de correcto debe ser {string}")
    public void elMensajeDeConfirmacionDeberiaSer(String mensajeEsperado) {
        ActorUsuario.obtener().should(
                seeThat(
                        "El mensaje de confirmación",
                        actor -> PreguntaMensajeConfirmacion.esVisible().answeredBy(actor).toLowerCase(),
                        containsString(mensajeEsperado.toLowerCase())
                )
        );
    }
}
