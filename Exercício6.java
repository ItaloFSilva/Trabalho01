//06) Crie um algoritmo que retorne verdadeiro caso o login informado seja igual a “admin”
//E falso caso o login seja diferente de “admin”.
package Trabalho01;

import java.util.Scanner;

public class Exercício6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String login = "admin";
		String comparador;

		System.out.println("Digite Seu Login: ");
		comparador = entrada.nextLine();

		if (login.equals(comparador)) {
			System.out.println("Login Verdadeiro");
		}

		else {
			System.out.println("Login Falso");
		}

	}
}
