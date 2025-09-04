# Acuario-POO

## Descripción

`Acuario-POO` es una aplicación de consola desarrollada en Kotlin que demuestra conceptos fundamentales de programación orientada a objetos (POO), incluyendo herencia, clases abiertas, propiedades con getters y setters, clases abstractas, interfaces, constructores primarios y secundarios, y overriding de métodos y propiedades. La aplicación simula un sistema de gestión de acuarios, con tanques rectangulares y cilíndricos, y peces con comportamientos específicos.

El proyecto está diseñado para ser claro, modular y fácil de entender, con comentarios explicativos en el código y una salida en consola estructurada. Es ideal para estudiantes y desarrolladores que deseen aprender o repasar conceptos de POO en Kotlin.

## Estructura del Proyecto

El proyecto está organizado en tres archivos principales dentro del paquete `acuario`:

- **Acuario.kt**: Contiene las clases `Acuario` (base, rectangular) y `TanqueTorre` (subclase, cilíndrico), que gestionan las dimensiones, volumen y nivel de agua de los tanques.
- **PecesAcuario.kt**: Define la interfaz `AccionPez`, la clase abstracta `Pez`, y las subclases `Tiburón` y `PezPayaso`, que modelan los peces y sus comportamientos.
- **Main.kt**: Implementa la lógica principal, con funciones para crear e interactuar con acuarios (`construirAcuario`) y peces (`crearPeces`).

## Requisitos

- **Kotlin**: Versión 1.5 o superior.
- **JDK**: Versión 8 o superior.
- **Entorno de desarrollo**: Se recomienda IntelliJ IDEA para compilar y ejecutar el proyecto, aunque cualquier entorno compatible con Kotlin (como Gradle o Maven) funcionará.
- **Sistema operativo**: Windows, macOS o Linux.

## Instalación

1. **Clonar o descargar el proyecto**:
   - Si el proyecto está en un repositorio, clona usando:
     ```bash
     git clone https://github.com/Dorian-devw/PEM-4C24/SEMANA02/actividad_sem02.git
     ```
   - Alternativamente, copia los archivos `Acuario.kt`, `PecesAcuario.kt` y `Main.kt` en un directorio de proyecto.

2. **Configurar el entorno**:
   - Crea un nuevo proyecto Kotlin en IntelliJ IDEA.
   - Coloca los archivos en el directorio `src/main/kotlin/acuario`.
   - Asegúrate de que el paquete `acuario` esté correctamente configurado en cada archivo.

3. **Compilar y ejecutar**:
   - Usa IntelliJ IDEA para ejecutar el archivo `Main.kt` (función `main`).
   - Alternativamente, compila desde la terminal con:
     ```bash
     kotlinc *.kt -include-runtime -d acuario.jar
     java -jar acuario.jar
     ```

## Uso

La aplicación se ejecuta desde la consola y realiza dos demostraciones:

1. **Demostración de Acuarios** (`construirAcuario`):
   - Crea instancias de `Acuario` y `TanqueTorre` con diferentes configuraciones de dimensiones y número de peces.
   - Muestra las dimensiones, volumen, nivel de agua y porcentaje de llenado de cada tanque.
   - Ejemplo de uso del setter para ajustar el volumen dinámicamente.

2. **Demostración de Peces** (`crearPeces`):
   - Crea instancias de `Tiburón` y `PezPayaso`.
   - Muestra el color y el comportamiento de alimentación de cada pez.

Para ejecutar, simplemente corre el programa desde `Main.kt`. La salida en consola estará dividida en secciones claras con encabezados.

### Ejemplo de Salida

```plaintext
Inicializando acuario
rectángulo
Ancho: 20 cm, Largo: 100 cm, Alto: 40 cm
Volumen: 80 l Agua: 72.0 l (90.0% lleno)
...
Inicializando acuario
cilindro
Ancho: 25 cm, Largo: 25 cm, Alto: 40 cm
Volumen: 19 l Agua: 15.2 l (80.0% lleno)
Color del tiburón: gris
cazar y comer peces
Color del pez payaso: dorado
comer algas
```

## Conceptos de POO Implementados

- **Herencia**: `TanqueTorre` hereda de `Acuario` para modelar tanques cilíndricos.
- **Clases Abiertas**: `Acuario` y sus propiedades/métodos son `open` para permitir overriding.
- **Getters y Setters**: `volumen` y `agua` usan getters dinámicos y setters para ajustar dimensiones.
- **Constructores**: Primarios (dimensiones) y secundarios (número de peces).
- **Clases Abstractas**: `Pez` define una propiedad abstracta `color`.
- **Interfaces**: `AccionPez` define el método `comer()`, implementado por `Tiburón` y `PezPayaso`.
- **Overriding**: Propiedades (`volumen`, `agua`, `forma`) y métodos (`imprimirTamano`) son sobrescritos en `TanqueTorre`.

## Detalles Técnicos

- **Paquete**: `acuario`
- **Lenguaje**: Kotlin
- **Dependencias**: Solo la biblioteca estándar de Kotlin (incluye `kotlin.math.PI`).
- **Cálculos**:
  - Volumen rectangular: `(ancho * largo * alto) / 1000` litros.
  - Volumen cilíndrico: `(π * (ancho/2) * (largo/2) * alto) / 1000` litros.
  - Agua: 90% del volumen para `Acuario`, 80% para `TanqueTorre`.
  - Constructor secundario: 2000 cm³ por pez + 10% extra.
- **Validaciones**: Los setters no incluyen validación de división por cero; considera agregarlas para producción.

## Contribuciones

Si deseas contribuir:
1. Haz un fork del repositorio.
2. Crea una rama para tus cambios (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios y haz commit (`git commit -m "Agrega nueva funcionalidad"`).
4. Envía un pull request.

## Notas

- **Inconsistencia corregida**: En `TanqueTorre`, la propiedad `agua` sobrescribe el getter para reflejar el 80% del volumen, corrigiendo un problema del código original.
- **Extensibilidad**: Puedes agregar más tipos de acuarios (por ejemplo, esféricos) o peces (por ejemplo, pez ángel) extendiendo las clases/interfaces.
- **Mejoras sugeridas**: Agregar validaciones en setters para evitar divisiones por cero o valores negativos.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
