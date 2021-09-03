class Professor(var nomeProfessor:String, var sobrenomeProfessor:String,var tempoDeCasa:Int,var codigoDeProfessor:Int) {
    override fun equals(other: Professor): Boolean {
        return this.codigoDeProfessor==other.codigoDeProfessor
    }
}