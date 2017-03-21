//09) Crie um algoritmo que retorna o tipo do triangulo de acordo com o tamanho dos lados informados.
package Trabalho01;

import java.util.Scanner;

public class Exercício9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ladoa, ladob, ladoc;

			System.out.println("Digite o lado A:");
			ladoa = entrada.nextInt();
			System.out.println("                                                ");
			System.out.println("Digite o lado B:");
			ladob = entrada.nextInt();
			System.out.println("                                                ");
			System.out.println("Entre com lado C:");
			ladoc = entrada.nextInt();
			System.out.println("                                                ");

			if ((ladoa < ladob + ladoc) && (ladob < ladoa + ladoc) && (ladoc < ladoa + ladob)) {

				if (ladoa == ladob && ladoa == ladoc) {
					System.out.println("Triangulo Equilatero");
				} else if ((ladoa == ladob) || (ladoa == ladoc)) {
					System.out.println("Triangulo Isosceles");
				} else
					System.out.println("Triângulo Escaleno");
			} 

		}

	}

