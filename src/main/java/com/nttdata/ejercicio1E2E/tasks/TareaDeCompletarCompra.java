package com.nttdata.ejercicio1E2E.tasks;

import com.nttdata.ejercicio1E2E.interfaces.CheckoutInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TareaDeCompletarCompra implements Task {

    private final String nombre;
    private final String apellido;
    private final String codigoPostal;

    public TareaDeCompletarCompra(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static TareaDeCompletarCompra conDatos(String nombre, String apellido, String codigoPostal) {
        return instrumented(TareaDeCompletarCompra.class, nombre, apellido, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CheckoutInterface.NOMBRE_FIELD),
                Enter.theValue(apellido).into(CheckoutInterface.APELLIDO_FIELD),
                Enter.theValue(codigoPostal).into(CheckoutInterface.CODIGO_POSTAL_FIELD),
                Click.on(CheckoutInterface.BOTON_CONTINUAR),
                Click.on(CheckoutInterface.BOTON_FINISH)
        );
    }
}
