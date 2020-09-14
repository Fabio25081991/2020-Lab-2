package br.edu.univas.main;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int resultado1 = somar (10,20);
		System.out.print(resultado1);
		
		int resultado2 = subtrair(20,10);
		System.out.print(" " +resultado2);
		
		int resultado3 = dividir(10,2);
		System.out.print(" " +resultado3);
		
		int resultado4 = multiplicar(2,10);
		System.out.print(" " +resultado4);
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
}
