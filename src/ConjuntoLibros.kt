class ConjuntoLibros {

    val arrayLibros: Array<Libro?> = arrayOfNulls(4)

    fun anadirLibro(libro: Libro): Boolean {
        for (i in arrayLibros.indices) {
            if (arrayLibros[i] == null) {
                arrayLibros[i] = libro
                println("Libro añadido: ${libro.titulo}")
                return true
            }
        }
        println("No hay espacio disponible para agregar el libro.")
        return false
    }

    fun eliminarLibro(nombre: String): Boolean {
        for (i in arrayLibros.indices) {
            if (arrayLibros[i] != null && (arrayLibros[i]!!.titulo == nombre || arrayLibros[i]!!.autor == nombre)) {
                println("Libro eliminado: ${arrayLibros[i]!!.titulo}")
                arrayLibros[i] = null
                return true
            }
        }
        println("No se encontró un libro con el título o autor '$nombre'.")
        return false
    }

    fun mejorPeorCalificacion() {
        val librosNoNulos = arrayLibros.filterNotNull()

        if (librosNoNulos.isEmpty()) {
            println("No hay libros en el conjunto.")
            return
        }

        val maxLibro = librosNoNulos.maxByOrNull { it.calificacion }
        val minLibro = librosNoNulos.minByOrNull { it.calificacion }

        println("El libro con más calificación se llama ${maxLibro?.titulo}, con una nota de ${maxLibro?.calificacion}.")
        println("El libro con menos calificación se llama ${minLibro?.titulo}, con una nota de ${minLibro?.calificacion}.")
    }


    fun mostrarConjunto() {
        println("Lista de libros en el conjunto:")
        for (libro in arrayLibros) {
            if (libro != null) {
                println("Título: ${libro.titulo}")
                println("Autor: ${libro.autor}")
                println("Páginas: ${libro.numPaginas}")
                println("Calificación: ${libro.calificacion}")
                println("-------------------------")
            }
        }
    }
}