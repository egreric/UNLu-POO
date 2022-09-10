package ejerciciosGuiaClasesYAsociaciones.Ejercicio1;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int cantidadDeEjemplares;
	private int cantidadDeEjemplaresPrestados;
	private int cantidadDePaginas;
	
	// Metodos para instanciacion de libros sin ISBN
	public Libro (String titulo, String autor, int cantPaginas, int cantEjemplares) {
		this.titulo = new String(titulo);
		this.autor = new String(autor);
		this.isbn = new String ("");
		this.cantidadDeEjemplares = cantEjemplares;
		this.cantidadDeEjemplaresPrestados = 0;
		this.cantidadDePaginas = cantPaginas;
	}
	
	// Metodos para instanciacion de libros con ISBN
	public Libro (String titulo, String autor, String isbn, int cantPaginas, int cantEjemplares) {
		this.titulo = new String(titulo);
		this.autor = new String(autor);
		this.isbn = new String (isbn);
		this.cantidadDeEjemplares = cantEjemplares;
		this.cantidadDeEjemplaresPrestados = 0;
		this.cantidadDePaginas = cantPaginas;
	}
	
	public int cantidadDeEjemplaresDisponibles() {
		return (this.cantidadDeEjemplares - this.cantidadDeEjemplaresPrestados);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public String getISBN() {
		return this.isbn;
	}
	
	public int getCantidadDePaginas() {
		return this.cantidadDePaginas;
	}
	
	public int getCantidadDeEjemplares() {
		return this.cantidadDeEjemplares;
	}
	
	public int getCantidadDeEjemplaresPrestados() {
		return this.cantidadDeEjemplaresPrestados;
	}
	
	public String getDescripcion() {
		return ("El libro '" + this.titulo + "' creado por el autor '" + this.autor + "' tiene "
				+ this.cantidadDePaginas + " paginas, quedan " + cantidadDeEjemplaresDisponibles() + " ejemplares disponibles y se prestaron " + this.cantidadDeEjemplaresPrestados + " ejemplares." );
	}
	
	public void prestar() {
		this.cantidadDeEjemplaresPrestados++;
	}
	
	public boolean disponibleParaPrestamo() {
		if (cantidadDeEjemplaresDisponibles() > 1) {
			return true;
		} else {
			return false;
		}
	}

	

}
