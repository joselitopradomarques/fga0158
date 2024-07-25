package ex03;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeCompleto;
    private String numeroMatricula;
    private String email;
    private Curso curso;
    private List<Disciplina> disciplinas;

    // Setters and Getters

    public Aluno() {
        System.out.println("O método de construtor padrão para Aluno() padrão foi executado!");
    }

    public Aluno(String nomeCompleto, String numeroMatricula, String email) {
        this.nomeCompleto = nomeCompleto;
        this.numeroMatricula = numeroMatricula;
        this.email = email;
        this.disciplinas = new ArrayList<>();
        this.curso = curso;
        System.out.println("O método de construtor alternativo para Aluno() padrão foi executado!");
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

    public List<Disciplina> getdisciplina () {
        return disciplinas;
    }


     public void matricularDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) { // Verifica se a disciplina não está na lista
            disciplinas.add(disciplina); // Adiciona a disciplina à lista
            System.out.println("O aluno " + this.nomeCompleto + " foi matriculado na disciplina " + disciplina);
        }
    }
        

























}   
