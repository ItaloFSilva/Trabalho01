//02) Crie um algoritmo que realize a multiplica��o de dois valores num�ricos.
package Trabalho01;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int valor, num1, num2;

		System.out.println("Digite o Primeiro Numero: ");
		num1 = leitor.nextInt();

		System.out.println("Digite o Segundo Numero: ");
		num2 = leitor.nextInt();

		valor = num1 * num2;

		System.out.println("O Valor e: " + valor);

	}
}
