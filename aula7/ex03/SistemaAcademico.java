package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaAcademico {

    private List<Aluno> alunos;
    private List<Curso> cursos;
    private List<Disciplina> disciplinas;

    public SistemaAcademico() {
        this.alunos = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        System.out.println("Executei o metodo construtor alternativo de sistema academico");
    }

    public void criarCurso(String nome, int cargaHoraria, String turno) {
        Curso curso = new Curso(nome, turno, cargaHoraria);
        cursos.add(curso);
        System.out.println("Curso criado: " + nome);
    }

    public void cadastrarDisciplina(String nome, String codigo, int cargaHoraria, String professor) {
        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria, professor);
        disciplinas.add(disciplina);
        System.out.println("Disciplina cadastrada: " + nome);
    }

    public void adicionarAluno(String nome, String matricula, String email, String nomeCurso) {
        Aluno aluno = new Aluno(nome, matricula, email);
        Curso curso = cursos.stream().filter(c -> c.getNomeCurso().equals(nomeCurso)).findFirst().orElse(null);
        if (curso != null) {
            curso.matricularAluno(aluno);
            alunos.add(aluno);
            System.out.println("Aluno adicionado: " + nome + " ao curso " + nomeCurso);
        } else {
            System.out.println("Curso não encontrado: " + nomeCurso);
        }
    }

    public List<Aluno> pesquisarAlunosPorCurso(String nomeCurso) {
        List<Aluno> alunosDoCurso = cursos.stream()
                .filter(curso -> curso.getNomeCurso().equals(nomeCurso))
                .flatMap(curso -> curso.getAlunos().stream())
                .collect(Collectors.toList());

        System.out.println("Alunos matriculados no curso " + nomeCurso + ":");
        for (Aluno aluno : alunosDoCurso) {
            System.out.println(" - " + aluno.getNomeCompleto() + " (" + aluno.getNumeroMatricula() + ")");
        }

        return alunosDoCurso;
    }

    public List<Aluno> pesquisarAlunosPorDisciplina(String codigoDisciplina) {
        List<Aluno> alunosDaDisciplina = disciplinas.stream()
                .filter(disciplina -> disciplina.getCodigoDisciplina().equals(codigoDisciplina))
                .flatMap(disciplina -> disciplina.getCursos().stream()
                        .flatMap(curso -> curso.getAlunos().stream())
                        .filter(aluno -> aluno.getDisciplinas().contains(disciplina)))
                .collect(Collectors.toList());

        System.out.println("Alunos matriculados na disciplina " + codigoDisciplina + ":");
        for (Aluno aluno : alunosDaDisciplina) {
            System.out.println(" - " + aluno.getNomeCompleto() + " (" + aluno.getNumeroMatricula() + ")");
        }

        return alunosDaDisciplina;
    }

    public void emitirRelatorioAluno(String matricula) {
        Aluno aluno = alunos.stream().filter(a -> a.getNumeroMatricula().equals(matricula)).findFirst().orElse(null);
        if (aluno != null) {
            System.out.println("Nome: " + aluno.getNomeCompleto());
            System.out.println("Curso: " + aluno.getCurso().getNomeCurso());
            System.out.println("Disciplinas:");
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println(" - " + disciplina.getNomeDisciplina());
            }
        }
    }
}
