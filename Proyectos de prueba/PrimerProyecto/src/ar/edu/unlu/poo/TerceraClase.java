package ar.edu.unlu.poo;

public class TerceraClase {
	
	public static void main (String [] args) {
		// Constantes
		// final double PI = 3.1416; los atributos de tipo final son como una especie de constante
		final double PI; 
		PI = 3.1416; // aca podemos ver que este tipo de tributos final se pueden inicializar solo una vez, luego ya no puede cambiar su valor, x eso es que son como una constante
		System.out.printf("PI es: %f \n",PI);
		
		// Uso del modulo (resto de una division)
		int a = 5;
		int b = 7;
		System.out.printf("Resto de divir 7 en 5 es = %d\n",(b % a));
		
		a = a + 1;
		a++;
		System.out.printf("A = %d\n",a);
		a--;
		System.out.printf("A = %d\n",a);
		
		System.out.println("\n-------------------------\n");
		
		a = 5;
		System.out.printf("A = %d\n",a++);
		System.out.printf("A = %d\n",a);
		
		System.out.println("\n-------------------------\n");
		
		a = 5;
		System.out.printf("A = %d\n",++a);
		System.out.printf("A = %d\n",a);
		System.out.printf("B = %d\n", b);
		
		System.out.printf("A = B ?: %s\n",(a == b));
		System.out.printf("A != B ?: %s\n",(a != b));
		System.out.printf("A > B ?: %s\n",(a > b));
				
	}
}
