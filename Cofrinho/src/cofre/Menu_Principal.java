package cofre;

import java.util.Scanner;

public class Menu_Principal {
	
	private Scanner teclado;
	public Cofrinho cofrinho;
	
	
	public Menu_Principal () {
		teclado = new Scanner(System.in);  
		cofrinho=new Cofrinho();
	}
	
	//Exibição do menu
	public void exibirMenu () {                 
		
		System.out.println("COFRINHO");
		System.out.println("1- ADICIONAR MOEDA");
		System.out.println("2- REMOVER MOEDA");
		System.out.println("3- LISTAR MOEDAS");
		System.out.println("4- CALCULAR VALOR CONVERTIDO PARA REAL");
		System.out.println("5- ENCERRAR");
		System.out.println("DIGITE A OPÇÃO DESEJADA: ");
		
		String opcao=teclado.next();
		
	//Configuração das opções
		switch (opcao) {
		case "1":   // CONFIGURAÇÃO DA OPÇÃO UM
			System.out.println("MOEDAS:  ");
			System.out.println("1- REAL");
			System.out.println("2- DÓLAR");
			System.out.println("3- EURO");
			System.out.println("DIGITE A OPÇAO DESEJADA: ");
			int opcaoSelecionada=teclado.nextInt();
			
			
			System.out.println("INFORME O VALOR DA MOEDA: ");
			String valorMoedaComVirgula=teclado.next();
			valorMoedaComVirgula=valorMoedaComVirgula.replace(",", "."); //Trocar virgula por ponto
			double valorMoeda=Double.valueOf(valorMoedaComVirgula);
			
			Moeda moeda=null;
			if (opcaoSelecionada == 1) {
				moeda = new Real(valorMoeda);
				
			}else if (opcaoSelecionada == 2) {
				moeda=new Dolar(valorMoeda);
				
			}else if (opcaoSelecionada == 3)	{
				moeda=new Euro(valorMoeda);
				
			}else {
				System.out.println("ESSA OPCAO NÃO EXISTE!");  //ALERTA PARA CASO O UUSUARIO DIGITE UMA OPÇÃO INVALIDA
				exibirMenu();
				
			}
			
			cofrinho.adicionar(moeda);
			System.out.println("MOEDA ADICIONADA!"); //ALERTA PARA NOTIFICAR QUE A MOEDA FOI ADICIONADA
			
			exibirMenu();
			break;
			
			
		case "2": // CONFIGURAÇÃO DA OPÇÃO DOIS
		    System.out.println("MOEDAS: ");
		    System.out.println("1-Real");
		    System.out.println("2-Dolar");
		    System.out.println("3-Euro");
		    System.out.println("Qual moeda voce deseja remover ?");
		    opcaoSelecionada=teclado.nextInt();
		    
		    if(opcaoSelecionada==1) {
		        System.out.println("Digite o valor da moeda que deseja remover: ");
		        double valor = teclado.nextDouble();
		        cofrinho.remover(valor); 
		        exibirMenu();
				System.out.println("MOEDA REMOVIDA!");
		        break;
		    }
		    else if(opcaoSelecionada==2) {
		        System.out.println("Digite o valor da moeda que deseja remover: ");
		        double valor = teclado.nextDouble();
		        cofrinho.remover(valor);
		        exibirMenu();
				System.out.println("MOEDA REMOVIDA!");
		        break;
		    }
		    else if(opcaoSelecionada==3){
		        System.out.println("Digite o valor da moeda que deseja remover: ");
		        double valor = teclado.nextDouble();
		        cofrinho.remover(valor);
		        exibirMenu();
				System.out.println("MOEDA REMOVIDA!");
		        break;
		    }
		    else {
		    	System.out.println("ERRO! OPCAO INVALIDA! ");
		    	exibirMenu();
		        break;
		    }
			
		case "3":  //CONFIGURAÇÃO DA OPÇÃO TRÊS
			System.out.println("Lista moedas");
			cofrinho.listagemMoedas();
			exibirMenu();
			
			break;
		case "4": //CONFIGURAÇÃO DA OPÇÃO QUATRO
			cofrinho.conversaoTotal();
			exibirMenu();
			
			break;
		case "5":   //OPÇAO CINCO (ENCERRAR)
			System.out.println("SISTEMA ENCERRADO!");
			break;
		
	
		
		default:    // ALERTA EM CASO DE DIGITAÇÃO DE OPÇÃO INVALIDA
			System.out.println("Opcao Inválida");
			exibirMenu();
			break;
		}
	}

	
}
