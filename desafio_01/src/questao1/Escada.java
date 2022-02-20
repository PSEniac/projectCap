package questao1;

import java.util.Scanner;

public class Escada {

	/**
	 * --Método padrão main de execução do código --
	 * 
	 * > Este método consiste na inserção de um número inteiro
	 * 
	 * > Com o número inserido, o algoritmo irá calcular as repetições de * e ""
	 * 
	 * > Retorna a quantidade de asteristicos e as suas posições
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner general = new Scanner(System.in);

		int i, j, n;

		String langUser;
		String lgBr = "PT BR";
		String lgEng = new String("ENG");

		System.out.println("Qual e o seu idioma? / What is your language? ");
		System.out.println("PT BR / ENG US");
		langUser = general.nextLine();

		if (langUser.equals(lgBr)) {
			System.out.println("OLA, SEJA BEM VINDO(A) A ESCADA DECRESCENTE");
			System.out.println();
			System.out.printf("Digite a quantidade de degraus que voce quer descer:");
		} else if (langUser.equals(lgEng)) {
			System.out.println("HELLO, WELCOME TO THE DESCENDING STAIRS");
			System.out.println();
			System.out.println("Enter the number of steps you want to descend:");
		}

		n = general.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = n - i; j >= 1; j--)
				System.out.printf(" ");
			for (j = 1; j <= i; j++)
				System.out.printf("*");
			System.out.println("");
		}

	}

}
