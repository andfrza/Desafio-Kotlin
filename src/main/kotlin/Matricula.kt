import java.util.Date

class Matricula(var aluno: Aluno, var curso: Curso) {

    var dataDeMatricula: Date = Date()

    constructor(aluno: Aluno, curso: Curso, dataDeMatricula: Matricula) : this(aluno, curso)

    override fun toString(): String {
        return "${aluno} foi matriculado(a) em ${curso} no dia ${dataDeMatricula}."
    }
}
