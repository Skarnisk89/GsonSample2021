package gsonSample;

import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class Gson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona();

		// TODO recoger datos desde la consola y almacenarlos en "p" 

		Scanner scanner = new Scanner(System.in);
		String nombre, apellido;
		int edad;
		
		System.out.println("intoduce el nombre");// print - misma limea, println- salto de linea
		nombre = scanner.nextLine();
		System.out.println("introduce el apellido");
		apellido = scanner.nextLine();
		System.out.println("pon la edad");
		edad  = scanner.nextInt();                // almacenar los datos de las variables
		
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setEdad(edad);        //insertamos los valores recogidos por el scanner
		
		
		com.google.gson.Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}

}
