# Biblioteca-POO

## Descripción

`Biblioteca-POO` es una aplicación de consola desarrollada en Kotlin que ilustra conceptos fundamentales de programación orientada a objetos (POO), incluyendo herencia, clases abiertas, propiedades con getters y setters, clases abstractas, interfaces, constructores primarios y secundarios, y overriding de métodos y propiedades. La aplicación simula un sistema de gestión de una biblioteca, con estanterías rectangulares y cilíndricas para almacenar libros, y diferentes tipos de libros (novelas y ensayos) con comportamientos específicos.

El proyecto está diseñado para ser claro, modular y fácil de entender, con comentarios explicativos en el código y una salida en consola estructurada. Es ideal para estudiantes y desarrolladores que deseen aprender o repasar conceptos de POO en Kotlin.

## Estructura del Proyecto

El proyecto está organizado en tres archivos principales dentro del paquete `biblioteca`:

- **Estanteria.kt**: Contiene las clases `Estanteria` (base, rectangular) y `EstanteriaCilindrica` (subclase, cilíndrica), que gestionan las dimensiones, capacidad (número de libros) y nivel de llenado de las estanterías.
- **Libros.kt**: Define la interfaz `AccionLibro`, la clase abstracta `Libro`, y las subclases `Novela` y `Ensayo`, que modelan los libros y sus comportamientos.
- **Main.kt**: Implementa la lógica principal, con funciones para crear e interactuar con estanterías (`construirBiblioteca`) y libros (`crearLibros`).

## Requisitos

- **Kotlin**: Versión 1.5 o superior.
- **JDK**: Versión 8 o superior.
- **Entorno de desarrollo**: Se recomienda IntelliJ IDEA para compilar y ejecutar el proyecto, aunque cualquier entorno compatible con Kotlin (como Gradle o Maven) funcionará.
- **Sistema operativo**: Windows, macOS o Linux.

## Instalación

1. **Clonar o descargar el proyecto**:
   - Si el proyecto está en un repositorio, clona usando:
     ```bash
     git clone https://github.com/Dorian-devw/PEM-4C24/tree/main/SEMANA02/tarea_sem02.git
     ```
   - Alternativamente, copia los archivos `Estanteria.kt`, `Libros.kt` y `Main.kt` en un directorio de proyecto.

2. **Configurar el entorno**:
   - Crea un nuevo proyecto Kotlin en IntelliJ IDEA.
   - Coloca los archivos en el directorio `src/main/kotlin/biblioteca`.
   - Asegúrate de que el paquete `biblioteca` esté correctamente configurado en cada archivo.

3. **Compilar y ejecutar**:
   - Usa IntelliJ IDEA para ejecutar el archivo `Main.kt` (función `main`).
   - Alternativamente, compila desde la terminal con:
     ```bash
     kotlinc *.kt -include-runtime -d biblioteca.jar
     java -jar biblioteca.jar
     ```

## Uso

La aplicación se ejecuta desde la consola y realiza dos demostraciones:

1. **Demostración de Estanterías** (`construirBiblioteca`):
   - Crea instancias de `Estanteria` y `EstanteriaCilindrica` con diferentes configuraciones de dimensiones y número de libros.
   - Muestra las dimensiones, capacidad, número de libros almacenados y porcentaje de llenado de cada estantería.
   - Ejemplo de uso del setter para ajustar la capacidad dinámicamente.

2. **Demostración de Libros** (`crearLibros`):
   - Crea instancias de `Novela` y `Ensayo`.
   - Muestra el género y el comportamiento de lectura de cada libro.

Para ejecutar, simplemente corre el programa desde `Main.kt`. La salida en consola estará dividida en secciones claras con encabezados.

### Ejemplo de Salida

```plaintext
=== Demostración de Estanterías ===
Inicializando estantería
Forma: rectangular
Ancho: 30 cm, Largo: 120 cm, Alto: 180 cm
Capacidad: 216 libros, Libros almacenados: 172.8 (80.0% lleno)
...
Inicializando estantería
Forma: cilíndrica
Ancho: 50 cm, Largo: 50 cm, Alto: 180 cm
Capacidad: 117 libros, Libros almacenados: 81.9 (70.0% lleno)
=== Demostración de Libros ===
Género de la novela: ficción
Leer una historia emocionante
Género del ensayo: no ficción
Analizar ideas y argumentos
```

## Conceptos de POO Implementados

- **Herencia**: `EstanteriaCilindrica` hereda de `Estanteria` para modelar estanterías cilíndricas.
- **Clases Abiertas**: `Estanteria` y sus propiedades/métodos son `open` para permitir overriding.
- **Getters y Setters**: `capacidad` y `librosAlmacenados` usan getters dinámicos y setters para ajustar dimensiones.
- **Constructores**: Primarios (dimensiones) y secundarios (número de libros).
- **Clases Abstractas**: `Libro` define una propiedad abstracta `genero`.
- **Interfaces**: `AccionLibro` define el método `leer()`, implementado por `Novela` y `Ensayo`.
- **Overriding**: Propiedades (`capacidad`, `librosAlmacenados`, `forma`) y métodos (`imprimirDetalles`) son sobrescritos en `EstanteriaCilindrica`.

## Detalles Técnicos

- **Paquete**: `biblioteca`
- **Lenguaje**: Kotlin
- **Dependencias**: Solo la biblioteca estándar de Kotlin (incluye `kotlin.math.PI`).
- **Cálculos**:
  - Capacidad rectangular: `(ancho * largo * alto) / 3000` libros (3000 cm³ por libro).
  - Capacidad cilíndrica: `(π * (ancho/2) * (largo/2) * alto) / 3000` libros.
  - Libros almacenados: 80% de la capacidad para `Estanteria`, 70% para `EstanteriaCilindrica`.
  - Constructor secundario: 3000 cm³ por libro + 20% extra.
- **Validaciones**: Los setters no incluyen validación de división por cero; considera agregarlas para producción.

## Contribuciones

Si deseas contribuir:
1. Haz un fork del repositorio.
2. Crea una rama para tus cambios (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios y haz commit (`git commit -m "Agrega nueva funcionalidad"`).
4. Envía un pull request.

## Notas

- **Extensibilidad**: Puedes agregar más tipos de estanterías (por ejemplo, triangulares) o libros (por ejemplo, poesía) extendiendo las clases/interfaces.
- **Mejoras sugeridas**:
  - Agregar validaciones en setters para evitar divisiones por cero o valores negativos.
  - Usar `Double` para cálculos más precisos en lugar de `Int` para `capacidad`.
  - Implementar métodos adicionales en `AccionLibro` (por ejemplo, `prestar()` o `devolver()`).

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
