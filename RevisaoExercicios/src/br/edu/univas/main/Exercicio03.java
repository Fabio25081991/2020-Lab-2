package br.edu.univas.main;
import  java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int a = leitura.nextInt();
		
		System.out.println("Agora, digite o segundo valor: ");
		int b = leitura.nextInt();
		
		calculadora (a,b);
		
		leitura.close();
	
	}
	
	public static void calculadora(int a, int b) {
		
		int resultado1 = somar (a,b);
		System.out.print(resultado1);
		
		int resultado2 = subtrair(a,b);
		System.out.print(" " +resultado2);
		
		int resultado3 = dividir(a,b);
		System.out.print(" " +resultado3);
		
		int resultado4 = multiplicar(a,b);
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
