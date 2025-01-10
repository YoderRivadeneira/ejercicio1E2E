# Ejercicio E2E - Flujo de Compra en SauceDemo

Este proyecto realiza una prueba funcional automatizada (Prueba E2E) para un flujo de compra en la página [SauceDemo](https://www.saucedemo.com/) utilizando **SerenityBDD** con **ScreenPlay**.

## 📋 Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de cumplir con los siguientes requisitos:

- **Sistema Operativo**: Windows 10 / macOS / Linux
- **IDE Recomendado**: IntelliJ IDEA 2023.1 o superior
- **JDK**: Versión 17 (configurado en la variable de entorno `JAVA_HOME`)
- **Google Chrome**: cualquiera (de preferencia la última versión)
- **Gradle Wrapper**: No necesitas instalarlo globalmente; el proyecto incluye el wrapper.
- **Conexión a Internet**: Necesaria para descargar dependencias y ejecutar las pruebas.

## 💻 Comandos de instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone [<URL_DEL_REPOSITORIO>](https://github.com/YoderRivadeneira/ejercicio1E2E)
   cd ejercicio1-E2E
Configura el Gradle Wrapper a la versión 7.6.1:

```bash
   Copiar código
   ./gradlew wrapper --gradle-version 7.6.1
Verifica que las dependencias se instalen correctamente:
```


bash
Copiar código
./gradlew clean build
Esto descargará todas las dependencias declaradas en el archivo build.gradle.

🚀 Instrucciones para ejecutar las pruebas
Ejecutar las pruebas: Ejecuta las pruebas y genera los reportes con el siguiente comando:

bash
Copiar código
./gradlew clean test aggregate
Ver los reportes: Los reportes de SerenityBDD estarán disponibles en la siguiente ruta:


🛠 Configuración adicional
Datos de prueba: Los datos para las pruebas se encuentran en el archivo src/main/resources/datos.json. Asegúrate de que este archivo contenga las credenciales y datos requeridos:

json
Copiar código
{
  "usuario": "standard_user",
  "password": "secret_sauce",
  "productos": ["Sauce Labs Backpack", "Sauce Labs Bike Light"],
  "datosCompra": {
    "nombre": "John",
    "apellido": "Doe",
    "codigoPostal": "12345"
  }
}
Reporte en Cucumber: Los reportes en Cucumber se generan automáticamente y reflejan los escenarios definidos en el archivo src/test/java/com/nttdata/ejercicio1E2E/features/compra.feature.

📂 Estructura del proyecto
bash
Copiar código

src/

├── main/

│   └── java/

│       └── com/nttdata/ejercicio1E2E/

│           ├── tasks/                       # Implementaciones de tareas en ScreenPlay

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
        
            ├── runner/                     # Clase de ejecución (Runner)
            
            ├── stepdefinitions/            # Definición de los pasos de los escenarios
            
            └── features/                   # Escenarios escritos en Cucumber


            
📝 Detalles del ejercicio
El flujo implementado incluye:

Autenticación con el usuario standard_user y contraseña secret_sauce.
Agregar dos productos al carrito.
Visualizar el carrito.
Completar el formulario de compra.
Finalizar la compra y verificar el mensaje de confirmación: “THANK YOU FOR YOUR ORDER”.


📑 Notas adicionales
Los reportes generados en target/site/serenity/index.html muestran capturas de pantalla de cada paso ejecutado.
El proyecto incluye un Gradle Wrapper configurado para que no sea necesario instalar Gradle globalmente.
Si encuentras problemas de configuración, revisa las variables de entorno y las versiones mencionadas en los prerrequisitos.
