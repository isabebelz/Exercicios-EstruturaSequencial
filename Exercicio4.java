package exercicios_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		Scanner dados = new Scanner(System.in);
		
		System.out.println("N�mero do funcion�rio: ");
		numFuncionario = dados.nextInt();
		System.out.println("N�mero de horas trabalhadas: ");
		horasTrabalhadas = dados.nextInt();
		System.out.println("Valor ganho por hora de trabalho: ");
		valorPorHora = dados.nextDouble();
		
		dados.close();
		
		salario = valorPorHora * horasTrabalhadas;
		Locale.setDefault(Locale.US);
		System.out.printf("Number: %d%nSalary: U$%.2f.", numFuncionario, salario );
	}

}
