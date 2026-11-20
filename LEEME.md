# Ventico App para Android (APK)
RC Estudio Digital · Joel Martín Rojas Chamorro · 317 779 9030

La app completa está dentro del proyecto (`app/src/main/assets/index.html`).
El APK funciona sin internet: solo necesita conexión para abrir WhatsApp.

## Opción A: que GitHub construya el APK (sin instalar nada)
1. Crea un repositorio en GitHub (puede ser privado), por ejemplo `ventico-android`.
2. Sube TODO el contenido de esta carpeta, incluida la carpeta oculta `.github`.
   Lo más fácil: instala GitHub Desktop, arrastra la carpeta y haz "Publish repository".
3. Entra al repositorio > pestaña **Actions** > "Construir APK". Espera unos 5 minutos al visto verde.
4. Abre la ejecución y, abajo en **Artifacts**, descarga `ventico-app-apk` (un .zip con `app-debug.apk`).

## Opción B: con Android Studio en tu computador
1. Instala Android Studio (developer.android.com/studio). Con 8 GB de RAM funciona, aunque va despacio.
2. File > Open > elige esta carpeta. La primera vez descarga lo que necesita (10 a 20 minutos).
3. Build > Build App Bundle(s) / APK(s) > Build APK(s).
4. Clic en "locate": el archivo queda en `app/build/outputs/apk/debug/app-debug.apk`.

## Instalar en el celular
1. Pasa `app-debug.apk` al celular (WhatsApp, Drive o cable).
2. Ábrelo y acepta "Permitir instalar apps de esta fuente".
3. Si Play Protect avisa que la app no es conocida, toca "Más detalles" > "Instalar de todas formas".
   Es normal en apps que no vienen de Play Store.

## Versión para entregar a negocios (APK firmado)
El APK de prueba ("debug") sirve para probar. Para entregarla a negocios:
Android Studio > Build > Generate Signed App Bundle or APK > APK > "Create new..." (llave de firma).
Guarda muy bien el archivo `.jks` y su contraseña: sin ellos no podrás publicar actualizaciones
que se instalen encima de la versión anterior. No subas la llave a GitHub.

## Actualizar la app
1. Reemplaza `app/src/main/assets/index.html` por la versión nueva.
2. En `app/build.gradle.kts` sube `versionCode` (1, 2, 3...) y `versionName`.
3. Vuelve a construir el APK e instálalo encima: los datos de las ventas se conservan.

Importante: desinstalar la app o "Borrar datos" en los ajustes de Android borra las ventas.
Copia el respaldo desde Ajustes de Ventico App antes de hacerlo.
