package aula07;

import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame{
	
	/***
	 * 
	 * @param args
	 * @throws InterruptedException
	 * 
	 * Quando nenhum argumento é passado ao operando2, o código trava; enquanto deveria continuar normalmente.
	 * Qual é o erro que está acontecendo?
	 */

	
	public static void main(String[] args) throws InterruptedException {
		//referencia para objeto Calculadora
		Calculadora calc;
		
		boolean opcao;
		do {
			String strOpcao = JOptionPane.showInputDialog("Usuário desejar realizar um cálculo? (sim/nao)");
			opcao = (strOpcao.equalsIgnoreCase("Sim") ? true : false);

            if (!opcao) {
	            calc = null;
	            Thread.sleep(1000);
	            System.gc(); // Chamada explícita ao coletor de lixo.
                break;
            } else {       

            	
            }
			String strOp1 = JOptionPane.showInputDialog("Informe o valor do operando1:");
			String strOp2 = JOptionPane.showInputDialog("Informe o valor do operando2:");
			String strOp3 = JOptionPane.showInputDialog("Informe a operação desejada: (+, -, *, /, ! -> inversão de sinal): ");
			
			int operando1 = Integer.parseInt(strOp1);
			int operando2 = Integer.parseInt(strOp2);
			char operando3 = strOp3.charAt(0);
			int resultado = 0;
			
			calc = new Calculadora(operando1, operando2);
			
			//instanciacao do objeto Calculadora
			switch (operando3) {
            case '+':
                resultado = calc.calcularSoma();
                break;
            case '-':
                resultado = calc.calcularSubtracao();
                break;
            case '*':
                resultado = calc.calcularMultiplicacao();
                break;
            case '/':
                resultado = calc.calcularDivisao();
                break;
            case '!':
                resultado = calc.inverterSinal();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida!");
                continue;
        }

        JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
			
		} while (opcao);
	}

}
