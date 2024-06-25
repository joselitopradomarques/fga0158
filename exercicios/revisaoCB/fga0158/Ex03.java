package fga0158;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;




public class Ex03 {

	public static void main(String[] args) throws IOException {
		/*
		 * Ler 10 números inteiros e alocar em v1
		 * Ler 10 números inteiros e alocar em v2
		 * Criar um vetor v3 com v1 e v2
		 * Ordenar v3
		 */	
		
		int[] v1 = obter_vetor();
		int[] v2 = obter_vetor();
		int[] v3 = criar_v3(v1, v2);
		Arrays.sort(v3);
		print_vetor(v1);
		print_vetor(v2);
		print_vetor(v3);
		FileWriter fw = new FileWriter("combinado.txt");  //instanciação do objeto FileWriter
		BufferedWriter bw = new BufferedWriter(fw);     //instanciação do objeto BufferedWriter

		for (int num : v3) {
			bw.write(Integer.toString(num));            //Escrita de uma string no buffer. Note a conversão de tipo! 
			bw.write('\n');
		}
		bw.close();
		
	}
	
	public static int[] criar_v3(int[] vetor1, int[] vetor2) {
		int[] vetor = new int[20];

		for(int i = 0; i<10; i++) {
			vetor[i] = vetor1[i];
		}
		
		for(int i = 0; i<10; i++) {
			vetor[i+10] = vetor2[i];
		}
		return vetor;
	}
	
	public static int[] obter_vetor() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 10 números inteiros positivos do vetor separados por espaços:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        return vetor;
	}
	
	public static void print_vetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
	

	
	

}



