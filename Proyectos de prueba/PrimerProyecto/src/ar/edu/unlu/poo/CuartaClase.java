package ar.edu.unlu.poo;

import java.util.Scanner;

public class CuartaClase {
	
	// uso de clase scanner para entradas por teclado por parte del usuario
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String nombre;
		double radio;
		int n;
		
		System.out.println("Me decis tu nombre por favor?: ");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
		
		System.out.println("Me decis el radio de una circunferencia?: ");
		radio = sc.nextDouble();
		System.out.println("El perimetro es: " + 2 * Math.PI * radio);
		
		System.out.println("Dime tu edad: ");
		n = sc.nextInt();
		System.out.println(n + " uhhh ya sos re viejo!");
				
	}
}
