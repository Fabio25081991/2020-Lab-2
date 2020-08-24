package br.edu.univas.main;
import java.util.Scanner;
public class StartApp {
	public static void main(String[] args) {
		int opcao = 9;
		int operacao,x,y;
		float z;
		
		do  { 
			
					exibirMenu();
					opcao = leituraOpcao();
					
					switch (opcao) {
					case 1:
						exibirMensagem("A operação escolhida é a soma.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo número: ");
						y = leituraOpcao();
						z = soma(x,y);
						exibirResultado (x,y,z,"soma");
						break;
					
					case 2:
						exibirMensagem("A operação escolhida é a subtração.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo número: ");
						y = leituraOpcao();
						z = subtracao(x, y);
						exibirResultado(x,y,z, "subitracao");
						break;
					
					case 3:
						exibirMensagem("A operação escolhida é a divisão.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo número: ");
						y = leituraOpcao();
						z = divisao(x,y);
						exibirResultado (x,y,z, "divisao");
						break;
						
					case 4:
						exibirMensagem("A operação escolhida é a multiplicação.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo número: ");
						y = leituraOpcao();
						z = multiplicacao (x,y);
						exibirResultado(x,y,z, "multiplicacao");
						break;
						
					case 9:
						exibirMensagem("Você escolheu sair. Obrigado!");
						exibirMensagem("Teste2");
						break;
					default:
						exibirMensagem("Opção inválida! Por favor, digite uma opção correta!");
						break;
					}
					
						
					
			} while(opcao != 9); 
			
			
	 }
	 public static int leituraOpcao(){
	        Scanner leitura = new Scanner(System.in);
	        int opcao = leitura.nextInt();
	        return opcao;
	        	
	}
	  
	  public static void exibirMenu() {

		    exibirMensagem("\nEscolha a operação que vai utilizar:\n");
		    exibirMensagem("1 - SOMA");
		    exibirMensagem("2 - SUBITRAÇÃO");
		    exibirMensagem("3 - DIVISÃO");
		    exibirMensagem("4 - MULTIPLICAÇÃO");
		    exibirMensagem("9 - Sair");
			
	  }
	  
	  public static int soma(int x, int y) {
		  return x + y;
		  
	  }
	  
	  public static int subtracao(int x, int y) {
		  return x - y;
	  }
	  
	  public static float divisao(int x , int y) {
		  return x / y;
	  }
	  
	  public static int multiplicacao(int x, int y) {
		  return x * y;
	  }
	  
	  public static void exibirResultado(int x, int y, float z, String operacao) {
		  exibirMensagem("A " + operacao + " entre " + x + " e " + y + " é " + z +".");
		  
	  }
	  
	  public static void exibirMensagem(String str) {
		  System.out.println(str);
	  }
}
