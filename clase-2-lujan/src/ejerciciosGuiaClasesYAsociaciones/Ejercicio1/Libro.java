package ejerciciosGuiaClasesYAsociaciones.Ejercicio1;

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private int cantidadDeEjemplares;
	private int cantidadDeEjemplaresPrestados;
	private int cantidadDePaginas;
	private String descripcion;
	
	// Metodos para instanciacion de libros sin ISBN
	public Libro (String titulo, String autor, int cantPaginas, int cantEjemplares) {
		this.titulo = new String(titulo);
		this.autor = new String(autor);
		this.isbn = new String ("");
		this.cantidadDeEjemplares = cantEjemplares;
		this.cantidadDeEjemplaresPrestados = 0;
		this.cantidadDePaginas = cantPaginas;
		this.descripcion = new String ("El libro '" + this.titulo + "' creado por el autor '" + this.autor + "' tiene " 
		+ this.cantidadDePaginas + " paginas," + " quedan " + cantidadDeEjemplaresDisponibles() + " disponibles y se prestaron " + this.cantidadDeEjemplaresPrestados + " ejemplares." );
	}
	
	private int cantidadDeEjemplaresDisponibles() {
		return (this.cantidadDeEjemplares - this.cantidadDeEjemplaresPrestados);
	}
	
	public String getDescripcion() {
		return this.descripcion;	
	}
	// Metodos para instanciacion de libros con ISBN
	
}
