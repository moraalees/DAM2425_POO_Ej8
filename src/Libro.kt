class Libro(val titulo: String, val autor: String, val numPaginas: Int){

    var calificacion: Int = 0
        set(value){
            require(calificacion in 0..10) { "La calificación debe estar entre 0-10." }
            field = value
        }

    fun puntuarLibro(nota: Int): Boolean{
        if (nota == calificacion){
            println("Has mantenido la calificación, debes introducir una diferente.")
            return false
        } else {
            calificacion = nota
            println("Calificación actualizada de $titulo a $nota.")
            return true
        }
    }

}