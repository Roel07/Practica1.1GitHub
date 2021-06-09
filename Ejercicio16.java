//Número 16

import java.util.Scanner;

public class Ejercicio16{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;

		System.out.println("Ingrese el primer numero: ");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		numero2 = entrada.nextInt();

		System.out.println("Ingrese el tercer numero: ");
		numero3 = entrada.nextInt();

		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("El numero 1 es el mayor: " + numero1);

		} else if (numero2 > numero3){
			System.out.println("El numero 2 es el mayor: " + numero2);

		}else 
			System.out.println("El numero 3 es el mayor: " + numero3);


	}
}