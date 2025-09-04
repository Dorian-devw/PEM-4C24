package acuario

interface AccionPez {
    fun comer() }

abstract class Pez {abstract val color: String }

class Tiburón : Pez(), AccionPez {
    override val color = "gris"
    override fun comer() { println("cazar y comer peces") }
}

class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"
    override fun comer() { println("comer algas") }
}