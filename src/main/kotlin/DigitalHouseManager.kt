class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno>, var listaDeProfessores: MutableList<Professor>,
    var listaDeCursos: MutableList<Curso>, var listaDeMatriculas: MutableList<Matricula>
) {
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaAlunos: Int) {
        var novoCurso = Curso(nome, codigoCurso, quantidadeMaximaAlunos)
        listaDeCursos.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        for (item in listaDeCursos) {
            if (item.codigoCurso == codigoCurso) {
                listaDeCursos.remove(item)
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, horasMonitoria: Int) {
        var novoProfessorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigo, horasMonitoria)
        listaDeProfessores.add(novoProfessorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        var novoProfessorTitular = ProfessorTitular(nome, sobrenome, 0, codigo, especialidade)
        listaDeProfessores.add(novoProfessorTitular)
    }

    fun excluirProfessor(codigo: Int) {
        for (item in listaDeProfessores) {
            if (item.codigoDeProfessor == codigo) {
                listaDeProfessores.remove(item)
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigo: Int) {
        var novoAluno = Aluno(nome, sobrenome, codigo)
        listaDeAlunos.add(novoAluno)
    }
}