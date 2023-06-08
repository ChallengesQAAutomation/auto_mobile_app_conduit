
# Automatizacion de aplicacion de Conduit


# Requisitos

- JDK 16
- Android Studio (Emulador)
    - Android 11.0
- SDK Android
- Appium 1.22.

## Instalacion

```
gradle build
```

## Preparacion de entorno

> Iniciar el servidor de appium
> Iniciar el emulador Android
> 
## Creacion Emaulador Android 

- Crear un dispostivo con el nombre ** AutomationTesting ** con Android 11 
- Instalar la aplicacion de conduit previamente el apk esta en la ruta  ** src/test/resources/app-qa-release.apk **
- Las propiedades de las capabilites estan en el archivo ** serenity.properties **

## **Run tests with gradle:**


```
gradle :test --tests "starter.RunnerTest"

```

## Reportes

> [Click para ver reporte](https://challengesqaautomation.github.io/auto_mobile_app_conduit/target/site/serenity/index.html) 
