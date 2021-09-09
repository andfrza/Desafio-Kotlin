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

    fun registrarProfessorAdjunto(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        horasMonitoria: Int
    ) {
        var novoProfessorAdjunto =
            ProfessorAdjunto(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor, horasMonitoria)
        listaDeProfessores.add(novoProfessorAdjunto)
    }

    fun registrarProfessorTitular(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        var novoProfessorTitular =
            ProfessorTitular(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor, especialidade)
        listaDeProfessores.add(novoProfessorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (item in listaDeProfessores) {
            if (item.codigoDeProfessor == codigoProfessor) {
                listaDeProfessores.remove(item)
            }
        }
    }

    fun matricularAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {
        var novoAluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
        listaDeAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

        var possibilidadeMatricula: Boolean

        for (item in listaDeAlunos) {
            if (item.codigoDeAluno == codigoAluno) {
                for (item2 in listaDeCursos) {
                    if (item2.codigoCurso == codigoCurso) {
                        possibilidadeMatricula = item2.adicionarAluno(item)
                        if(possibilidadeMatricula){
                            var novaMatricula = Matricula(item,item2)
                            listaDeMatriculas.add(novaMatricula)
                            println("Matrícula realizada com sucesso!")
                        }
                        else{println("Desculpe, não foi possível realizar a sua matrícula por falta de vagas.")}
                    }
                    else{println("Curso não encontrado.")}
                }
            }
            else{println("Aluno não encontrado.")}
        }
    }

    fun alocarProfessores(codigoCurso: Int,codigoProfessorAdjunto: Int, codigoProfessorTitular: Int){
        for (adjunto in listaDeProfessores){
            if(adjunto.codigoDeProfessor==codigoProfessorAdjunto){
                for(titular in listaDeProfessores){
                    if(titular.codigoDeProfessor==codigoProfessorTitular){
                        for (curso in listaDeCursos){
                            if(curso.codigoCurso==codigoCurso){
                                listaDeCursos[listaDeCursos.indexOf(curso)]=Curso(curso.nomeDoCurso,curso.codigoCurso,curso.quantidadeMaximaDeAlunos,titular,adjunto)
                            }else{println("Curso não encontrado.")}
                        }
                    }else{println("Professor titular não encontrado.")}
                }
            }else{println("Professor adjunto não encontrado.")}
        }
    }
}
