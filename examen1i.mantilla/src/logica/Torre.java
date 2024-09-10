package logica;

public class Torre extends Pieza {
	
	public Torre(double valor1,double valor2) {
		super(valor1, valor2);
	
	}
	
	@Override
	public double calcularMovimientoCantidad() {
		return Math.pow(this.valor1, 2);
		
	}
}
