package cofre;

public abstract class Moeda {
	
	protected double valor;
	
	public Moeda(double valor) {
        this.valor = valor;
    }
	
	public double getValor() {
        return valor;
    }
	
	public abstract void info ();
	public abstract double converter ();

}

