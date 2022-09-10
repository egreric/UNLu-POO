package ejerciciosGuiaClasesYAsociaciones.Ejercicio2;

import java.util.ArrayList;

public class Cuadratica {
	private int a;
	private int b;
	private int c;
	
	public Cuadratica (int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public ArrayList<Double> obtenerRaices() {
		double discriminante = obtenerDiscriminante();
		
		// creo una lista vacia, si termina vacia es porque no hay raices
		ArrayList<Double> raices = new ArrayList();
		double raiz;
		int a = getA();
		int b = getB();
		int c = getC();
		
		
		if (discriminante == 0) {
			raices.add((double) ( (-b) / (2*a) ));
		} else if (discriminante > 0){
			raices.add((double) ( ((-b) + (Math.sqrt(discriminante))) / (2*a) ));
			raices.add((double) ( ((-b) - (Math.sqrt(discriminante))) / (2*a) ));
		}
		
		return raices;
	}
	
	public double obtenerDiscriminante() {
		return ( (Math.pow(this.b, 2)) - (4 * this.a * this.c) );
	}
	
	
	private void setA (int a) {
		this.a = a;
	}
	
	public int getA() {
		return this.a;
	}
	
	private void setB (int b) {
		this.b = b;
	}
	
	public int getB() {
		return this.b;
	}
	
	private void setC (int c) {
		this.c = c;
	}
	
	public int getC() {
		return this.c;
	}
}
