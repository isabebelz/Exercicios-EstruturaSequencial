package exercicios_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

		int codigoPeca1, codigoPeca2, numPecas1, numPecas2;
		double valorPeca1, valorPeca2, valorPago;
		Scanner pecas = new Scanner(System.in);
		
		System.out.println("Digite o c�digo da pe�a: ");
		codigoPeca1 = pecas.nextInt();
		System.out.println("Digite o n�mero de pe�as: ");
		numPecas1 = pecas.nextInt();
		System.out.println("Digite o valor unit�rio de cada pe�a: ");
		valorPeca1 = pecas.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a: ");
		codigoPeca2 = pecas.nextInt();
		System.out.println("Digite o n�mero de pe�as: ");
		numPecas2 = pecas.nextInt();
		System.out.println("Digite o valor unit�rio de cada pe�a: ");
		valorPeca2 = pecas.nextDouble();
		
		pecas.close();
		
		valorPago = (valorPeca1 * numPecas1) + (valorPeca2 * numPecas2);
		System.out.printf("O valor total a ser pago pelas pe�as �: R$%.2f", valorPago);
	}

}
