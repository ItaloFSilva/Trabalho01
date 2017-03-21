//04) Crie um algoritmo que realize a exponenciação de um número inteiro de acordo com o seu valor e retorne o resultado.
//Exemplo: Número 3, então será realizado o cálculo 3 x 3 x 3 = 27.
package Trabalho01;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double numA, numB, exp;

		System.out.println("Digite o Valor da Base: ");
		numA = entrada.nextDouble();

		System.out.println("Digite o Valor do Expoente: ");
		numB = entrada.nextDouble();

		exp = Math.pow(numA, numB);

		System.out.println("O número: " + numA + "\nelevado ao expoente: " + numB + "\né igual á: " + exp);

	}

}
