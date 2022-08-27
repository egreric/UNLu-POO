package ar.edu.unlu.poo;

public class SegundaClase {
	
	public static void main (String[] args) {
		char ch1,ch2;
		ch1 = 88; // La letra X
		ch2 = 'Y'; 
		
		System.out.printf("El valor de ch1 y ch2 son %s y %s respectivamente \n", ch1,ch2);
		System.out.println("El valor de ch1 y ch2 son " + ch1 + " y " + ch2 + " respectivamente");
		System.out.println(ch1);
		System.out.println(ch1 + ch2); // se suman los valores ascii de dichos chars, devuelve un integer
		System.out.println(ch1+""+ch2); // el lenguaje trata de interpretar todos los valroes para darle salida a la operacion, la unica manera es tratandolos como strings a todo el argumento
		
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.printf("\nConversiones de tipos \n");
		
		b = (byte) i;
		System.out.printf("Valor de b e i: %d %d \n",b,i);
		
		i = (int) d;
		System.out.printf("Valor de i y d: %d %f \n",i,d);
		
		b = (byte) d;
		System.out.printf("Valor de b y d: %d %f \n",b,d);
		System.out.printf("Valor de b y d: %d \t %f \n",b,d); // mismo valores que el anterior print pero hago uso de prueba del tabulador con \t
		
		int j = 2;
		System.out.printf("\nConversiones de tipos /n");
		System.out.printf("El valor de i: %d \n",i); // 257
		System.out.printf("El valor de j: %d \n",j); // 2
		System.out.printf("El valor de i / j: %d \n",i / j); // 257/2 = 128.5 (deberia ser)
		System.out.printf("El valor de d: %f \n",d); // 323.142
		System.out.printf("El valor de d / j: %f \n",d / j); // 323.142/2 = 161.9995 (deberia ser)
		
		int ii = 15;
		double dd = 3.5;
		System.out.printf("\nEl valor de ii / dd: %f \n",ii / dd); // 15/3.5 = 4.285714285714286
		
	}
}
