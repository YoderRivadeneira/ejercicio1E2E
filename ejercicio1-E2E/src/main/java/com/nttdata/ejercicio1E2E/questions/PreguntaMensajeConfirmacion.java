package com.nttdata.ejercicio1E2E.questions;

import com.nttdata.ejercicio1E2E.interfaces.CheckoutInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PreguntaMensajeConfirmacion implements Question<String> {

    public static PreguntaMensajeConfirmacion esVisible() {
        return new PreguntaMensajeConfirmacion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(CheckoutInterface.MENSAJE_CONFIRMACION)
                .answeredBy(actor);
    }
}
