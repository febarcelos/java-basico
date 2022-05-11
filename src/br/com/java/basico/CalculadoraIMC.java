package br.com.java.basico;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = scanner.nextLine();
		
		System.out.println("Qual o seu peso?");
		double peso = scanner.nextDouble();
		
		System.out.println("Qual a sua altura?");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print(nome + ", seu IMC é " + String.format("%.2f", imc) + " ! ");
		if (imc < 16.9) {
			System.out.println("Você está muito abaixo do peso!");
		}
		else if (imc > 17 && imc < 18.4) {
			System.out.println("Você está abaixo do peso!");
		}
		else if (imc > 18.5 && imc < 24.9) {
			System.out.println("Você está no peso adequado!");
		}
		else if (imc > 25 && imc < 29.9) {
			System.out.println("Você está acima do peso!");
		}
		else {
			System.out.println("Você está muito acima do peso!");
		}
		
	}

}
