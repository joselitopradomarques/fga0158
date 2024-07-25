package ex02;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private int cargaHoraria;
    private String turno;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Curso() {
        System.out.println("Executei o metodo curso");
    }

    public Curso(String nomeCurso, int cargaHoraria, String turno) {
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.turno = turno;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        System.out.println("Executei o metodo curso parametrizado");
    }

    // Getters e setters
    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getTurno() {
        return turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina " + disciplina.getNomeDisciplina() + " cadastrada no curso " + this.nomeCurso);
        }
    }

    public void matricularAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            aluno.setCurso(this);
            System.out.println("Aluno " + aluno.getNomeCompleto() + " matriculado no curso " + this.nomeCurso);
        }
    }
}
