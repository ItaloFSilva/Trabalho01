//05) Crie um algoritimo que retorne “APROVADO” para notas maiores ou iguais a 7.0,
//“EM EXAME” para notas maior ou igual 4.0 e menor 7.0,
//E  “REPROVADO” para notas menores que 4.0, de acordo com a nota informada.
package Trabalho01;

import java.util.Scanner;

public class Exercício5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float nota;

		System.out.println("Digite o Valor da Sua Nota: ");
		nota = entrada.nextFloat();

		if ((nota <= 10.0) && (nota >= 0.0)) {

			if (nota >= 7.0) {
				System.out.println("APROVADO");
			}

			else {

				if (nota <= 3.9) {
					System.out.println("REPROVADO");
				}

				else {
					System.out.println("EM EXAME");
				}
			}
		}
	}
}
