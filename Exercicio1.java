package exercicios_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma mensagem explicativa.

		int a, b, soma;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		
		a = s.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		
		b = s.nextInt();
		
		s.close();
		
		soma = a + b;
		System.out.println("A soma �: " + soma);
		
		
	}

}
