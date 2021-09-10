class Aluno(var nomeAluno:String,var sobrenomeAluno:String,var codigoDeAluno:Int) {
    override fun equals(other: Any?): Boolean {
        return (other is Aluno&&this.codigoDeAluno==other.codigoDeAluno)
    }

    override fun toString(): String {
        return nomeAluno
    }
}