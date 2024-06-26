

UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

### Exercícios de revisão de programação básica

Instruções para os exercícios:

- Essa é uma lista de revisão, a resolução dos exercícios não precisa ser
  entregue ao professor. 
- Ressalta-se que a resolução desses exercícios ajudará a compreender os
  conceitos e as estruturas de programação apresentadas até então. Portanto,
  recomenda-se fortemente que os exercícios sejam resolvidos.
- Os exercícios deverão ser resolvidos em sala de aula, e haverá chamada nessa
  data.

---

#### Exercícios de conceitos sobre programação: 

1. Tipos de dados
   - Tipos de dados primitivos
   - Referências

2. Variáveis
   - Conversão de tipos  

3. Estruturas de controle
   - if() {...} else {...}
   - switch() ... case: ... default: 

4. Estruturas de repetição
   - while() {...}
   - do {...} while(); 
   - for () {...}

5. Vetores e matrizes

6. Funções e procedimentos   


---

#### Exercícios práticos de programação básica: 


_Os exercícios não serão utilizados para efeitos de avaliação da disciplina, mas
recomenda-se que sejam feitos para relembrar e praticar a programação de
computadores. Alguns exercícios poderão considerar algumas bibliotecas
específicas de Java (nesses casos haverá a indicação da utilização)._



1. Um histograma é um gráfico que representa a freqüência que um determinado
   valor ocorre dentro de um conjunto de dados. Por exemplo, seja o seguinte
conjunto de dados: ```[4, 2, 5, 2, 3, 1, 4, 5, 2, 2]```. O histograma horizontal
para esse conjunto seria o seguinte (considere cada * como uma ocorrência do
valor):  
```
1  *
2  ****
3  *
4  **
5  **
```

Faça um programa que leia um conjunto ```X``` de valores compreendidos entre
```[ min, max ]```, em que ```min``` e ```max``` representam os valores
inferior e superior do intervalo. Ao final de sua execução o programa deverá
imprimir o histograma do intervalo. 

:star: Desafio: adicione ao programa a funcionalidade de imprimir o histograma
_vertical_. no caso do exemplo acima o histograma vertical seria:  
```
  *       
  *       
  *   * * 
* * * * * 
1 2 3 4 5
```
 
--- 
2. Faça um programa que, a partir de um valor ```x``` informado pelo usuário
   pelo teclado seja capaz de ler ```x``` números compreendidos entre 0 e 20 e
armazená-los em um vetor. O programa deverá mostrar o vetor contendo os números
e em seguida ordená-los em ordem crescente. Ao final o programa deverá imprimir
o vetor ordenado. Exemplo de utilização do programa:  
```
Informe o número de valores a serem gerados: 10
Vetor original: [ 9, 2, 5, 6, 1, 6, 9, 15, 13, 0 ]
Vetor ordenado: [ 0, 1, 2, 5, 6, 6, 9, 9, 13, 15 ]
```

:star: Desafio: altere o programa para ler o valor ```x``` do teclado e
verifique se ```x``` é um quadrado perfeito. Sendo ```x``` um quadrado perfeito,
gere uma matriz ```M x M``` de contendo os ```x``` números lidos a partir do
teclado. O método Java para calcular a raiz quadrada é o ```Math.sqrt(num)```.
Apresente a matriz gerada e posteriormente a matriz com os valores
ordenados. Exemplo de utilização:  

```
Informe o número de valores a serem gerados: 9  
M= |  4 5 2 |
   | 19 5 3 |
   |  2 6 1 |

Matriz ordenada: 
M= | 1 2  2 |
   | 3 4  5 |
   | 5 6 19 |
```

:star::star: Desafio 2: altere as duas versões do programa para que ele seja
capaz de gerar aleatoriamente os números compreendidos entre ```0``` e ```k```
(```k``` informado pelo usuário). Utilize a biblioteca [Random](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html) de Java.

--- 

## Estudo dirigido para a primeira avaliação

1 - O que são tipos de dados primitivos? Quais os tipos de dados primitivos deJava? 

	Resposta:  Dados primitivos representam valores simples e básicos. Eles não são objetos e não possuem métodos.

**Os seus tipos são:**

- **Tipos Numéricos Integrais:**
  - `byte`: Armazena números inteiros de 8 bits.
  - `short`: Armazena números inteiros de 16 bits.
  - `int`: Armazena números inteiros de 32 bits.
  - `long`: Armazena números inteiros de 64 bits.

- **Tipos Numéricos de Ponto Flutuante:**
  - `float`: Armazena números de ponto flutuante de precisão simples de 32 bits.
  - `double`: Armazena números de ponto flutuante de precisão dupla de 64 bits.

- **Tipo Caractere:**
  - `char`: Armazena um único caractere Unicode de 16 bits.

- **Tipo Booleano:**
  - `boolean`: Armazena valores verdadeiro ou falso.


2 - O que é o _type casting_? Quais os tipos de _type casting_? Dê ao menos dois exemplos de instruções para cada tipo de _type-casting_.

	Type casting é o processo de mudança de tipo de variável.
	Quando um valor maior é transformado em um tipo menor, a parte menos significativa é truncada.
	Os dois tipos de type casting são:

***Upcasting***

	1) Typecasting Implícito (Widening Conversion):
		Esse tipo de typecasting implica na mudança de um tipo de dado com um menor intervalo para o tupo de um dado com intervalo maior. 
		Essa conversão é feita de maneira automática pelo compilador.
		Dessa forma, não é necessário declarar o tipo para o qual o valor será alterado. A alteração é feita de forma automática em função do tipo da variável de destino.
		Não há truncamento nesse tipo.

```java
public static void main (String[] args) {
	byte a = 19;	// Declaração de um byte
	short b = a;	// Transformação para short
}
```

```java
public static void main (String[] args) {
	long c = 1900;	// Declaração de um valor do tipo long
	int d = c;		// Transformação para tipo int
}
```
***Downcasting***

	2) Typecasting Explícito (Narrowing Conversion)
	Para esse tipo, há uma perda de informação devido ao truncamento realizado.
	Dessa forma, é necessário manter explícito qual é o formato desejado para o tipo destinado após a conversão.

```java
public static void main (String[] args) {
float a = 3.46f;
int b = (int) a; // Perda dos valores decimais de a
}
```
```java
public static void main (String[] args) {
double c = 3.64d;
int d = (int) c; // Perda dos valores decimais de c
}
```

***Atenção***

	Valores como byte ou qualquer outro podem ser convertidos para boolean ou tipo char e vice-versa.

3 - Suponha que as seguintes instruções estejam no método `main` de seu
programa. Apresente o que será impresso como resultado dos comandos de impressão:

```java
public static void main (String[] args) {
   int a = 13; 
   int b = 10; 
   int c = 30; 
   
   String resposta1 = ""; 
   String resposta2 = ""; 
   
   resposta1 += a; 
   resposta1 += b; 
   resposta1 += c; 
   
   resposta2 += a + b + c; 
   
   System.out.println (resposta1); 
   System.out.println (resposta2); 
}
```
A evolução das variáveis são:

	Deploying:
	1) resposta1 = "13" -> Convertida em string e concatenada
	2) resposta1 = "1310" -> Convertida em string e concatenada
	3) resposta1 = "131030" -> Convertida em string e concatenada
	4) resposta2 = resposta2 + a + b + c -> Adição das variáveis

A seguir, as respostas finais no console:

    resposta1 = "131030"
    resposta2 = "53"

4 - No seguinte trecho de código, apresente as linhas em que ocorrems
type-casting. Apresente ainda qual será o resultado da execução das instruções.

```java
public static void main (String[] args) {
    // Type Casting: Não há typecasting pois o valor de A já foi salvo como String na variável strA
    String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5

    // Type Casting: Não há typecasting pois o valor de B já foi salvo como String na variável strB
    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5

    // Type Casting: float a = 13.5f downcasting ou explícita
    float a = Float.parseFloat(strA);
    // Type Casting:  int b = 5 downcasting ou explícita
    int b = Integer.parseInteger(strB); 
    
    // Type Casting: downcasting ou explícita
    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b));
    // Resultado = 18
    // Type Casting: upcasting ou implícita
    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));
    // Resultado = 8.5
}
```

5 - Analise o seguinte algoritmo e imprima seus resultados quando os valores de
`a`, `b` e `c` assumirem nas linhas x, y e z, respectivamente, os seguintes
valores: 

- a = 1, b = 2, c = 3 => Resultado : "Os valores informados não formam um triangulo."
- a = 3, b = 2, c = 4 => Resultado : "É um triangulo escaleno."
- a = 5, b = 3, c = 4 => Resultado : "É um triangulo retangulo." 
- a = 3, b = 5, c = 3 => Resultado : "É um triangulo isosceles."
- a = 6, b = 3, c = 3 => Resultado : "Os valores informados não formam um triangulo."
- a = 5, b = 5, c = 5 => Resultado : "É um triangulo equilatero."
- a = 4, b = 2, c = 4 => Resultado : "Os valores informados não formam um triangulo."

```java
public class Exercicio {

	public static void main(String[] args) {
		float a = lerFloat("Informe A:");
		float b = lerFloat("Informe B:");
		float c = lerFloat("Informe C:");
		
		String resposta = "";
		
		if (ehTriangulo(a, b, c)) {
			resposta += "Os lados informados formam um triangulo.\n";
			if (equilatero(a, b, c)) {
				resposta += "É um triangulo equilatero.\n";
			} else if (isosceles(a, b, c)) {
				resposta += "É um triangulo isosceles.\n";
			} else { 
				resposta += "É um triangulo escaleno.\n"; 
			}
			
			if (ehTrianguloRetangulo(a, b, c)) {
				resposta += "É um triangulo retangulo.";
			}
		} else {
			resposta += "Os valores informados não formam um triangulo.";
		}
		
		JOptionPane.showMessageDialog(null, resposta);
	}


	static boolean ehTrianguloRetangulo(float a, float b, float c) {
		boolean resposta = ( (a * a == b * b + c * c) || 
			                 (b * b == a * a + b * c) ||
			                 (c * c == a * a + b * b));
		return resposta;
	}


	static boolean isosceles(float a, float b, float c) {
		boolean resposta = ((a == b && a != c) || 
				            (a == c && a != b) ||
				            (b == c && b != a));
		return resposta;
	}

	static boolean equilatero(float a, float b, float c) {
		boolean resposta = (a == b && a == c);
		return resposta;
	}

	static boolean ehTriangulo(float a, float b, float c) {
		return (( a > Math.abs(b - c) && a < Math.abs(b + c)) && 
				( b > Math.abs(a - c) && b < Math.abs(a + c)) && 
				( c > Math.abs(a - b) && c < Math.abs(a + b)));
	}

	static float lerFloat(String msg) {
		String str = JOptionPane.showInputDialog(msg);
		float f = Float.parseFloat(str);
		return f;
	}

}
```

6 - Crie um algoritmo que seja capaz de converter um número natural na base decimal em seu equivalente em binário. Considere que a entrada será sempre um número positivo.   
Exemplos:  
- $0_{10} = 0_{2}$
- $1_{10} = 1_{2}$
- $2_{10} = 10_{2}$
- $3_{10} = 11_{2}$
- $4_{10} = 100_{2}$
- $5_{10} = 101_{2}$
- $6_{10} = 110_{2}$
- $7_{10} = 111_{2}$
- $8_{10} = 1000_{2}$
- $9_{10} = 1001_{2}$
- $10_{10} = 1010_{2}$

7 - Crie um algoritmo que seja capaz de calcular a sequencia de Fibonacci em até
10 numeros. Os valores calculados para a sequencia deverão ser armazenados em um
vetor e apresentados ao final da execução. 

Exemplo:  
`[ 1, 1, 2, 3, 5, 8, 13, 21, 42, 63 ]`

:star: *Desafio:* utilize o passo do for para calcular a sequencia, sabendo que
o valor do 10o. elemento é 63.  


8 - Apresente o que será impresso para o usuário após toda a execução do
algoritmo abaixo: 

```java
    public static void main(String[] args) {
        int[] vetor = new int[] {9, 3, 6, 4, 5, 8, 0, 2, 7, 1};
        System.out.println(imprimirVetor(vetor));
        
        int[] resposta = foo(vetor, 3);
        System.out.println(imprimirVetor(resposta));
    }

    
    static int[] foo(int[] vetor, int k) {
        int[] novo = new int[vetor.length];
        int j = k;
        for (int i=0; i<vetor.length; i++) {
            novo[j] = vetor[i];
            j++;
            if (j == vetor.length) {
                j = 0;
            }
        }
        return novo;
    }

    
    static String imprimirVetor(int[] vetor) {
        String resposta = "[ ";
        for (int i=0; i<vetor.length; i++) {
            resposta += vetor[i] + (i < vetor.length - 1 ? ", " : " ]"); 
        }
        return resposta;
    }
```

Resposta:

    [9, 3, 6, 4, 5, 8, 0, 2, 7, 1]
    [2, 7, 1, 9, 3, 6, 4, 5, 8, 0]



9 - Apresente o resultado da execução do seguinte algoritmo: 

```java
    public static void main(String[] args) {
        
        int limite = 20; 
        boolean[] primos = new boolean[limite + 1];
        
        for (int i = 0; i < primos.length; i++) {
            primos[i] = true;
        }
        primos[0] = false; 
        primos[1] = false; 
        
        /**
         * Crivo de Erastótenes
         */
        for (int i=2; i*i < limite; i++) {
            if (primos[i]) {
                for (int j = i * i; j<=limite; j+=i) {
                    primos[j] = false;
                }
            }
        }
        
        for (int i = 0; i < primos.length; i++) {
            System.out.println(i + ": " + (primos[i] ? "primo" : "ñ-primo"));
        }
    }
```

  0: ñ-primo
  1: ñ-primo
  2: primo
  3: primo
  4: ñ-primo
  5: primo
  6: ñ-primo
  7: primo
  8: ñ-primo
  9: ñ-primo
  10: ñ-primo
  11: primo
  12: ñ-primo
  13: primo
  14: ñ-primo
  15: ñ-primo
  16: ñ-primo
  17: primo
  18: ñ-primo
  19: primo
  20: ñ-primo


10 -
