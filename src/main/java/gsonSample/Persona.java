package gsonSample;

public class Persona {

	private String nombre; //declaramos los atributos de la clase en "private" para que solo pueda acceder el propio objeto (persona)
	private String apellido;
	private int edad;
	
	
	//utilizamos private para que la propia clase se ala que modifique sus propios atributos.
	//para modificar los atributos de una clase desde fuera, necesitamos crear los metodos necesarios EJ(set/get nombre, set/get apellido, etc)
	
	public Persona() {
	}     //el constructor siempre ha de ser el mismo que el de la clase (no hace falta el punto y coma para cerrar) no recibe nada por parametro

	public Persona(String nombre, String apellido, int edad) {//con esto vamos a inicializarlo el constructor
		this.nombre = nombre; // this hace referencia al atributo dentro de la clase
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}