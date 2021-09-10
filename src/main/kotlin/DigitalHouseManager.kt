class DigitalHouseManager {
    var listaDeAlunos: MutableList<Aluno> = mutableListOf()
    var listaDeProfessoresTitulares: MutableList<ProfessorTitular> = mutableListOf()
    var listaDeProfessoresAdjuntos: MutableList<ProfessorAdjunto> = mutableListOf()
    var listaDeCursos: MutableList<Curso> = mutableListOf()
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf()

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
        listaDeProfessoresAdjuntos.add(novoProfessorAdjunto)
    }

    fun registrarProfessorTitular(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        especialidade: String
    ) {
        var novoProfessorTitular =
            ProfessorTitular(nomeProfessor, sobrenomeProfessor, 0, codigoProfessor, especialidade)
        listaDeProfessoresTitulares.add(novoProfessorTitular)
    }

    fun excluirProfessorTitular(codigoProfessor: Int) {
        for (item in listaDeProfessoresAdjuntos) {
            if (item.codigoDeProfessor == codigoProfessor) {
                listaDeProfessoresAdjuntos.remove(item)
            }
        }
    }

    fun excluirProfessorAdjunto(codigoProfessor: Int) {
        for (item in listaDeProfessoresTitulares) {
            if (item.codigoDeProfessor == codigoProfessor) {
                listaDeProfessoresTitulares.remove(item)
            }
        }
    }

    fun matricularNovoAlunoNaDH(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {
        var novoAluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
        listaDeAlunos.add(novoAluno)
    }

    fun matricularAlunoEmCurso(codigoAluno: Int, codigoCurso: Int) {

        var possibilidadeMatricula: Boolean

        for (item in listaDeAlunos) {
            if (item.codigoDeAluno == codigoAluno) {
                for (item2 in listaDeCursos) {
                    if (item2.codigoCurso == codigoCurso) {
                        possibilidadeMatricula = item2.adicionarAluno(item)
                        if (possibilidadeMatricula) {
                            var novaMatricula = Matricula(item, item2)
                            listaDeMatriculas.add(novaMatricula)
                            println("${item} foi matriculado(a) com sucesso!")
                            println()
                        } else {
                            println("Desculpe, não há vagas disponíveis.")
                        }
                    }
                }
            }

        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorAdjunto: Int, codigoProfessorTitular: Int) {
        for (adjunto in listaDeProfessoresAdjuntos) {
            if (adjunto.codigoDeProfessor == codigoProfessorAdjunto) {
                for (titular in listaDeProfessoresTitulares) {
                    if (titular.codigoDeProfessor == codigoProfessorTitular) {
                        for (curso in listaDeCursos) {
                            if (curso.codigoCurso == codigoCurso) {
                                listaDeCursos[listaDeCursos.indexOf(curso)] = Curso(
                                    curso.nomeDoCurso,
                                    curso.codigoCurso,
                                    curso.quantidadeMaximaDeAlunos,
                                    titular,
                                    adjunto
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
