// Número 15

import java.util.Scanner;

public class Ejercicio15{


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if (numero > 0){
			System.out.println("El numero Ingresado es positivo: ");

		} else if (numero <0){
			System.out.println("El numero Ingresado es negativo: ");

		}else 
			System.out.println("Nullo");

	}
}