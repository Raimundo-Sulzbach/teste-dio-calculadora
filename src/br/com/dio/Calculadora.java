package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a,b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma de " + a + " com " + b + " é igual a: "+ soma);
		System.out.println("A subtração de " + a + " em " + b + " é igual a: "+ subtracao);
		System.out.println("A multiplicacao de " + a + " por " + b + " é igual a: "+ multiplicacao);
		System.out.println("A divisao de " + a + " por " + b + " é igual a: "+ divisao);


	}

	public static double soma(double a, double b) {
		return a + b;
		
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
		
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
		
	}
	public static double divisao(double a, double b) {
		return a / b;
		
	}
	
}
