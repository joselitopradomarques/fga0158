package ex02;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private String codigoDisciplina;
    private int cargaHoraria;
    private String professor;
    private List<Curso> cursos;

    public Disciplina() {
        System.out.println("Executei o metodo disciplina");
    }

    public Disciplina(String nomeDisciplina, String codigoDisciplina, int cargaHoraria, String professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.cursos = new ArrayList<>();
        System.out.println("Executei o metodo disciplina parametrizado");
    }

    // Getters e setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
}
