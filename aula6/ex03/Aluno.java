package ex03;

public class Aluno {

    // Definição de atributos de aluno
    int matricula;
    String nome,
           curso;
    float ira;

    // Definição de Métodos de Alunos

    // Método de Construção Padrão
    Aluno() {

    }

    // Método de Construção Alternativo
    Aluno(int mat, String n, String c, float i) {
        matricula = mat;
        nome = n;
        c = curso;
        i = ira;
    }


    // Criação de outros métodos de acesso e de definição

    String getNome() {
        return nome;
    }
    

}
