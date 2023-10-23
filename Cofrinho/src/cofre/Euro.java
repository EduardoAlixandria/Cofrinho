package cofre;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}
	@Override
	public void info() {
		System.out.println("Euro - "+ valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 5.38;
		
	}
	@Override
	public String toString() {
		return "Euro "+ converter() ;
	}

}
