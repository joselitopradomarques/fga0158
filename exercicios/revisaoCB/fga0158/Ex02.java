/* Receber os nomes das lojas
 * Receber o nome dos produtos
 * 
 * A partir do tamanho do vetor de lojas e de produtos, obtém-se as dimensões da matriz
 * Gerar uma matriz booleana aleatória com as dimensões dadas
 * 
 * Para cada linha de nome de loja, percorrer os produtos que estão 
 * 
 * 
 */

package fga0158;
import java.util.Scanner;
import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicita ao usuário que insira os nomes das lojas
        System.out.print("Escreva Lojas: ");
        String[] lojas = scanner.nextLine().split(" ");
        
        // Solicita ao usuário que insira os nomes dos produtos
        System.out.print("Escreva Produtos: ");
        String[] produtos = scanner.nextLine().split(" ");
        
        // Gera uma matriz booleana aleatória indicando se a loja vende o produto
        boolean[][] matriz = new boolean[lojas.length][produtos.length];
        for (int i = 0; i < lojas.length; i++) {
            for (int j = 0; j < produtos.length; j++) {
                matriz[i][j] = random.nextBoolean();
            }
        }
        
        // Printa para cada loja os produtos disponíveis
        for (int i = 0; i < lojas.length; i++) {
            System.out.print(lojas[i] + ": ");
            boolean primeiroProduto = true;
            for (int j = 0; j < produtos.length; j++) {
                if (matriz[i][j]) {
                    if (!primeiroProduto) {
                        System.out.print(", ");
                    }
                    System.out.print(produtos[j]);
                    primeiroProduto = false;
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
