//04) Crie um algoritmo que realize a exponencia��o de um n�mero inteiro de acordo com o seu valor e retorne o resultado.
//Exemplo: N�mero 3, ent�o ser� realizado o c�lculo 3 x 3 x 3 = 27.
package Trabalho01;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double numA, numB, exp;

		System.out.println("Digite o Valor da Base: ");
		numA = entrada.nextDouble();

		System.out.println("Digite o Valor do Expoente: ");
		numB = entrada.nextDouble();

		exp = Math.pow(numA, numB);

		System.out.println("O n�mero: " + numA + "\nelevado ao expoente: " + numB + "\n� igual �: " + exp);

	}

}
