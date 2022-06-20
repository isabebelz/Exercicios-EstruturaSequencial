package exercicios_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Número do funcionário: ");
		numFuncionario = dados.nextInt();
		System.out.println("Número de horas trabalhadas: ");
		horasTrabalhadas = dados.nextInt();
		System.out.println("Valor ganho por hora de trabalho: ");
		valorPorHora = dados.nextDouble();
		
		dados.close();
		
		salario = valorPorHora * horasTrabalhadas;
		Locale.setDefault(Locale.US);
		System.out.printf("Number: %d%nSalary: U$%.2f.", numFuncionario, salario );
	}

}
