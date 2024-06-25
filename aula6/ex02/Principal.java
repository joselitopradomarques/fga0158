package ex02;

public class Principal {

	public static void main(String[] args) {

		Palindromo p1, p2;
		
		p1 = new Palindromo();
		p1.setWord("amamamama");
		p1.inverseWord();
		p1.countVowels();
		p1.testPalindromo();

		//System.out.println(p1.getWord()+"  " +p1.inverseWord()+p1.testPalindromo()+ " a quantidade de vogais eh: " + p1.countVowels());
		System.out.println("A palavra digitada foi: " + p1.getWord());
		System.out.println("A palavra digitada é um palindromo? : "+ p1.getStatus());
		System.out.println("A quantidade de vogais da palavra digitada eh: " + p1.getCount());
		System.out.println("O inverso da palavra digitada eh: " + p1.getInverse());
		System.out.println();
		p2 = new Palindromo("exu eh mojuba");
		p2.inverseWord();
		p2.countVowels();
		p2.testPalindromo();

		//System.out.println(p1.getWord()+"  " +p1.inverseWord()+p1.testPalindromo()+ " a quantidade de vogais eh: " + p1.countVowels());
		System.out.println("A palavra digitada foi: " + p2.getWord());
		System.out.println("A palavra digitada é um palindromo? : "+ p2.getStatus());
		System.out.println("A quantidade de vogais da palavra digitada eh: " + p2.getCount());
		System.out.println("O inverso da palavra digitada eh: " + p2.getInverse());
	}
}
