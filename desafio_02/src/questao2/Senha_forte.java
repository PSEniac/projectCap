package questao2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha_forte {
	
	/**
	 * 
	 * 						-- M�todo CountCharact --
	 * 					
	 * > Tem a fun��o de comparar os par�metros estabelecidos com a senha inserida pelo usu�rio
	 * 
	 * @param password > String que tem a fun��o de detectar par�metros e a contagem destes
	 * na string que o usu�rio inseriu, diferenciando de v�lidos e inv�lidos,
	 *  retornando apenas os inv�lidos na sa�da
	 * 
	 * @return retorna ao count = 0 que vai executar todos os par�metros da fun��o,
	 * por um determinado n�mero de vezes no m�todo,
	 * desde que a senha tenha no m�nimo 6 caracteres
	 */
	 
	static int countCharact(String password) {

		int count = 0;

		Pattern digit = Pattern.compile("(\\d)");

		Pattern uppercase = Pattern.compile("([A-Z])");

		Pattern lower = Pattern.compile("([a-z])");

		Pattern spChar = Pattern.compile("(\\W)");

		Matcher Digit = digit.matcher(password);

		Matcher Upper = uppercase.matcher(password);

		Matcher Lower = lower.matcher(password);

		Matcher Special = spChar.matcher(password);

		if (!Digit.find()) {
			count++;
		}

		if (!Upper.find()) {
			count++;
		}

		if (!Lower.find()) {
			count++;
		}

		if (!Special.find()) {
			count++;
		}

		if ((count + password.length()) < 6) {
			count = count + 6 - (count + password.length());

		}

		return count;
	}

		/** 				-- M�todo padr�o main de execu��o do c�digo --
		 * 
		 * > Informa��es, inser��o de dados, processamento e sa�da
		 * 
		 * > Retorna ao usu�rio o resultado final da sua senha inserida, a mesma antes disso,
		 * 	passa pelo m�todo countCharact(senha) e volta ao main para mostrar na tela ao usu�rio
		 * 	 
		 * 
		 * @param args
		 */
	public static void main(String args[]) {

		String secPsswd;
		String langPasswd;
		String lEng = "ENG US";
		String lPtbr = "PT BR";

		Scanner insertPsswd = new Scanner(System.in);

		System.out.println("Qual e o seu idioma? / What is your language? ");
		System.out.println("PT BR / ENG US");
		langPasswd = insertPsswd.nextLine();

		if (langPasswd.equals(lPtbr)) {
			System.out.println(
					"OL�, SEJA BEM VINDO(A)! ANTES DE COLOCAR SUA SENHA," + " PRESTE ATEN�AO NAS INFORMA�OES ABAIXO");
			System.out.println();
			System.out.println("A sua senha para ser considerada segura, deve conter:");
			System.out.println();
			System.out.println("1 digito");
			System.out.println("1 letra em minusculo");
			System.out.println("1 letra em maiusculo");
			System.out.println("1 caractere especial / Caracteres especiais: !@#$%^&*()-+");
			System.out.println();
			System.out.print("Digite a sua senha: ");
		} else if (langPasswd.equals(lEng)) {
			System.out.println("WELCOME! BEFORE ENTERING YOUR PASSWORD," + " PAY ATTENTION TO THE INFORMATION BELOW");
			System.out.println();
			System.out.println("Your password, to be considered secure, must contain:");
			System.out.println();
			System.out.println("1 digit");
			System.out.println("1 lowercase letter");
			System.out.println("1 uppercase letter");
			System.out.println("1 special character / Special characters: !@#$%^&*()-+");
			System.out.println();
			System.out.print("Enter your password: ");
		}

		secPsswd = insertPsswd.nextLine();

		if (countCharact(secPsswd) < 1) {
			System.out.println("Senha segura / Secure Password");
		}
		while (countCharact(secPsswd) >= 1) {
			System.out.println();
			System.out.printf("Senha insegura! Faltam %s caracteres ou digitos diferentes"
					+ " para uma senha forte / Missing %s different characters or digits," + " for a strong password%n",
					(countCharact(secPsswd)), (countCharact(secPsswd)));
			System.out.println();
			System.out.print("Digite a sua senha / Enter your password: ");
			secPsswd = insertPsswd.nextLine();
			System.out.println();

		}

		System.out.println("Senha segura / Secure Password");

	}
}
