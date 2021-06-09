//Número 13

import java.util.Scanner;

public class Ejercicio13{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double radio, altura, volumen;
		double PI = 3.1416;

		System.out.println("Ingrese el radio del cilindro: ");
		radio = entrada.nextDouble();

		System.out.println("Ingrese la altura del cilindro: ");
		altura = entrada.nextDouble();

		if (radio > 0 && altura > 0); {

			volumen = (PI * radio*radio * altura);
			System.out.println("El volumen del cilindro es: " +volumen);

		}
			
		
		

	}
}