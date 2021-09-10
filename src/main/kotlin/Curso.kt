class Curso(var nomeDoCurso: String, var codigoCurso: Int, var quantidadeMaximaDeAlunos: Int) {

    var listaDeAlunosMatriculados = mutableListOf<Aluno>()
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    constructor(
        nomeDoCurso: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int, professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto
    ) : this(nomeDoCurso, codigoCurso, quantidadeMaximaDeAlunos) {
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto
    }


    fun adicionarAluno(aluno: Aluno): Boolean {
        if (listaDeAlunosMatriculados.size < quantidadeMaximaDeAlunos) {
            listaDeAlunosMatriculados.add(aluno)
            return ((listaDeAlunosMatriculados.size - 1) < quantidadeMaximaDeAlunos)
        }
        return listaDeAlunosMatriculados.size < quantidadeMaximaDeAlunos
    }

    fun excluirAluno(aluno: Aluno) {
        listaDeAlunosMatriculados.remove(aluno)
    }

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigoCurso == other.codigoCurso)
    }

    override fun toString(): String {
        return "${professorTitular} e ${professorAdjunto} lecionam em ${nomeDoCurso}"
    }

}