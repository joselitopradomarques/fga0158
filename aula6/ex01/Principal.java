package ex01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c1,
					c2;
		
		c1 = new Calculadora(2,3); // Neste instante, um objeto é criado via métodod de criação alternativo
		c1.somar();
		
		c2 = new Calculadora(); // Objeto criado via método construtor padrão
		c2.setOp1(2);
		c2.setOp2(-2);
		c2.somar();
		c2.produto();
		
		
		System.out.println("O resultado de " + 
		           c1.getOp1() + " + " + c1.getOp2() + 
		           " e igual a " + c1.getResultado());
		System.out.println("O resultado de " + 
		           c1.getOp1() + " - " + c1.getOp2() + 
		           " e igual a " + c1.subtracao());
		
		//C2
		System.out.println("O resultado de " + 
				c2.getOp1() + " + " + c2.getOp2() + 
				" e igual a " + c2.getResultado());
	
	
	
	
	
	
	
	
	}

}
