/*. Diseñar un algoritmo que imprima el cuadrado y el cubo de un número ingresado por teclado*/

import java.util.Scanner;

public class Ejercicio4{

	public static void main(String[] args) {
		

    	Scanner entrada = new Scanner(System.in);

    	int numero;

    	System.out.println("Ingrese un número: ");
    	numero=entrada.nextInt();

    	int cuadrado = numero*numero;
    	int cubo = numero*numero*numero;

    	System.out.println("El cuadrado del número ingresado es: "+ cuadrado);
    	System.out.println("El cubo del número ingresado es: "+ cubo);
	}

}