package ar.edu.unlu.poo;

import java.util.Scanner;

public class SextaClase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		int frecuencia[] = new int[5];
		String significado[] = {"Desaprobado","Safo","Bien","Muy bien","Excelente"};
		
		for(int i = 0; i <= 4; i++) {
			frecuencia[i] = 0;
		}
		final int DES = 0;
		final int SAFO = 1;
		final int BIEN = 2;
		final int MB = 3;
		final int EX = 4;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Nota Nro: " + i);
			nota = sc.nextInt();
			switch (nota) {
			case 1:
			case 2:
			case 3:
				System.out.println("Estas desaprobado, Lo siento!");
				frecuencia[DES]++;
				break;
			case 4:
				System.out.println("Safamos !");
				frecuencia[SAFO]++;
				break;
			case 5:
			case 6:
				System.out.println("Aprobamos !");
				frecuencia[BIEN]++;
				break;
			case 7:
			case 8:
				System.out.println("Muy bien !");
				frecuencia[MB]++;
				break;
			case 9:
			case 10:
				System.out.println("Genial !");
				frecuencia[EX]++;
				break;
			default:
				System.out.println("Fuera de Rango !");
			}
		}
		
		for (int i = 0; i < frecuencia.length; i++) {
			System.out.println("Tenemos " + significado[i] + ": " + frecuencia[i] );
		}
		
		System.out.println("Estos son los posibles valores de frecuencia");
		for (String s : significado) {
			System.out.println(" - " + s);
		}
	}
}
