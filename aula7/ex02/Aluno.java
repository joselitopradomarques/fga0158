package ex02;
import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private String
           nomeCompleto,
           numeroMatricula,
           email;
    private Curso curso;
    private List<Disciplina> disciplinas;

    public Aluno() {
        System.out.println("Executei o metodo padrao aluno");
    }

    public Aluno (String nomeCompleto, String email, String numeroMatricula) {
        this.nomeCompleto = nomeCompleto;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.disciplinas = new ArrayList<>();
        System.out.println("Executei o metodo alternativo aluno");
    }

    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getEmail() {
        return email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }
}
