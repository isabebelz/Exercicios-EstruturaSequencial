package exercicios_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).

		int a, b, c, d, diferencaProduto;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		a = s.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = s.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = s.nextInt();
		System.out.println("Digite o quarto n�mero: ");
		d = s.nextInt();
		
		s.close();
		
		diferencaProduto = (a * b) - (c * d);
		System.out.println("O diferen�a do produto de (a * b) e (c * d) �: " + diferencaProduto);
	}

}
