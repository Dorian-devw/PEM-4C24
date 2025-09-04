package biblioteca

fun construirBiblioteca() {
    println("=== Demostración de Estanterías ===")

    val estanteria1 = Estanteria()
    estanteria1.imprimirDetalles()

    val estanteria2 = Estanteria(ancho = 40)
    estanteria2.imprimirDetalles()

    val estanteria3 = Estanteria(alto = 200, largo = 150)
    estanteria3.imprimirDetalles()

    val estanteria4 = Estanteria(ancho = 40, alto = 200, largo = 150)
    estanteria4.imprimirDetalles()

    val estanteria5 = Estanteria(numeroDeLibros = 50)
    estanteria5.imprimirDetalles()

    val estanteria6 = Estanteria(numeroDeLibros = 50)
    estanteria6.imprimirDetalles()
    estanteria6.capacidad = 100
    estanteria6.imprimirDetalles()

    val miEstanteria = Estanteria(ancho = 50, largo = 50, alto = 180)
    miEstanteria.imprimirDetalles()

    val miTorre = EstanteriaCilindrica(diametro = 50, alto = 180)
    miTorre.imprimirDetalles()
}

fun crearLibros() {
    println("Demostración de Libros")

    val novela = Novela()
    println("Género de la novela: ${novela.genero}")
    novela.leer()

    val ensayo = Ensayo()
    println("Género del ensayo: ${ensayo.genero}")
    ensayo.leer()
}

fun main() {
    construirBiblioteca()
    crearLibros()
}