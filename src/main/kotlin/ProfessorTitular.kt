class ProfessorTitular(
    nomeProfessor: String, sobrenomeProfessor: String,
    tempoDeCasa: Int, codigoDeProfessor: Int, var especialidade: String
) : Professor(
    nomeProfessor, sobrenomeProfessor,
    tempoDeCasa, codigoDeProfessor
) {

}