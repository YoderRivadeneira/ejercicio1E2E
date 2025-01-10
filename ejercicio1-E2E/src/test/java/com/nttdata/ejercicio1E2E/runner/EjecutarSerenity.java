package com.nttdata.ejercicio1E2E.runner;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/com/nttdata/ejercicio1E2E/features",
        glue = "com.nttdata.ejercicio1E2E.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class EjecutarSerenity {
}
