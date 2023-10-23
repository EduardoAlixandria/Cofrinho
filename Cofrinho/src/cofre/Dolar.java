package cofre;

public class Dolar extends Moeda  {
	
	public Dolar(double valor) {
        super(valor);
	}
	@Override
	public void info() {
		System.out.println("Dolar - "+ valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 4.8;  //CONVERSÃO DO DÓLAR PARA REAL
		
	}
	@Override
	public String toString() {
		return "Dolar- "+ converter() ;  //EXIBIÇÃO DO VALOR EM DÓLAR JÁ CONVERTIDO PARA REAL
	}

}
