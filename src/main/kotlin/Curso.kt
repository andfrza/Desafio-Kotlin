class Curso(var nomeCurso:String,var codigoCurso:Int) {
    override fun equals(other: Curso): Boolean {
        return (this.codigoCurso==other.codigoCurso)
    }
}