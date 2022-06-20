package exercicios_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.

		double raio, area;
		Scanner r = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		raio = r.nextDouble();
		
		r.close();
		
		area = 3.14159 * Math.pow(raio, 2); 
		System.out.printf("A área do circulo é: %.4f ", area);
		
	}

}
