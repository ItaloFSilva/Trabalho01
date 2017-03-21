//10) Crie um algoritmo que valida se os dados digitados podem formar um triangulo.
package Trabalho01;

import java.util.Scanner;

public class Exercício10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ladoa, ladob, ladoc;

		System.out.println("Digite o lado A: ");
		ladoa = entrada.nextInt();
		System.out.println("Digite o lado B: ");
		ladob = entrada.nextInt();
		System.out.println("Digite o lado C: ");
		ladoc = entrada.nextInt();

		if ((ladoa < ladob + ladoc) && (ladob < ladoa + ladoc) && (ladoc < ladoa + ladob)) {
			System.out.println("Os Valores Digitados Formam um Triângulo!");
		} else {
			System.out.println("Não é um Triângulo!");
		}

	}
}
