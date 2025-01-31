fun main(){
    val libro1 = Libro("Pompa de Chicle", "Dylan Keats", 3000)
    val libro2 = Libro("Gran Lobo", "Mark Krueger", 244)

    libro1.puntuarLibro(7)
    libro2.puntuarLibro(4)

    val conjunto = ConjuntoLibros()
    conjunto.anadirLibro(libro1)
    conjunto.anadirLibro(libro2)

    conjunto.mejorPeorCalificacion()

    conjunto.eliminarLibro("Pompa de Chicle")
    conjunto.eliminarLibro("Mark Krueger")

    val libro3 = Libro("Vuelo de Ícaro", "Erik Eagle", 411)

    libro3.puntuarLibro(10)

    conjunto.anadirLibro(libro3)
    conjunto.mostrarConjunto()
}