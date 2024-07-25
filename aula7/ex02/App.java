package ex02;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();

        sistema.criarCurso("Engenharia de Redes", 5000, "Noturno");
        sistema.cadastrarDisciplina("Introdução à Tecelagem", "RED4004", 20,"MArcos" );
        sistema.adicionarAluno("João Pinto", "19/00000", "joao.pinto.mole@gmail.com", "Engenharia de Redes", Arrays.asList("RED4004"));

        // Exemplo de emissão de relatório
        sistema.emitirRelatorioAluno("19/00000");

        // Pesquisar alunos por curso
        sistema.pesquisarAlunosPorCurso("Engenharia de Software");
        sistema.pesquisarAlunosPorCurso("Administração");

        // Pesquisar alunos por disciplina
        sistema.pesquisarAlunosPorDisciplina("MAT/001");
        sistema.pesquisarAlunosPorDisciplina("CSI/002");
    }
}
