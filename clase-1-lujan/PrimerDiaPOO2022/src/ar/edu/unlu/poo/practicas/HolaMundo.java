package ar.edu.unlu.poo.practicas;

public class HolaMundo {
	private static Integer dia;

	public static void main(String[] args) {
		dia = 5;
		System.out.println(dia);
		System.out.println("Hola mundo desde POO 2022");
		
		Auto miAuto = new Auto("Ford", "rojo");
		Auto elAutoDeJuan = new Auto("Renault", "Negro");
		
		System.out.println(miAuto.getMarca());
		miAuto.setMarca("Chevrolet");
		System.out.println(miAuto.getMarca());
	}

}
