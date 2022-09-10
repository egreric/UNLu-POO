package ejerciciosGuiaClasesYAsociaciones.Ejercicio3;

import java.util.Random;

public class Password {
	private String password;
	private int longitud;
	private final int LARGO_DEFAULT = 8;
	private TipoDeClave tipoDeClave;
	
	public Password () {
		this.setLongitud(LARGO_DEFAULT);
		generarPassword();
		this.setTipoDeClave(determinaTipoDeClave());
	}
	
	public Password (int longitud) {
		this.setLongitud(longitud);
		generarPassword();
		this.setTipoDeClave(determinaTipoDeClave());
	}
	
	private TipoDeClave determinaTipoDeClave() {
		if (this.getLongitud() < 5) {
			return TipoDeClave.DEBIL;
		}
		
		int cantMayus =0, cantMinus = 0, cantNum = 0;
		int i = 0;
		
		String password = this.getPassword();
		char caracter;
		while (i < this.getLongitud()) {
			caracter = password.charAt(i);
			if (esMayus(caracter)){
				cantMayus++;
			} else if (esMinus(caracter)){
				cantMinus++;
			} else {
				cantNum++;
			}
			
			if ( (cantMayus >= 2) && (cantMinus >= 1) && (cantNum >= 2) ) {
				return TipoDeClave.FUERTE;
			}
			
			i++;
		}
		return TipoDeClave.DEBIL;
	}
	
	private boolean esMayus(char caracter) {
		if ( (caracter >= 'A') && (caracter <= 'Z') ) {
			return true;
		}
		return false;
	}
	
	private boolean esMinus(char caracter) {
		if ( (caracter >= 'a') && (caracter <= 'z') ) {
			return true;
		}
		return false;
	}

			
	private void generarPassword() {
		Random random = new Random();
		String password = "";
		
		// creo un string con los caracteres que me interesa usar, a este string le voy a ir sacando caracteres segun la longitud del password
		String setDeCaracteres = "abcdefghijhklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		
		int randomInt; 
		char randomChar; 
		
		for (int i = 0; i < this.getLongitud(); i++) {
			randomInt = random.nextInt(setDeCaracteres.length()); // obtengo un numero al azar entre 0 y el largo de setDeCaracteres (segun ese valor, sera el caracter elegido para la password)
			randomChar = setDeCaracteres.charAt(randomInt); 
			password += String.valueOf(randomChar);
		}
		this.setPassword(password);
	}
	
	public void transformaAClaveFuerte () {
		if (!this.claveEsFuerte()) {
			Random random = new Random();
			String passwordExtra = "";
			
			String setDeCaracteresLetrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String setDeCaracteresLetrasMinus = "abcdefghijhklmnopqrstuvwxyz";
			String setDeCaracteresNumeros = "0123456789"; 
			
			for (int i = 1; i <= 2; i++) {
				int randomInt = random.nextInt(setDeCaracteresLetrasMayus.length());
				char randomChar = setDeCaracteresLetrasMayus.charAt(randomInt);
				passwordExtra += String.valueOf(randomChar);
				
				randomInt = random.nextInt(setDeCaracteresNumeros.length());
				randomChar = setDeCaracteresNumeros.charAt(randomInt);
				passwordExtra += String.valueOf(randomChar);
			}
				
			int randomInt = random.nextInt(setDeCaracteresLetrasMinus.length());
			char randomChar = setDeCaracteresLetrasMinus.charAt(randomInt);
			passwordExtra += String.valueOf(randomChar);
			
			this.setPassword(this.getPassword() + passwordExtra);
			this.longitud = this.getPassword().length();
			this.setTipoDeClave(determinaTipoDeClave());
		}
	}
	
	// para que la contrasenia sea considerada FUERTE debe tener 2 mayusculas, 1 minuscula y 2 numeros (por lo tanto tiene que tener al menos 5 caracteres)
	public boolean claveEsFuerte() {
		if (this.getTipoDeClave() == TipoDeClave.FUERTE) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String tipoContrasenia;
		if (this.claveEsFuerte()) {
			tipoContrasenia = "FUERTE";
		}
		else {
			tipoContrasenia = "DEBIL";
		}
		return ("La contrasenia es: " + this.getPassword() + "\nSu longitud es de: " + this.getLongitud() + " caracteres\nEs un tipo de contrasenia: " + tipoContrasenia);
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setLongitud (int longitud) {
		this.longitud = longitud;
		generarPassword();
		this.setTipoDeClave(determinaTipoDeClave());
	}
	
	public int getLongitud() {
		return this.longitud;
	}
	
	private TipoDeClave getTipoDeClave() {
		return this.tipoDeClave;
	}
	
	private void setTipoDeClave(TipoDeClave tipoDeClave) {
		this.tipoDeClave = tipoDeClave;
	}
	
}
