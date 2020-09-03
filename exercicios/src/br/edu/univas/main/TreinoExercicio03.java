package br.edu.univas.main;

import java.util.Scanner;

public class TreinoExercicio03 {
	
	public static void main (String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = leitura.nextInt();
		
		System.out.println("Agora, digite o segundo valor: ");
		int valor2 = leitura.nextInt();
		
		leitura.close();
		
		calculadora(valor1, valor2);
		
		
	}
	

	public static void calculadora(int valor1, int valor2) {
		
		int resultado1 = soma(valor1,valor2);
		System.out.println(resultado1);
		
		int resultado2 = subtracao(valor1,valor2);
		System.out.println(resultado2);
		
		int resultado3 = divisao(valor1,valor2);
		System.out.println(resultado3);
		
		int resultado4 = multiplicacao(valor1,valor2);
		System.out.println(resultado4);
		
	}
	
	public static int soma(int valor1,int valor2) {
		return  valor1 + valor2;
		
	}
	
	public static int subtracao(int valor1, int valor2) {
		return  valor1 - valor2;
		
	}
	
	public static int divisao(int valor1, int valor2) {
		return valor1 / valor2;
		
	}
	
	public static int multiplicacao(int valor1, int valor2) {
		return valor1 *  valor2;
	}
}
