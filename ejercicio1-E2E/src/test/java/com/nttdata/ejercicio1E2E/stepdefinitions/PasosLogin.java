package com.nttdata.ejercicio1E2E.stepdefinitions;

import com.nttdata.ejercicio1E2E.actors.ActorUsuario;
import com.nttdata.ejercicio1E2E.tasks.TareaDeLogin;
import com.nttdata.ejercicio1E2E.utils.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class PasosLogin {

    @Before
    public void setUp() throws Exception {
        ActorUsuario.inicializar();
    }

    @After
    public void tearDown() {
        ActorUsuario.limpiar();
    }

    @Given("el usuario inicia sesión con las credenciales del json")
    public void elUsuarioIniciaSesionConLasCredencialesDelJson() {
        ActorUsuario.obtener().attemptsTo(
                TareaDeLogin.conCredenciales(
                        TestContext.getDatos().getUsuario(),
                        TestContext.getDatos().getPassword()
                )
        );
    }
}
