open class Professor(var nomeProfessor:String, var sobrenomeProfessor:String,var tempoDeCasa:Int,var codigoDeProfessor:Int) {
    override fun equals(other: Any?): Boolean {
        return other is Professor&&this.codigoDeProfessor==other.codigoDeProfessor
    }
    override fun toString(): String {
        return "${nomeProfessor} ${sobrenomeProfessor}"
    }
    init {
        if(tempoDeCasa<0){
            tempoDeCasa=0
        }
    }
}