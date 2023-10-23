package cofre;

import java.util.ArrayList;





public class Cofrinho {
	
	
	private ArrayList<Moeda> listaDeMoedas;
	
	public Cofrinho() {
		this.listaDeMoedas=new ArrayList<>();
		
	}
	
	public void adicionar(Moeda moeda) {   //ADIÇÃO DE MOEDAS AO COFRE
		listaDeMoedas.add(moeda);
	}
	
	public void remover(double valor) {    //REMOÇÃO DE  MOEDAS DO COFRE
	    for (Moeda moeda : listaDeMoedas) {
	        if (moeda.getValor() == valor) {
	            listaDeMoedas.remove(moeda);
	            return;
	        }
	        
	    }
	    
	}
	public void listagemMoedas() {   //LISTAGEM DAS MOEDAS ADICIONADAS  AO COFRINHO
		if (this.listaDeMoedas.isEmpty()) {
			System.out.println("NAO HA MOEDAS NO COFRINHO!");
			return;
			
		}
		
		for(Moeda moeda : listaDeMoedas) {
			System.out.println(moeda);
		}
	}
	public double conversaoTotal() {   //SOMA DOS VALORES PRESENTES NO COFRINHO
		 double total = 0;
	     for(Moeda moeda : listaDeMoedas) {
	         total += moeda.converter();
	     }
	     System.out.println("Total: R$" + total);
	     return total;
	}
}
