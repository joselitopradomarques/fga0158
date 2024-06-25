package ex01;

public class Calculadora {
	
	// Definição de Atributos
	
	int op1,
		op2, 
		resultado;
	
	
	// Método Construtor Alternativo
	
	public Calculadora (int o1, int o2) {
		op1 = o1;
		op2 = o2;
	}
	
	// Método Construtor Padrão
	public Calculadora () {
		
	}
	
	void setOp1(int op) {
		op1 = op;
	}
	
	void setOp2(int op) {
		op2 = op;
	}
	
	int getOp1() {
		return op1;
	}
	
	int getOp2() {
		return op2;
	}
	
	int getResultado() {
		return resultado;
	}
	
	int somar() {
		resultado = op1 + op2;
		return resultado;
	}
	
	int subtracao() {
		resultado = op1 - op2;
		return resultado;
	}
	
	int produto() {
		resultado = op1*op2;
		return resultado;
	}
	
	int divisao() {
		resultado = op1/op2;
		return resultado;
	}
}
