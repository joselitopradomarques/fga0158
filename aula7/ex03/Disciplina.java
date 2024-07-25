package ex03;

import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private String codigoDisciplina;
    private String professor;
    private int cargaHoraria;
    private List<Curso> cursos;
    

    public Disciplina() {
        System.out.println("O método construtor padrão Disciplina() foi executado!");
    }

    public Disciplina(String nomeDisciplina, String codigoDisciplina, int cargaHoraria, String professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        System.out.println("O método construtor alternativo Disciplina() foi executado!");
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<Curso> getCursos () {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("O curso " + curso.getNomeCurso() + " foi criado!");
        }
    }











    
}
