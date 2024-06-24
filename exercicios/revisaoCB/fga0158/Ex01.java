package fga0158;

import java.util.Random;


/* Input: none
 * 
 * 1) Gerar uma matriz 4x4
 * 2) Para cada valor, declarar un número aleatório
 * 3) Printar os valores das diagonais
 * 
 * 
 */

public class Ex01 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = r.nextInt(0, 9);
            }
        }
		
		printMatrix(matriz);
		System.out.println();
		
		for(int k = 0; k<4; k++){
			System.out.print(matriz[k][k]+ " ");
		}
	}
	
    public static void printMatrix(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
