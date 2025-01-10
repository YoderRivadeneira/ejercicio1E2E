# Ejercicio E2E - Flujo de Compra en SauceDemo

Este proyecto realiza una prueba funcional automatizada (Prueba E2E) para un flujo de compra en la página [SauceDemo](https://www.saucedemo.com/) utilizando **SerenityBDD** con **ScreenPlay**.

## 📋 Prerequisitos

Antes de ejecutar el proyecto, asegúrate de cumplir con los siguientes requisitos:

- **Sistema Operativo**: Windows 10 / macOS / Linux
- **IDE Recomendado**: IntelliJ IDEA 2023.1 o superior
- **JDK**: Versión 17 (configurado en la variable de entorno `JAVA_HOME`)
- **Google Chrome**: cualquiera (de preferencia la última versión)
- **Gradle Wrapper**: No necesitas instalarlo globalmente; el proyecto incluye el wrapper.
- **Conexión a Internet**: Necesaria para descargar dependencias y ejecutar las pruebas.

## 💻 Comandos de instalación

1. Clona el repositorio en tu máquina local desde el siguiente link "https://github.com/YoderRivadeneira/ejercicio1E2E", o puedes usar los siguientes comandos:
   ```bash
   git clone https://github.com/YoderRivadeneira/ejercicio1E2E
    ```
   ```bash
   cd ejercicio1E2E
   ```

Configura el Gradle Wrapper a la versión 7.6.1:

Nota: Asegurate de ejecutar este comando en la ruta del proyecto, es decir en la terminal debes ubicarte en la ruta del proyecto.
```bash
   ./gradlew wrapper --gradle-version 7.6.1
```



Verifica que las dependencias se instalen correctamente:

Nota: Asegurate de ejecutar este comando en la ruta del proyecto, es decir en la terminal debes ubicarte en la ruta del proyecto.

```bash
   ./gradlew build
```
Esto descargará todas las dependencias declaradas en el archivo build.gradle, también se puede hhacer desde el IDE con las opciones de gradle

![image](https://github.com/user-attachments/assets/991041d2-2238-41cd-b30f-bad01ac76eb3)


🚀 Instrucciones para ejecutar las pruebas

Ejecutar las pruebas: Ejecuta las pruebas y genera los reportes con el siguiente comando:

```bash
   ./gradlew test --tests "com.nttdata.ejercicio1E2E.runner.EjecutarSerenity" --info
```
Nota: Asegurate de ejecutar este comando en la ruta del proyecto, es decir en la terminal debes ubicarte en la ruta del proyecto.



También puedes ejecutar las pruebas directamente en el IDE IntelliJ IDEA:

Para ello puedes ubicar la clase "EjecutarSerenity" darleclick derecho y seleccionar la opción "Run EjecutarSerenity" 




![image](https://github.com/user-attachments/assets/34e3644c-5d4e-42aa-a58b-8b567c80b25a)





o 

ubicar el icono verde de Run y ejecutar "EjecutarSerenity", si el icono verde no esta configurado se puede configurar en las opciones de "Run" opción "edit configuration" y asignandole el siguiente comando: 

```bash
:test --tests "com.nttdata.ejercicio1E2E.runner.EjecutarSerenity"
```

![image](https://github.com/user-attachments/assets/583e6e96-5723-44d5-ac32-616d55da38d9)




📋 Reporte en Cucumber: 

Los reportes en Cucumber se generan automáticamente y reflejan los escenarios definidos en el archivo src/test/java/com/nttdata/ejercicio1E2E/features/compra.feature.

la ruta donde se ubica el reporte después de ejecutar un test es: ejercicio1-E2E/build/reports/tests/test/index.html

    Detalles de los Reportes



![image](https://github.com/user-attachments/assets/3a409c3a-592e-4fb8-8bbd-eea6ccb86350)

![image](https://github.com/user-attachments/assets/712949fd-835d-4cad-93df-42efdf00951e)


        Reporte en cucumber: build/reports/tests/test/index.html
            Resultados detallados de cada escenario ejecutado.
            Tiempo de ejecución por escenario.
            Acceso rápido a errores o excepciones encontradas durante la ejecución.
            Estado final de las pruebas (éxito o fallo).
            Es ideal para documentar y presentar evidencia de la ejecución de los flujos automatizados.
            Reporte Estándar de Gradle (build/reports/tests/test/index.html)

🛠 Info adicional

Datos de prueba: Los datos para las pruebas se encuentran en el archivo src/main/resources/datos.json


```bash
{
  "usuario": "standard_user",
  "password": "secret_sauce",
  "productos": ["Sauce Labs Backpack", "Sauce Labs Bike Light"],
  "datosCompra": {
    "nombre": "Yoder",
    "apellido": "Rivadeneira",
    "codigoPostal": "12345"
  }
}
```



📂 Estructura del proyecto

```bash


src/

├── main/

│   └── java/

│       └── com/nttdata/ejercicio1E2E/

│           ├── tasks/                      # Implementaciones de tareas en ScreenPlay

│           ├── questions/                  # Preguntas para verificar estados

│           ├── actors/                     # Configuración del actor


│           ├── models/                     # Modelos para datos del JSON

│           ├── utils/                      # Utilidades como lectura de JSON y WebDriver

│           ├── interfaces/                 # Selectores de elementos web

│           └── resources/

│               └── datos.json              # Datos de prueba

└── test/

    └── java/
    
        └── com/nttdata/ejercicio1E2E/
        
            ├── runner/                     # Para la ejecución (Runner)
            
            ├── stepdefinitions/            # Definición de los pasos de los escenarios
            
            └── features/                   # Escenarios escritos en Cucumber

```
            
📝 Detalles del ejercicio


El flujo implementado incluye:

   - Autenticación con el usuario standard_user y contraseña secret_sauce.

   - Agregar dos productos al carrito.

   - Visualizar el carrito.

   - Completar el formulario de compra.

   - Finalizar la compra y verificar el mensaje de confirmación: “THANK YOU FOR YOUR ORDER”.


📑 Notas adicionales

Revisar capturas de pantalla del flujo realizado: Se pueden revisar capturas de pantalla que se toman automaticamente durante la ejecución de los test, para ello se debe ubicar la carpeta "target" que debería estar en una ruta similar a esta: ejercicio1-E2E\target\site\serenity:


![image](https://github.com/user-attachments/assets/d0872b97-b6df-4a34-a18a-303b7db01ce0)



El proyecto incluye un Gradle Wrapper configurado para que no sea necesario instalar Gradle globalmente.

Si encuentras problemas de configuración, revisa las variables de entorno y las versiones mencionadas en los prerrequisitos.




🚀 EXTRAS/PLUS

DevOps e Integración continua CICD: https://github.com/YoderRivadeneira/ejercicio1E2E/actions

Se integró la solución con github Actions para poder incluir su ejecucuón en procesos automatizados CICD.
Al realizar un push a la rama automáticamente se ejecuta el test con los runners de github actions.



![image](https://github.com/user-attachments/assets/d40b5e95-fa0e-4090-85da-1ededd44a732)


![image](https://github.com/user-attachments/assets/0c73b0b6-1410-4790-8491-8553734d7501)

![image](https://github.com/user-attachments/assets/e54a0ef2-561e-4b42-8e03-f0ae79218cc3)


![image](https://github.com/user-attachments/assets/5dc61b52-d739-4981-a0e4-8c99dde1f44f)
