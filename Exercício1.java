//01) Crie um algoritmo que realize a soma de dois valores num�ricos.
package Trabalho01;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int soma, num1, num2;

		System.out.println("Digite o Primeiro Numero: ");
		num1 = leitor.nextInt();

		System.out.println("Digite o Segundo Numero: ");
		num2 = leitor.nextInt();

		soma = num1 + num2;

		System.out.println("A Soma dos Numeros e: " + soma);

	}

}
