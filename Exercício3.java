//03) Crie um algoritmo que realize a exponencia��o de um n�mero inteiro duas vezes e retorne o resultado. Exemplo: 3 x 3 = 9.
package Trabalho01;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, exp, resultado;

		System.out.println("Informe o Valor da Base: ");
		num = entrada.nextInt();

		System.out.println("Informe o Valor do Expoente: ");
		exp = entrada.nextInt();

		resultado = num * exp;

		System.out.println("O n�mero: " + num + "\nMultiplicado por: " + exp + "\n� igual �: " + resultado);

	}

}
