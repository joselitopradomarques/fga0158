package ex03;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private String turno;
    private int cargaHoraria;
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;
    
    
    public Curso() {
        System.out.println("O método construtor padrão Curso() foi executado!");
    }

    public Curso(String nomeCurso, String turno, int cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;
        this.disciplinas = new  ArrayList<>();
        this.alunos = new ArrayList<>();
        System.out.println("O método construtor alternativo Cursos() foi executado!");
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getTurno() {
        return turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<Disciplina> getDisciplinas () {
        return disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void cadastrarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina " + disciplina.getNomeDisciplina() + " cadastrada no curso " + this.nomeCurso);
        }
    }

    /* Verificar para que serve o método abaixo
     * Não tô entendendo a necessidade dele
     * 
     */
    public void matricularAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNomeCompleto() + " foi matriculade no curso " + this.nomeCurso);
        }
    }


































}
