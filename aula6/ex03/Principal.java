package ex03;

public class Principal {
    
    public static void main(String[] args) {
        
        Aluno a1, a2;

        a1 = new Aluno();
        a1.setNome("Francisco");
        a1.setCurso("Engenharia de Energia");
        a1.setIra(3.4f);
        a1.setMatricula(190023345);
        System.out.println(a1.imprimirAluno());


        a2 = new Aluno(19002334, "Joselito", "aeroespacial", 4.1f);
        a2.setMatricula(100000000);
        System.out.println(a2.imprimirAluno());
    }
}
