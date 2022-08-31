package ejerciciosClase.primitivosYReferenciales;

public class PrimitivosYReferencialesMain {

	public static void main(String[] args) {
		
		// Casteo implícito de primitivos
		System.out.println("Casteo implícito de primitivos:");
		int aa = 1999;
		byte b1 = 125;
		float bb = 20000000.0f;
		System.out.println("aa: "+aa);
		System.out.println("b1: "+b1);
		System.out.println("bb: "+bb);
		bb = aa;
		System.out.println("aa asignado a bb: "+bb);
		
		// Si descomentamos la siguiente línea da error de compilación:
		// aa = bb;
		
		
		// Casteo explícito:
		bb = 20000000.0f;
		aa = (int) bb;
		System.out.println("bb casteado a int en aa: "+aa);
		
		/*En el caso del byte, usa el primer bit para determinar el signo:
		 *Cuando el primer bit era 1 es negativo y cuando es negativo se debian invertir todos los valores y
		 *a ese resultado sumarle 1
		 * 255 = 1111 1111 --> es negativo asi que invertido queda = 0000 0000 --> luego sumamos 1 bit y queda final = 0000 0001 = 1 y como es negativo el resultado final es = -1
		 * 129 = 1000 0001 --> 0111 1111 = -127
		 * 128 = 1000 0000 --> 1000 0000 -128
		 * 127 = 0111 1111	= 127
		 */
		aa = 255;
		b1 = (byte) aa;
		System.out.println("aa casteado a int en b1: "+b1);
		aa = 129;
		b1 = (byte) aa;
		System.out.println("aa casteado a int en b1: "+b1);
		aa = 128;
		b1 = (byte) aa;
		System.out.println("aa casteado a int en b1: "+b1);
		aa = 127;
		b1 = (byte) aa;
		System.out.println("aa casteado a int en b1: "+b1);
		
		// Ejemplo de como convertir String a entero
		String cantidad = "1";
		System.out.println(Integer.valueOf(cantidad));
		
		// Ejemplo de error en la conversión:
		// String nombre = "Federico";
		// System.out.println(Integer.valueOf(nombre));
		
		
		// Caso híbrido String:
		
		// Inicialización instanciando:
		String a = new String("Federico");
		String b = new String("Federico");
		
		// Los objectId son diferentes, son objetos diferentes. Recordemos: cada objeto tiene 
		// identidad propia.
		System.out.println(Integer.toHexString(System.identityHashCode(a)));
		System.out.println(Integer.toHexString(System.identityHashCode(b)));
		System.out.println("Los federicos son iguales?: " + (a == b)); 		//aca comparo objectsId y son distintos
		System.out.println("Los federicos son iguales?: " + (a.equals(b))); //metodo a utilizar para comparar si  
																			//dos contenidos de la clase son  
																			//iguales (que sean iguales o no 
																			//dependera de la clase y de que es lo 
																			//que tendremos que tener en cuenta para 
																			//para saber si lo son)
		// Instanciamos de forma primitiva:
		String fed1 = "Federico";
		String fed2 = "Federico";
		
		// Los objectId son los mismos. Repasamos forma en que almacena los strings java.
		System.out.println(Integer.toHexString(System.identityHashCode(fed1)));
		System.out.println(Integer.toHexString(System.identityHashCode(fed2)));
		System.out.println("Los federicos son iguales?: " + (fed1 == fed2));
		
		// Mismo caso instanciando un entero de forma primitiva:
		int int1 = 1;
		int int2 = 1;
		
		System.out.println("int1: "+Integer.toHexString(System.identityHashCode(int1)));
		System.out.println("int2: "+Integer.toHexString(System.identityHashCode(int2)));
		
		// Instanciar los Wrappers está deprecado:
		Integer intWrapper1 = new Integer(1);
		Integer intWrapper2 = new Integer(1);
		
		// Vemos que igualmente los instancia y los objectsId son diferentes:
		System.out.println("intWrapper1: "+Integer.toHexString(System.identityHashCode(intWrapper1)));
		System.out.println("intWrapper2: "+Integer.toHexString(System.identityHashCode(intWrapper2)));
		
		// Qué pasa si los comparo con ==? Son diferentes porque == siempre compara objectId y no el valor.
		
		System.out.println("inWrapper1 == intWrapper2 ? "+(intWrapper1==intWrapper2));
		
		// Qué pasa si los comparo con .equals()? Son iguales, porque compara el valor.
				
		System.out.println("inWrapper1.equals(intWrapper2) ? "+(intWrapper1.equals(intWrapper2)));
		
		// Qué pasa si modifico el valor? Los wrappers son inmutables, si el valor cambia la JVM tiene que crear un nuevo
		// objeto con ese valor.
		System.out.println("intWrapper1 antes de modificar: "+Integer.toHexString(System.identityHashCode(intWrapper1)));
		intWrapper1 += 1;
		System.out.println("intWrapper1 despues de modificar: "+Integer.toHexString(System.identityHashCode(intWrapper1)));
		
		// Pasa lo mismo con los enteros primitivos? Si
		System.out.println("int1 antes de modificar: "+Integer.toHexString(System.identityHashCode(int1)));
		int1 += 1;
		System.out.println("int1 despues de modificar: "+Integer.toHexString(System.identityHashCode(int1)));
		
		// Que pasa si a int2 le sumo 1 tambien? Ambos quedaría en 2, y el objeto con entero = 2 ya fue creado, 
		// se le asigna ese objectId.
		
		System.out.println("int2 antes de modificar: "+Integer.toHexString(System.identityHashCode(int2)));
		int2 += 1;
		System.out.println("int2 despues de modificar: "+Integer.toHexString(System.identityHashCode(int2)));
		
		
		// Mismos casos pero usando una clase:
		
		Primitivos p = new Primitivos();
		
		Integer i = p.getIntegerReferencial();
		System.out.println("Valor de integer referencial: "+ i);
		i += 1;
		System.out.println("Valor de integer referencial modificado: "+i);
		
		// El valor se mantiene igual, recordemos que si un valor primitivo se modifica, Java crea un nuevo objeto y
		// lo reasigna,¿Pero a quien? A mi variable "i", el atributo de la clase sigue apuntando al mismo objectId.
		System.out.println("Valor del atributo de la clase se mantiene igual: "+ p.getIntegerReferencial());
		
		// Qué pasa con los String's? La pregunta es, si un objeto me devuelve su atributo de tipo String, lo puedo modiicar?
		
		String palabraInstanciada = p.getPalabraInstanciada();
		String palabraPrimitivo = p.getPalabraPrimitivo();
		
		// Primero comparamos objectId:
		System.out.println("palabraInstanciada local: "+Integer.toHexString(System.identityHashCode(palabraInstanciada)));
		System.out.println("palabraInstanciada objeto: "+Integer.toHexString(System.identityHashCode(p.getPalabraInstanciada())));
		System.out.println("palabraPrimitivo local: "+Integer.toHexString(System.identityHashCode(palabraPrimitivo)));
		System.out.println("palabraPrimitivo objeto: "+Integer.toHexString(System.identityHashCode(p.getPalabraPrimitivo())));
		
		// Asigno nuevos valores y NO cambia porque lo que estoy modificando es el objectId de mi variable local, y no el valor
		// final del objeto.
		palabraInstanciada = "Nuevo valor desde main";
		System.out.println("palabraInstanciada local: "+palabraInstanciada);
		System.out.println("palabraInstanciada objeto: "+p.getPalabraInstanciada());
		
		// Diferencia entre .equals() y ==: 
		// == siempre compara objectID, en cambio 
		// .equals(), en este caso particular (la implementacion que hace String) 
		// termina comparando la secuencia de caracteres que componen el string.
		System.out.println("Contenido de a: "+a);
		System.out.println("Contenido de b: "+b);
		System.out.println("a == b ?: "+(a==b));
		System.out.println("a.equals(b) ?: "+a.equals(b));
	}

}
