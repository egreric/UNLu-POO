package ejerciciosGuiaClasesYAsociaciones.Ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Password p1 = new Password();
		Password p2 = new Password(4);
		//Password p3 = new Password(15);
		//Password p4 = new Password();

		//System.out.println(p1.toString() + "\n");
		//System.out.println(p2.toString() + "\n");
		//System.out.println(p3.toString() + "\n");
		//System.out.println(p4.toString() + "\n");

		p2.transformaAClaveFuerte();
		System.out.println(p2.toString());
	}
}
