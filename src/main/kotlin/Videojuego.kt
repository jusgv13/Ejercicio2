class Videojuego : Entregable {


    var titulo : String = ""
    var hEstimadas : Int = 10
    var entregado : Boolean = false
    var genero  : String = ""
    var compañia : String = ""

    //Constructor por Defecto
    constructor(){
    }

    //Un constructor con el titulo y horas estimadas. El resto por defecto.
    constructor(titulo: String, hEstimadas: Int) {
        this.titulo = titulo
        this.hEstimadas = hEstimadas
    }

    //Un constructor con todos los atributos, excepto de entregado.
    constructor(titulo: String, hEstimadas: Int, genero: String, compañia: String) {
        this.titulo = titulo
        this.hEstimadas = hEstimadas
        this.genero  = genero
        this.compañia = compañia
    }

    override fun entregar() {
        this.entregado = true
    }

    override fun devolver() {
        this.entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }

}