package ejerciciosGuiaClasesYAsociaciones.Ejercicio1;

public class Ejercicio1 {
	public static void main (String[] args) {
		Libro libro1 = new Libro("Rayuela","Julio Cortazar",227,4);
		Libro libro2 = new Libro("Harry Potter","J. K. Rowling",535,3);
		System.out.println(libro1.getDescripcion());
		System.out.println(libro2.getDescripcion());
		
		if (libro1.getCantidadDePaginas() > libro2.getCantidadDePaginas()) {
			System.out.println("El libro '" + libro1.getTitulo() + "' tiene mas paginas que el libro '" + libro2.getTitulo() + "' \n");
		} else {
			if (libro1.getCantidadDePaginas() < libro2.getCantidadDePaginas()) {
				System.out.println("El libro '" + libro2.getTitulo() + "' tiene mas paginas que el libro '" + libro1.getTitulo() + "' \n");
			} else {
				System.out.println("Ambos libros, tanto '" + libro1.getTitulo() + "' como '" + libro2.getTitulo() + "' tienen la misma cantidad de paginas \n");
			}
		}
		
		Libro libro3 = new Libro ("El Alquimista","Paulo Coelho",425,10);
		Libro libro4 = new Libro ("La Isla Misteriosa","Julio Verne",232,1);
		
		System.out.println(libro3.getDescripcion());
		System.out.println(libro4.getDescripcion());
		
		if (libro3.disponibleParaPrestamo()) {
			libro3.prestar();
			System.out.println("\nEl libro '" + libro3.getTitulo() + "' a sido prestado. " + " Quedan " + libro3.cantidadDeEjemplaresDisponibles() + " Ejemplares disponibles.");
		} else {
			System.out.println("\nEl Libro '" + libro3.getTitulo() + "' no tiene ejemplares disponibles para prestamo, pero queda uno para su consulta");
		}
		
		if (libro4.disponibleParaPrestamo()) {
			libro4.prestar();
			System.out.println("El libro '" + libro4.getTitulo() + "' a sido prestado. " + " Quedan " + libro4.cantidadDeEjemplaresDisponibles() + " Ejemplares disponibles. \n");
		} else {
			System.out.println("El Libro '" + libro4.getTitulo() + "' no tiene ejemplares disponibles para prestamo, pero queda uno para su consulta \n");
		}
		
		System.out.println(libro3.getDescripcion());
		System.out.println(libro4.getDescripcion());
		
		System.out.println("\nDel libro '" + libro1.getTitulo() + "' se prestaron: " + libro1.getCantidadDeEjemplaresPrestados() + " Ejemplar/es");
		System.out.println("Del libro '" + libro2.getTitulo() + "' se prestaron: " + libro2.getCantidadDeEjemplaresPrestados() + " Ejemplar/es");
		System.out.println("Del libro '" + libro3.getTitulo() + "' se prestaron: " + libro3.getCantidadDeEjemplaresPrestados() + " Ejemplar/es");
		System.out.println("Del libro '" + libro4.getTitulo() + "' se prestaron: " + libro4.getCantidadDeEjemplaresPrestados() + " Ejemplar/es");
		
	}
}


