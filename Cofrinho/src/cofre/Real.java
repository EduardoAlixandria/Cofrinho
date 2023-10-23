package cofre;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		
	}
	@Override
	public void info() {
		System.out.println("Real - "+ valor);
		
	}

	@Override
	public double converter() {
		return this.valor;

		
	}
	@Override
	public String toString() {
		return "Real: " + this.converter();   //EXIBIÇÃO DO VALOR DA MOEDA
	}
	
	

}
