package ejerciciosClase.primitivosYReferenciales;

public class Primitivos {
	private Integer integerReferencial;
	private int integerPrimitivo;
	
	private String palabraInstanciada;
	private String palabraPrimitivo;
	
	public Primitivos() {
		integerReferencial = 1; 
		integerPrimitivo = 100;
		palabraInstanciada = new String("POO 2022");
		palabraPrimitivo = "POO 2022";
	}
	
	public Integer getIntegerReferencial() {
		return integerReferencial;
	}
	
	public int getIntegerPrimitivo() {
		return this.integerPrimitivo;
	}
	
	public String getPalabraInstanciada() {
		return palabraInstanciada;
	}
	
	public String getPalabraPrimitivo() {
		return palabraPrimitivo;
	}
}
