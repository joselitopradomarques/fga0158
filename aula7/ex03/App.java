package ex03;

public class App {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();

        sistema.criarCurso("Engenharia de Redes", 5000, "Noturno");
        sistema.cadastrarDisciplina("Introdução a Álgebra", "14023", 5000, "ALberto Soares");
        sistema.adicionarAluno("Fabrício Souza de Fávio", "14/0023704", "fabricio", "Engenharia de Redes");
        sistema.pesquisarAlunosPorCurso("Engenharia de Redes");
    }
}
