class ProfessorAdjunto(
    nomeProfessor: String, sobrenomeProfessor: String,
    tempoDeCasa: Int, codigoDeProfessor: Int, var tempoDeMonitoria: Int
) : Professor(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoDeProfessor) {
}