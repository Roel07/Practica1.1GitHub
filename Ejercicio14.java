//Numero 14.

import java.util.Scanner;

public class Ejercicio14{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		

		System.out.println("Ingrese el el primer número: ");
		num1 = entrada.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();

		if (num2 % num1 == 0) {

			
			System.out.println("Es divisible: " );

		} else 
			System.out.println("No es divisible: ");
		

	}
}