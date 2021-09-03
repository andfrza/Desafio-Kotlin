class Curso(var nomeCurso:String,var codigoCurso:Int) {
    override fun equals(other: Any?): Boolean {
        return (other is Curso&&this.codigoCurso==other.codigoCurso)
    }
}