package questao3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Substrings {
	
	/**
	 * 						-- Método padrão main de execução do código --
	 * 
	 * > Para o algoritmo ser eficiente, primeiro vem o método main para mostrar informações
	 * de inicialização do algortimo e para inserção da string que vem acompanhada do método
	 * subString
	 * 
	 * > Não é responsável pela saída de dados na tela, cabendo a própria função subString mostrar
	 * o resultado na parte final, té mesmo por ser um método enxuto
	 * 
	 * > O método conta com a principal variável --word-- que serve como entrada de informações
	 * do usuário para ler uma string, calcular seus anagramas e descobrir,
	 *  se há pares da substring depois do cálculo dos anagramas da string que o usuário inseriu
	 *  uma vez que, essa mesma variável vem acompanhada da função string, para chamar o 2º método
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
	
	/**									-- Método subString--
	 * 
	 * @param strgGenerated > faz parte da função substring, onde passa pela  contagem
	 * da quantidade de caractres e de contagem de repetição para identificar pares de substrings
	 * 
	 * > O HashMap faz o mapeamento com uma lista de códigos hash para organizar os objetos
	 * 
	 * > O Map declara os parâmetros na parte final da função e na parte final do código,
	 * as condições e variáveis
	 * 
	 * > O método lê os dados inseridos do main e na 1º parte, 
	 *  e calcula as possibilidades de anagramas
	 *  
	 *  > Na 2º parte, o método lê os anagramas e tenta identificar possíveis pares
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
