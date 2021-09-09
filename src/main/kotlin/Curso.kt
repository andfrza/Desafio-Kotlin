class Curso(var nomeDoCurso: String, var codigoCurso: Int, var quantidadeMaximaDeAlunos: Int) {

    constructor(
        nomeDoCurso: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int, professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto, listaDeAlunosMatriculados: MutableList<Aluno>
    ) : this(nomeDoCurso, codigoCurso, quantidadeMaximaDeAlunos) {
        fun adicionarAluno(aluno: Aluno): Boolean {
            return listaDeAlunosMatriculados.size <= quantidadeMaximaDeAlunos
        }

        fun excluirAluno(aluno: Aluno) {
            listaDeAlunosMatriculados.remove(aluno)
        }
    }

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigoCurso == other.codigoCurso)
    }

}
