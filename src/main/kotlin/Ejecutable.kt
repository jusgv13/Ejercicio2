class Ejecutable {

    fun interaccion() {

        //Serie

        var series = arrayOf<Serie>()

        val serie1 = Serie("Vikingos", 6, "Acción", "Aaron");
        val serie2 = Serie("Chespirito", 20, "Comedia", "Roberto");
        val serie3 = Serie("Combate", 2, "Drama", "Aaron");
        val serie4 = Serie("Naruto", 10, "Romance", "Carlos");
        val serie5 = Serie("OnePiece", 20, "Shonen", "Justin");

        series = series.plus(serie1)
        series = series.plus(serie2)
        series = series.plus(serie3)
        series = series.plus(serie4)
        series = series.plus(serie5)

        //Series Entregados o Por Devolver
        serie1.entregar()
        serie2.devolver()
        serie3.devolver()
        serie4.entregar()
        serie5.devolver()

        //Consulta si una de las Series está entregada

        println("La serie consultada ha sido Entregado: " + serie3.isEntregado())

        //Consulta cuantas Series hay Entregadas

        var seriesContador = 0

        for(i in series.indices){
            if(series[i].isEntregado()){
                seriesContador++
            }

        }

        println("Series Entregadas: " + seriesContador)

        //Video Juego

        var videojuego = arrayOf<Videojuego>()

        val videojuego1 = Videojuego("MortalKombat", 10, "Acción", "Warner");
        val videojuego2 = Videojuego("GodofWar", 10, "Acción", "Sony");
        val videojuego3 = Videojuego("FIFA", 10, "Acción", "EA");
        val videojuego4 = Videojuego("SpiderMan", 10, "Acción", "Sony");
        val videojuego5 = Videojuego("Crash", 10, "Acción", "Activision");

        videojuego = videojuego.plus(videojuego1)
        videojuego = videojuego.plus(videojuego2)
        videojuego = videojuego.plus(videojuego3)
        videojuego = videojuego.plus(videojuego4)
        videojuego = videojuego.plus(videojuego5)

        //Video Juegos Entregados o Por Devolver
        videojuego1.entregar()
        videojuego2.devolver()
        videojuego3.devolver()
        videojuego4.entregar()
        videojuego5.entregar()

        //Consulta si uno de los Video Juegos está entregado

        println("El Video Juego consultado ha sido Entregado: " + videojuego5.isEntregado())

        //Consulta cuantos Video Juegos hay entregados

        var videoJuegoContador = 0

        for(i in videojuego.indices){
            if(videojuego[i].isEntregado()){
                videoJuegoContador++
            }

        }

        println("Video Juegos Entregadas: " + videoJuegoContador)

    }

}