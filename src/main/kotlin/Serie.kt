class Serie : Entregable  {


    var titulo : String = ""
    var nTemporadas : Int = 3
    var entregado : Boolean = false
    var genero  : String = ""
    var creador : String = ""

    //Constructor por Defecto
    constructor(){
    }

    //Un constructor con el titulo y creador. El resto por defecto.
    constructor(titulo: String, creador: String) {
        this.titulo = titulo
        this.creador = creador
    }

    //Un constructor con todos los atributos, excepto de entregado.
    constructor(titulo: String, nTemporadas: Int, genero: String, creador: String) {
       this.titulo = titulo
        this.nTemporadas = nTemporadas
        this.genero  = genero
        this.creador = creador
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