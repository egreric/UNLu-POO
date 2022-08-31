package ejerciciosClase.primitivosYReferenciales;

import java.util.ArrayList;

public class EjercicioPractica1 {
	
	public static void main (String[] args) {
		
		ArrayList<String> arrayString = new ArrayList<String>();
		String string = "hola";
		
		agregarStringEnArray(string, arrayString);
		agregarStringEnArray("que", arrayString);
		agregarStringEnArray("tal", arrayString);
		agregarStringEnArray("que", arrayString);
		agregarStringEnArray("hola", arrayString);
		agregarStringEnArray("hola", arrayString);
		agregarStringEnArray("hola", arrayString);
		System.out.println(arrayString.toString());
		
		System.out.println(devolverOcurrencias(string, arrayString));
	}
	
	public static void agregarStringEnArray (String s, ArrayList<String> lista) {
		lista.add(s);
	}
	
	// metodo devolverOcurrencias utilizando un for normal
	public static int devolverOcurrencias (String s, ArrayList<String> lista) {
		int cantOcurrencias = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (s.equals(lista.get(i))) {
				cantOcurrencias++;
			}
		}
		return cantOcurrencias;
	}
	
	// metodo devolverOcurrencias utilizando un forEach
	/* 
	public static int devolverOcurrencias (String s, ArrayList<String> lista) {
		int cantOcurrencias = 0;
		for (String string : lista) {
			if (string.equals(s)) {
				cantOcurrencias++;
			}
		}
		return cantOcurrencias++;
	}
	*/
	
}
