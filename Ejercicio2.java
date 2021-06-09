//2. Realice un algoritmo que solicite dos datos: país y capital. Y luego muestre la capital 
   //del país. El cartel debe ser como  lo indica el siguiente ejemplo: “Katmandú es la capital de Nepal”.

import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String pais, capital;

		System.out.println("Por favor ingrese un país: ");
		pais = entrada.nextLine();

		System.out.println("Por favor ingrese una capital: ");
		capital= entrada.nextLine();

		System.out.println( capital + " Es la capital de " + pais);

	}


}