//07) Crie um algoritmo que retorne �Login efetuado com sucesso!� caso o login e senha informado seja igual a �admin� 
//E para os demais casos retornar �Usu�rio e/ou senha incorretos�. 
package Trabalho01;

import java.util.Scanner;

public class Exerc�cio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String login = "admin";
		String senha = "admin";
		String comparador;

		System.out.println("Digite Seu Login: ");
		comparador = entrada.nextLine();

		System.out.println("Digite Sua Senha: ");
		comparador = entrada.nextLine();

		if (login.equals(comparador)) {
			System.out.println("Login Efetuado Com Sucesso!");
		}

		else {
			System.out.println("Usu�rio e/ou Senha Incorretos");

		}

	}
}
