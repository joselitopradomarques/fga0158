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
        curso = c;
        ira = i;
    }


    // Criação de outros métodos de acesso e de definição

    int getMatricula() {
        return matricula;
    }

    void setMatricula(int mat) {
        matricula = mat;
    }

    String getNome() {
        return nome;
    }

    void setNome(String n) {
        nome = n;
    }   

    String getCurso() {
        return curso;
    }

    void setCurso(String c) {
        curso = c;
    }

    float getIra() {
        return ira;
    }

    void setIra(float i) {
        ira = i;
    }

    String imprimirAluno() {
		String resposta = "";
		
		resposta += "MATRICULA: " + matricula + '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "CURSO: " + curso + '\n'; 
		resposta += "IRA: " + ira + '\n';
		resposta += "---------------------\n";
		
		return resposta;
	}

}
