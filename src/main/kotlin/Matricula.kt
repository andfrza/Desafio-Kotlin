import java.util.Date
class Matricula(var aluno: Aluno,var curso: Curso,var dataDeMatricula:Date) {
    var matricula:MutableList<Matricula> = mutableListOf()

    constructor(aluno:Aluno,curso:Curso,dataDeMatricula: Date,efetivacaoMatricula: Matricula):this(aluno,curso,dataDeMatricula){
        this.dataDeMatricula=Date()
        efetivacaoMatricula.matricula.add(this)
    }
}

//O construtor secundário precisa receber um parâmetro extra, senão dará "referência circular".

