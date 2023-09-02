# AutomatizacionWeb_Francisco
Ejercicio 1 de Automatización Web con Serenity BDD

EJERCICIO PROPUESTO

INSTRUCCIONES:
1. Se puede utilizar cualquier framework, sin embargo, el deseable es: Serenity BDD.
2. Al finalizar el ejercicio se debe subir en un repositorio github público. El ejercicio debe contener archivos, scripts, reportes y cualquier otro insumo que sustente su implementación para que pueda ser reproducido por la persona a revisar. 

Adicional debe contener:
Un archivo readme.txt con las instrucciones paso a paso de ejecución (debe especificar las versiones de las tecnologías a usar).
Un archivo conclusiones.txt con los hallazgos y conclusiones del ejercicio

EJERCICIO:
Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página 
https://www.demoblaze.com/ que incluya:
• Agregar dos productos al carrito
• Visualizar el carrito
• Completar el formulario de compra
• Finalizar la compra


Procedimiento.

Por: Francisco Riofrio
# Ejercicio
Automatización de página web "https://www.demoblaze.com/"
Objetivo Añadir 2 productos al carrito de compras


## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

  - Maquina local con el sistema operativo Debian 11.0 - Windows 11 - Linux
  - JDK versión 17.0.4 (debe estar en la variable de entorno)
  - Intellij-Idea Comunity o Ultimate version 2022.3.2
  - Gradle 8.0 (debe estar en la variable de entorno)
  - Google Chrome Version 116.0.5845.141 o inferior (Observacion se ha añadido una dependencia para el control de versiones del navegador chrome y del web driver llamada "webdrivermanager", como observacion en ciertos casos para un optimo despliege se debe borrar de cache el webdriver ejecutado con anterioridad, cuando no se ejecuta de forma directa)



## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Ingresar en la opción File -> Open y ubicarse en el proyecto (abrir)
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. Ubicarse y ejecutar la clase Runner.java (src/test/java/com/example/automatizacionweb_francisco/runners/Runner.java.

            - La clase ejecutara los features de forma ordenada según el ejercicio realizado
            - ## Reporte Serenity: Una vez finalizada la ejecución se crea el informe propio de Serenety (se añadio capturas de pantalla de cada paso)
            para visualizarlo ubicarse en la ruta target/serenity/index.html
        5. Adicional, se puede cambiar la configuración del archivo serenity para que se ejecute en otro navegador (firefox)

        Otra forma de ejecutar el proyecto es desde el terminal mediante:

        ```bash/cmd
       -Generar la carpeta build/libs con el JAR del proyecto
       gradle build
       -Opcional: Genera los archivos para eclipse (.classpath, .project, .settings).
       gradle eclipse
       Ejecutar el proyecto
       gradle run
        ```
## Información adicional
https://github.com/frankriofrio/AutomatizacionWeb_Francisco.git
Referencia Serenity: https://serenity-bdd.info/
Repositorio Serenity: https://github.com/serenity-bdd

