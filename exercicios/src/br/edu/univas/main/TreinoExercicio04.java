package br.edu.univas.main;

public class TreinoExercicio04 {
	
	public static void main(String[] args) {
		
		int resultado = verificaAnoBissexto(2020);
		System.out.println(resultado);
		
		
	}
	
	public static int verificaAnoBissexto(int ano) {
		
		if (ano % 4 == 0 && ano % 100 == 0 || ano % 400 != 0) {	
			
			return 1;
			
		}
		
		return 0;
		
	}

}
