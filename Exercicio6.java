package exercicios_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo retângulo que tem A por base e C por altura. b) a área do círculo de raio C. (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A e B
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		Scanner calculo = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("A: ");
		A = calculo.nextDouble();
		System.out.println("B: ");
		B = calculo.nextDouble();
		System.out.println("C: ");
		C = calculo.nextDouble();
		System.out.println("");
		
		calculo.close();
		
		triangulo = (A * C)/2;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		System.out.printf("Triângulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
	}

}
