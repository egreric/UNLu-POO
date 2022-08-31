package ar.edu.unlu.poo.practicas;

public class Auto {
	private String marca;
	private String color;
	private Integer kilometrosRecorridos;
	private Boolean encendido;
	
	public Auto(String marcaElegida, String color) {
		this.marca = marcaElegida;
		this.color = color;
		this.kilometrosRecorridos = 0;
		this.encendido = false;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marcaNueva) {
		this.marca = marcaNueva;
	}
}
