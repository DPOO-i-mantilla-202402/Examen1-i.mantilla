package presentacion;

import logica.Pieza;

public class Consola {
	private Pieza pieza;
	
	public Consola() {
		this.pieza = new Alfil(2,1);
		System.out.println(this.pieza.calcularMovimientoCantidad());
		
		this.pieza = new Peon(5);
		System.out.println(this.pieza.calcularMovimientoCantidad());
		
		this.pieza = new Torre(5,2);
		System.out.println(this.pieza.calcularMovimientoCantidad());
		
		
	}
	
	public static void main(String[] args) {
		new Consola();
	}
}