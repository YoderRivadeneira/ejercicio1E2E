package com.nttdata.ejercicio1E2E.utils;

import com.nttdata.ejercicio1E2E.models.DatosCompra;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class TestContext {
    private static WebDriver driver;
    private static DatosCompra datos;

    public static void initialize() throws IOException {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();


            boolean isCI = System.getenv("CI") != null;

            ChromeOptions options = new ChromeOptions();
            if (isCI) {

                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }

            driver = new ChromeDriver(options);
            OnStage.setTheStage(new Cast());
            datos = JsonReader.read("src/main/resources/datos.json", DatosCompra.class);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static DatosCompra getDatos() {
        return datos;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
