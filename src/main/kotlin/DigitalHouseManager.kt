class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno>, var listaDeProfessores: MutableList<Professor>,
    var listaDeCursos: MutableList<Curso>, var listaDeMatriculas: MutableList<Matricula>
){
    fun registrarCurso(nome:String,codigoCurso:Int,quantidadeMaximaAlunos:Int){
        var novoCurso = Curso(nome,codigoCurso,quantidadeMaximaAlunos)
        listaDeCursos.add(novoCurso)
    }
}