class Curso(var nomeCurso:String,var codigoCurso:Int, var professorTitular:ProfessorTitular,var professorAdjunto:ProfessorAdjunto, var quantidadeMaximaDeAlunos:Int,var listaDeAlunosMatriculados:MutableList<Aluno>) {
    override fun equals(other: Any?): Boolean {
        return (other is Curso&&this.codigoCurso==other.codigoCurso)
    }
}
//Parte E: adcionando os demais atributos de classe.