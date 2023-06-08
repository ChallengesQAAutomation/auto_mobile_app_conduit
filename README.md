
# Automatizacion de aplicacion de Conduit :fire:

> Automatización de app móvil en Java, Screenplay, Cucumber, Appium y Gradle. Casos de prueba en lenguaje Gherkin para una ejecución eficiente y confiable. Mejora calidad y entrega rápida.

- [Ir al repository](https://github.com/ChallengesQAAutomation/auto_mobile_app_conduit)
 
## Requisitos :card_index:

- JDK 16
- Android Studio (Emulador)
    - Android 11.0
- SDK Android
- Appium 1.22.

## Instalacion :dart:

```
git clone https://github.com/ChallengesQAAutomation/auto_mobile_app_conduit.git
````

```
gradle build
```

## Preparacion de entorno :computer:

- Iniciar el servidor de appium
- Instalar android studio
- Iniciar el emulador Android
 
## Creacion Emaulador Android  :iphone:

- Crear un dispostivo con el nombre ** AutomationTesting ** con Android 11 
- Instalar la aplicacion de conduit previamente el apk esta en la ruta  ** src/test/resources/app-qa-release.apk **
- Las propiedades de las capabilites estan en el archivo ** serenity.properties **

## **Run tests with gradle:** :bomb:

```
gradle :test --tests "starter.RunnerTest"
```

# Reportes :chart_with_upwards_trend:

- [Click para ver reporte](https://challengesqaautomation.github.io/auto_mobile_app_conduit/target/site/serenity/index.html) 
