//08) Crie um algoritmo que exibe um menu com as seguintes opções:
//1 - Calcular área do Triângulo
//2 - Calcular área do Quadrado
//3 - Calcular área do Retângulo
//4 - Calcular área do Circulo
//5 - Calcular área do Trapézio
//Após isso, o usuário deve digitar as opções 1, 2, 3, 4 ou 5 e informar os dados para calcular a área escolhida de acordo com a opção digitada,
//E por fim imprimir o resultado da área.
package Trabalho01;

import java.util.Scanner;

public class Exercício8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcao;
		double pi = 3.141592;
		double l1;
		double lg;
		double area;
		double b1;
		double bm;
		double altura;
		double r1;

		System.out.println("Escolha uma das seguintes opções: ");
		System.out.println("                                  ");
		System.out.println("1. Calcular área do Triângulo");
		System.out.println("2. Calcular área do Qudrado");
		System.out.println("3. Calcular área do Retângulo");
		System.out.println("4. Calcular área do Circulo");
		System.out.println("5. Calcular área do Trapézio");
		System.out.println("Opcao: ");

		opcao = entrada.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Digite o Valor da base: ");
			b1 = entrada.nextDouble();
			System.out.println("Digite o Valor da Altura: ");
			altura = entrada.nextDouble();
			area = (b1 * altura) / 2;
			System.out.println("Este Triângulo Tem a Área de: " + area);
			break;

		case 2:
			System.out.println("Digite o Valor do Primeiro Lado: ");
			l1 = entrada.nextDouble();
			System.out.println("Digite o Valor do Segundo lado: ");
			l1 = entrada.nextDouble();
			area = l1 * l1;
			System.out.println("Este Quadrado tem a Área de: " + area);
			break;

		case 3:
			System.out.println("Digite o Valor da Altura: ");
			altura = entrada.nextDouble();
			System.out.println("Digite o Valor da Largura: ");
			lg = entrada.nextDouble();
			area = altura * lg;
			System.out.println("Este Retângulo Tem a Área de: " + area);
			break;

		case 4:
			System.out.println("Digite o Valor do Primeiro Raio: ");
			r1 = entrada.nextDouble();
			System.out.println("Digite o Valor do Segundo Raio: ");
			r1 = entrada.nextDouble();
			area = pi * (r1 * r1);
			System.out.println("Este Circulo Tem a Área de: " + area);
			break;

		case 5:
			System.out.println("Digite a o Valor da Base Maior: ");
			bm = entrada.nextDouble();
			System.out.println("Digite o Valor da Base: ");
			b1 = entrada.nextDouble();
			System.out.println("Digite o Valor da Altura: ");
			altura = entrada.nextDouble();
			area = ((bm + b1) * altura) / 2;
			System.out.println("Este Trapézio Tem a Área de: " + area);
			break;

		default:
			System.out.println("Digite Apenas Números de 1 até 5!");

		}
	}

}
