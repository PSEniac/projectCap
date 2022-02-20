package questao3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Substrings {
	
	/**
	 * 						-- M�todo padr�o main de execu��o do c�digo --
	 * 
	 * > Para o algoritmo ser eficiente, primeiro vem o m�todo main para mostrar informa��es
	 * de inicializa��o do algortimo e para inser��o da string que vem acompanhada do m�todo
	 * subString
	 * 
	 * > N�o � respons�vel pela sa�da de dados na tela, cabendo a pr�pria fun��o subString mostrar
	 * o resultado na parte final, t� mesmo por ser um m�todo enxuto
	 * 
	 * > O m�todo conta com a principal vari�vel --word-- que serve como entrada de informa��es
	 * do usu�rio para ler uma string, calcular seus anagramas e descobrir,
	 *  se h� pares da substring depois do c�lculo dos anagramas da string que o usu�rio inseriu
	 *  uma vez que, essa mesma vari�vel vem acompanhada da fun��o string, para chamar o 2� m�todo
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String word;

		Scanner insertInit = new Scanner(System.in);
		Scanner strgInsert = new Scanner(System.in);
		String langCh;
		String lgBr = "PT BR";
		String lgEng = new String("ENG");
		;

		System.out.println("Qual e o seu idioma? / What is your language? ");
		System.out.println("DIGITE: PT BR / TYPE: ENG");
		langCh = insertInit.nextLine();

		if (langCh.equals(lgBr)) {
			System.out.println("OLA, SEJA BEM VINDO(A)!");
			System.out.println();
			System.out.println("DESCUBRA O NUMERO PARES DE SUBSTRINGS QUE SAO ANAGRAMAS");
			System.out.println();
			System.out.println("Digite qualquer palavra:");
		} else if (langCh.equals(lgEng)) {
			System.out.println("WELCOME!");
			System.out.println();
			System.out.println("FIND OUT THE NUMBER PAIRS OF SUBSTRINGS THAT ARE ANAGRAMS");
			System.out.println();
			System.out.println("Enter anything word:");
		}

		System.out.println();
		word = strgInsert.nextLine();
		System.out.println();

		subString(word);

	}
	
	/**									-- M�todo subString--
	 * 
	 * @param strgGenerated > faz parte da fun��o substring, onde passa pela  contagem
	 * da quantidade de caractres e de contagem de repeti��o para identificar pares de substrings
	 * 
	 * > O HashMap faz o mapeamento com uma lista de c�digos hash para organizar os objetos
	 * 
	 * > O Map declara os par�metros na parte final da fun��o e na parte final do c�digo,
	 * as condi��es e vari�veis
	 * 
	 * > O m�todo l� os dados inseridos do main e na 1� parte, 
	 *  e calcula as possibilidades de anagramas
	 *  
	 *  > Na 2� parte, o m�todo l� os anagramas e tenta identificar poss�veis pares
	 * 
	 */
	static void subString(String strgGenerated) {

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < strgGenerated.length(); i++) {

			for (int j = i; j < strgGenerated.length(); j++) {

				char[] valC = strgGenerated.substring(i, j + 1).toCharArray();

				Arrays.sort(valC);
				String val = new String(valC);

				if (map.containsKey(val))

					map.put(val, map.get(val) + 1);
				else
					map.put(val, 1);

			}

		}

		int anagramPairCount = 0;

		for (String key : map.keySet()) {

			int n = map.get(key);

			anagramPairCount += (n * (n - 1)) / 2;

		}

		System.out.println("O numero de pares da sua substring e: " + anagramPairCount);

	}
}
