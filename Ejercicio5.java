/* Diseñar un algoritmo que pida un numero por teclado y luego imprima el numero siguiente 
al ingresado */

import java.util.Scanner;

public class Ejercicio5{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero, nSiguiente;

		System.out.println("Ingrese un numero entero: ");
		numero = entrada.nextInt();

		nSiguiente = numero +1;

		System.out.println("El numero siguiente ingresado es: " + nSiguiente);
	}
}