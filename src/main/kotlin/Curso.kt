class Curso(
    var nomeCurso: String, var codigoCurso: Int, var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto, var quantidadeMaximaDeAlunos: Int,
    var listaDeAlunosMatriculados: MutableList<Aluno>
) {
    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigoCurso == other.codigoCurso)
    }

    fun adicionarAluno(aluno: Aluno):Boolean{
        return listaDeAlunosMatriculados.size<=quantidadeMaximaDeAlunos
    }
    fun excluirAluno(aluno: Aluno){
        listaDeAlunosMatriculados.remove(aluno)
    }
}


//Parte E: adcionando os demais atributos de classe.
//Parte H: adicionando novos métodos à classe.