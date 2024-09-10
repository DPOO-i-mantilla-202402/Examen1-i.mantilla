package logica;

public class Peon extends Pieza {
	
	public Peon(double valor1,double valor2) {
		super(valor1, valor2);
	
	}
	
	@Override
	public double calcularMovimientoCantidad() {
		if (valor1<8);{
			if (valor2<8);
			return valor1+1;
	}
		if (valor1==0);{
			return valor1+1
		}
	}
}
