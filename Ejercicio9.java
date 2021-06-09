

import java.util.Scanner;

public class Ejercicio9{
	 
	 public static void main(String[] args) {

	 	Scanner entrada = new Scanner(System.in);

	 	String a,b;
	 	System.out.println("Ingrese la primera palabra: ");
	 	a = entrada.nextLine();

	 	System.out.println("Ingrese la segunda palabra: ");
	 	b = entrada.nextLine();

	 	String b1 = a;
	 	String a1 = b;

	 	System.out.println("La primera palabra intercambiada es: " + a1);
	 	System.out.println("La segunda palabra intercambiada es: " + b1);

	 	
	 }
}