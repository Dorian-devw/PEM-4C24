package biblioteca

interface AccionLibro { fun leer() }

abstract class Libro { abstract val genero: String }

class Novela : Libro(), AccionLibro {
    override val genero = "ficción"

    override fun leer() { println("Leer una historia emocionante") }
}

class Ensayo : Libro(), AccionLibro {
    override val genero = "no ficción"

    override fun leer() { println("Analizar ideas y argumentos") }
}