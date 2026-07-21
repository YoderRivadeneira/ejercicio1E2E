
# Ejercicio E2E - Flujo de Compra en SauceDemo

Este proyecto realiza una prueba funcional automatizada (Prueba E2E) para un flujo E2E de compra en la página [SauceDemo](https://www.saucedemo.com/) utilizando **SerenityBDD** con **ScreenPlay**.

####  EXTRAS/PLUS: Integración continua(DevOps) CI/CD con GithubActions

## 📋 Prerequisitos

Antes de ejecutar el proyecto, asegúrate de cumplir con los siguientes requisitos:

- **Sistema Operativo**: Windows 10 / macOS / Linux
- **IDE Recomendado**: IntelliJ IDEA 2023.1 o superior
- **JDK**: Versión 17 o superior (configurado en la variable de entorno `JAVA_HOME`)
- **Google Chrome**: cualquiera (de preferencia la última versión)
- **Gradle Wrapper**: No necesitas instalarlo globalmente; el proyecto incluye el wrapper.


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

<img width="1437" height="780" alt="image" src="https://github.com/user-attachments/assets/f1c2777a-b3b8-49cf-8b64-9e36af1dfb73" />



🚀 Instrucciones para ejecutar las pruebas

Ejecutar las pruebas: Ejecuta las pruebas y genera los reportes con el siguiente comando:

```bash
   ./gradlew test --tests "com.devsu.ejercicio1E2E.runner.EjecutarSerenity" --info
```
Nota: Asegurate de ejecutar este comando en la ruta del proyecto, es decir en la terminal debes ubicarte en la ruta del proyecto.



También puedes ejecutar las pruebas directamente en el IDE IntelliJ IDEA:

Para ello puedes ubicar la clase "EjecutarSerenity" darleclick derecho y seleccionar la opción "Run EjecutarSerenity" 




<img width="1434" height="935" alt="image" src="https://github.com/user-attachments/assets/95d80a07-4ba7-468f-b3e8-44cef646852f" />


ubicar el icono verde de Run y ejecutar "EjecutarSerenity", si el icono verde no esta configurado se puede configurar en las opciones de "Run" opción "edit configuration" y asignandole el siguiente comando: 

```bash
:test --tests "com.devsu.ejercicio1E2E.runner.EjecutarSerenity"
```

<img width="1489" height="958" alt="image" src="https://github.com/user-attachments/assets/8eca7656-0e10-45ea-b049-088bd6bdc95b" />



📋 Reporte en Cucumber: 

Los reportes en Cucumber se generan automáticamente y reflejan los escenarios definidos en el archivo src/test/java/com/devsu/ejercicio1E2E/features/compra.feature.

la ruta donde se ubica el reporte después de ejecutar un test es: ejercicio1-E2E/build/reports/tests/test/index.html

    Detalles de los Reportes




<img width="1182" height="512" alt="image" src="https://github.com/user-attachments/assets/f9cad4b8-cfad-47b6-a1fe-63ba2594f01e" />
<img width="1182" height="512" alt="image" src="https://github.com/user-attachments/assets/55963722-8f65-48ce-be0b-7056953b60ba" />
<img width="674" height="531" alt="image" src="https://github.com/user-attachments/assets/10126a2d-31f9-4cbb-98d2-fe934ed2b289" />
<img width="1351" height="621" alt="image" src="https://github.com/user-attachments/assets/94c29c2d-7d97-4648-a0a0-77bbdca3789f" />
<img width="1351" height="623" alt="image" src="https://github.com/user-attachments/assets/a70b7e3b-8266-46ec-8345-4068ab5785ca" />
<img width="1208" height="641" alt="image" src="https://github.com/user-attachments/assets/6195470b-6077-46cf-a76f-4305dfc302bb" />
<img width="1208" height="641" alt="image" src="https://github.com/user-attachments/assets/c2c00772-1300-4675-820f-b5b3c5520a38" />
<img width="2202" height="894" alt="image" src="https://github.com/user-attachments/assets/7cb0c576-fd79-43eb-a5b3-57c64c85224e" />
## Ejecución en CI/CD
<img width="2564" height="1440" alt="image" src="https://github.com/user-attachments/assets/557f75df-7d3e-48c4-b583-57f8b8e9d3ab" />
<img width="1573" height="709" alt="image" src="https://github.com/user-attachments/assets/29f087aa-22b3-4aa0-a99f-3e1bd0227e91" />
<img width="1566" height="470" alt="image" src="https://github.com/user-attachments/assets/fa8e39d6-4cb7-40a0-b895-14ffbe01e2d4" />
<img width="1569" height="446" alt="image" src="https://github.com/user-attachments/assets/d7fb7d1e-e67a-4260-9205-44c54a60da75" />
<img width="2098" height="102" alt="image" src="https://github.com/user-attachments/assets/2de9ee38-897b-4cbb-9f36-a83f52c1c6ee" />

<img width="2558" height="1538" alt="image" src="https://github.com/user-attachments/assets/05c6c0a7-26f1-4b43-805a-5312c1e51a8d" />




        Reporte en cucumber: build/reports/tests/test/index.html
            Resultados detallados de cada escenario ejecutado.
            Tiempo de ejecución por escenario.
            Acceso rápido a errores o excepciones encontradas durante la ejecución.
            Estado final de las pruebas (éxito o fallo).
            Es ideal para documentar y presentar evidencia de la ejecución de los flujos automatizados.
            Reporte Estándar de Gradle (build/reports/tests/test/index.html)

🛠 Info adicional
📂 Estructura del proyecto

```bash


src/

├── main/

│   └── java/

│       └── com/devsu/ejercicio1E2E/

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
    
        └── com/devsu/ejercicio1E2E/
        
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




#  EXTRAS/PLUS: Integración continua(DevOps) CI/CD con GithubActions

DevOps e Integración continua CICD: https://github.com/YoderRivadeneira/ejercicio1E2E/actions

Se integró la solución con github Actions para poder incluir su ejecucuón en procesos automatizados CICD.
Al realizar un push a la rama automáticamente se ejecuta el test con los runners de github actions.



![image](https://github.com/user-attachments/assets/d40b5e95-fa0e-4090-85da-1ededd44a732)
<img width="1340" height="556" alt="image" src="https://github.com/user-attachments/assets/bc00f583-c7c8-41ba-8c52-307f9b51ce86" />
<img width="1344" height="610" alt="image" src="https://github.com/user-attachments/assets/c8d22552-3908-4010-8b6c-1c80f3e7a945" />

<img width="1349" height="609" alt="image" src="https://github.com/user-attachments/assets/36269dc8-e241-4907-8ffa-5094ecf5c599" />




