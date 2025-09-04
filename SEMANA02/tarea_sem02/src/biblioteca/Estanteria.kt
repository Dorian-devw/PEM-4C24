package biblioteca

import kotlin.math.PI

open class Estanteria(
    open var largo: Int = 120,
    open var ancho: Int = 30,
    open var alto: Int = 180
) {
    open var capacidad: Int
        get() = (ancho * largo * alto) / 3000
        set(valor) {
            alto = (valor * 3000) / (ancho * largo)
        }

    open val forma = "rectangular"

    open var librosAlmacenados: Double = 0.0
        get() = capacidad * 0.8

    init {
        println("Inicializando estantería")
    }

    constructor(numeroDeLibros: Int) : this() {
        val espacio = numeroDeLibros * 3000 * 1.2
        alto = (espacio / (largo * ancho)).toInt()
    }

    open fun imprimirDetalles() {
        println("Forma: $forma")
        println("Ancho: $ancho cm, Largo: $largo cm, Alto: $alto cm")
        println("Capacidad: $capacidad libros, Libros almacenados: $librosAlmacenados (${librosAlmacenados / capacidad * 100.0}% lleno)")
    }
}

class EstanteriaCilindrica(
    override var alto: Int,
    var diametro: Int
    ) : Estanteria(alto = alto, ancho = diametro, largo = diametro) {

    override var capacidad: Int
        get() = (ancho / 2 * largo / 2 * alto / 3000 * PI).toInt()
        set(valor) {
            alto = ((valor * 3000 / PI) / (ancho / 2 * largo / 2)).toInt()
        }

    override var librosAlmacenados: Double = 0.0
        get() = capacidad * 0.7

    // Sobrescribe la forma.
    override val forma = "cilíndrica"
}