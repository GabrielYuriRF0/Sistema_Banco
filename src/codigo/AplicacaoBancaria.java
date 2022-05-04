package codigo;
import java.util.Scanner;

public class AplicacaoBancaria {

	public static void main(String[] args) {
		ContaBancaria user1 = new ContaBancaria("GAB","5x2860");
		user1.exibirMenu();
		
	}

}

class ContaBancaria{
	//Declaração de variáveis: 
	float saldo,transacaoAnterior;
	String nomeUsuario,idUsuario;
	
	//Criando construtor:
	ContaBancaria(String nomeU,String idU){
		nomeUsuario = nomeU;
		idUsuario = idU;
		
	}
	
	//Método para o deposito:
	void deposito (float valorDeposito) {
		if (valorDeposito > 0) {
		saldo += valorDeposito;
		transacaoAnterior = valorDeposito;
		}
			
		}
		
	//Método para saque:
	void saque (float valorSaque) {
		
		if (valorSaque > 0) {
			saldo -= valorSaque;
			transacaoAnterior = -valorSaque;
		}
		
		
	}
	
	//Método para visualizar a transação anterior:
	void visualizarTransacao() {
		if (transacaoAnterior > 0) {
			System.out.println("Foi depositado R$"+transacaoAnterior);
		}
		else if (transacaoAnterior < 0) {
			System.out.println("Foi sacado R$"+Math.abs(transacaoAnterior));
		}
		
		else {
			System.out.println("Não ocorreu nenhuma transação!");
		}
	}
	
	void exibirMenu() {
		char opcao = '\0';
		Scanner entradas = new Scanner(System.in); //Criando objeto para permitir as entradas do usuário
		
		//Menu de boas vindas:
		System.out.println("Seja bem vindo"+nomeUsuario);
		System.out.println("Seu id é:"+idUsuario);
		System.out.println("\n");
		
		//Menu de opções:
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("A. Checar Saldo");
		System.out.println("B. Deposito");
		System.out.println("C. Saque");
		System.out.println("D. Visualizar transação anterior");
		System.out.println("E. Sair");
		
		do { 
			System.out.println("====================");
			System.out.println("Escolha uma opção:");
			System.out.println("====================");
			opcao = entradas.next().charAt(0); //Obter a entrada do usuário
			System.out.println("\n");
			
			switch(opcao) {
			case 'A':
				System.out.println("====================");
				System.out.println("Seu saldo é de R$"+saldo);
				System.out.println("====================");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("====================");
				System.out.println("Insira uma quantidade para deposito: ");
				float valorDeposito = entradas.nextFloat();
				deposito(valorDeposito);
				System.out.println("====================");
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("====================");
				System.out.println("informe a quantidade para saque: ");
				float valorSaque = entradas.nextFloat();
				saque(valorSaque);
				System.out.println("====================");
				System.out.println("\n");
				break;
				
			
			case 'D':
				System.out.println("====================");
				visualizarTransacao();
				System.out.println("====================");
				System.out.println("\n");
				break;
				
			case 'E':
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
				
				
			
			}
			
	
			
			
		}while(opcao!='E');
		
		System.out.println("Obrigado por usar nossos serviços, volte sempre!") ;
		
		
		
		
	}
		
		
	}

