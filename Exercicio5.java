package exercicios_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		int codigoPeca1, codigoPeca2, numPecas1, numPecas2;
		double valorPeca1, valorPeca2, valorPago;
		Scanner pecas = new Scanner(System.in);
		
		System.out.println("Digite o código da peça: ");
		codigoPeca1 = pecas.nextInt();
		System.out.println("Digite o número de peças: ");
		numPecas1 = pecas.nextInt();
		System.out.println("Digite o valor unitário de cada peça: ");
		valorPeca1 = pecas.nextDouble();
		
		System.out.println("Digite o código da peça: ");
		codigoPeca2 = pecas.nextInt();
		System.out.println("Digite o número de peças: ");
		numPecas2 = pecas.nextInt();
		System.out.println("Digite o valor unitário de cada peça: ");
		valorPeca2 = pecas.nextDouble();
		
		pecas.close();
		
		valorPago = (valorPeca1 * numPecas1) + (valorPeca2 * numPecas2);
		System.out.printf("O valor total a ser pago pelas peças é: R$%.2f", valorPago);
	}

}
