package ejerciciosGuiaClasesYAsociaciones.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {

		Cuadratica cuadratica1 = new Cuadratica(1,-2,-3); // ejemplo con dos raices
		Cuadratica cuadratica2 = new Cuadratica(1,-12,36); // ejemplo con una raiz
		Cuadratica cuadratica3 = new Cuadratica(2,5,7); // ejemplo sin raices reales
		
		
		System.out.println("Discriminante de Cuadratica 1: " + cuadratica1.obtenerDiscriminante());
		System.out.println("Raices de Cuadratica 1: " + cuadratica1.obtenerRaices().toString());
		if (cuadratica1.obtenerRaices().isEmpty()){
			System.out.println("No hay raices");
		}
		
		System.out.println("\nDiscriminante de Cuadratica 2: " + cuadratica2.obtenerDiscriminante());
		System.out.println("Raices de Cuadratica 2: " + cuadratica2.obtenerRaices().toString());
		if (cuadratica2.obtenerRaices().isEmpty()){
			System.out.println("No hay raices");
		}
		
		System.out.println("\nDiscriminante de Cuadratica 3: " + cuadratica3.obtenerDiscriminante());
		System.out.println("Raices de Cuadratica 3: " + cuadratica3.obtenerRaices().toString());
		if (cuadratica3.obtenerRaices().isEmpty()){
			System.out.println("No hay raices");
		}

	}
}
