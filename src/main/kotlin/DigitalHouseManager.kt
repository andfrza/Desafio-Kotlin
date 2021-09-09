class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno>, var listaDeProfessores: MutableList<Professor>,
    var listaDeCursos: MutableList<Curso>, var listaDeMatriculas: MutableList<Matricula>
){
    fun registrarCurso(nome:String,codigoCurso:Int,quantidadeMaximaAlunos:Int){
        var novoCurso = Curso(nome,codigoCurso,quantidadeMaximaAlunos)
        listaDeCursos.add(novoCurso)
    }
    fun excluirCurso(codigoCurso: Int){
        for (item in listaDeCursos){
            if(item.codigoCurso==codigoCurso){
                listaDeCursos.remove(item)
            }
        }
    }
}