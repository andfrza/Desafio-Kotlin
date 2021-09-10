fun main() {
    var diretor = DigitalHouseManager()
    diretor.registrarProfessorTitular("Raphael", "Corrêa", 2, "Eletricidade")
    diretor.registrarProfessorTitular("Inácio", "Alves", 3, "Cálculo")
    diretor.registrarProfessorAdjunto("Wilmer", "Sousa", 10, 102)
    diretor.registrarProfessorAdjunto("Maniesi", "Gomes", 12, 103)

    diretor.registrarCurso("Full Stack", 20001, 3)
    diretor.registrarCurso("Android", 20002, 2)

    diretor.alocarProfessores(20001, 10, 2)
    diretor.alocarProfessores(20002, 12, 3)

    diretor.matricularNovoAlunoNaDH("Luis", "Gabardo", 2512)
    diretor.matricularNovoAlunoNaDH("Bruno", "Kreitolv", 2005)
    diretor.matricularNovoAlunoNaDH("Felipe", "Filho", 709)
    diretor.matricularNovoAlunoNaDH("Ayrton", "Senna", 1989)
    diretor.matricularNovoAlunoNaDH("Margaret", "Tatcher", 1990)


    diretor.matricularAlunoEmCurso(2512, 20001)
    diretor.matricularAlunoEmCurso(2005, 20001)
    diretor.matricularAlunoEmCurso(709, 20002)
    diretor.matricularAlunoEmCurso(1989, 20002)
    diretor.matricularAlunoEmCurso(1990, 20002)

}
