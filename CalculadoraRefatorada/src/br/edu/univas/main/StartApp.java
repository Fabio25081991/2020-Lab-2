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
						exibirMensagem("A opera��o escolhida � a soma.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo n�mero: ");
						y = leituraOpcao();
						z = soma(x,y);
						exibirResultado (x,y,z,"soma");
						break;
					
					case 2:
						exibirMensagem("A opera��o escolhida � a subtra��o.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo n�mero: ");
						y = leituraOpcao();
						z = subtracao(x, y);
						exibirResultado(x,y,z, "subitracao");
						break;
					
					case 3:
						exibirMensagem("A opera��o escolhida � a divis�o.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo n�mero: ");
						y = leituraOpcao();
						z = divisao(x,y);
						exibirResultado (x,y,z, "divisao");
						break;
						
					case 4:
						exibirMensagem("A opera��o escolhida � a multiplica��o.");
						exibirMensagem("Digite o primeiro: ");
						x = leituraOpcao();
						exibirMensagem("Agora, digite o segundo n�mero: ");
						y = leituraOpcao();
						z = multiplicacao (x,y);
						exibirResultado(x,y,z, "multiplicacao");
						break;
						
					case 9:
						exibirMensagem("Voc� escolheu sair. Obrigado!");
						exibirMensagem("Teste2");
						break;
					default:
						exibirMensagem("Op��o inv�lida! Por favor, digite uma op��o correta!");
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

		    exibirMensagem("\nEscolha a opera��o que vai utilizar:\n");
		    exibirMensagem("1 - SOMA");
		    exibirMensagem("2 - SUBITRA��O");
		    exibirMensagem("3 - DIVIS�O");
		    exibirMensagem("4 - MULTIPLICA��O");
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
		  exibirMensagem("A " + operacao + " entre " + x + " e " + y + " � " + z +".");
		  
	  }
	  
	  public static void exibirMensagem(String str) {
		  System.out.println(str);
	  }
}
