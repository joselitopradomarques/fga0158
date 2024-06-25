package ex02;

public class Palindromo {
	String word = "", 
		   inverse = "";
	int count;
	boolean ehPalindromo;
	
	
	// Método de Construtor Padrão
	public Palindromo() {
	}
	
	public Palindromo(String word1) {
		word = word1;
	}
	
	String setWord(String word1) {
		word = word1;
		return word;
	}
	
	boolean testPalindromo() {
		// Método que verifica se a palavra é um palíndromo ou não
		// Deve retornar uma variável booleana
        inverse = new StringBuilder(word).reverse().toString();
        ehPalindromo = word.equals(inverse);
        return ehPalindromo;
	}
	
	int countVowels() {
		// Construir método para verificar a quantidade de vogais
		// Esse método recebe word
		// E conta a quantidade de vogais
		count = 0;
		for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            // Verifica se o caractere atual é uma vogal e incrementa o contador
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
		}
		return count;
	}
	
	String inverseWord() {
		
		// Construir método para inverter a palavra
		// Esse método recebe a string Word
		// E inverte a string
		
		StringBuilder sb = new StringBuilder(word);
		inverse = sb.reverse().toString();
		return inverse;
	}
	
	boolean getStatus() {
		// Método de acesso para status de se a palavra é palindromo
		return ehPalindromo;
	}
	
	String getWord() {
		// Método de acesso a palavra inserida pelo usuário
		return word;
	}
	
	String getInverse() {
		// Método de acesso a palavra invertida
		return inverse;
	}
	
	int getCount() {
		// Método de acesso a quantidade de vogais da palavra digitada
		return count;
	}
	
}
