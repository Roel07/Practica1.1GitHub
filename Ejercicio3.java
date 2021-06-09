/*3.  Crear un algoritmo que muestre por pantalla el doble y el triple de un número ingresado por
    teclado.*/

import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
    		

    	Scanner entrada = new Scanner(System.in);

    	int numero;

    	System.out.println("Ingrese un número: ");
    	numero=entrada.nextInt();

    	int doble=numero*2;
    	int triple=numero*3;

    	System.out.println("El doble del número ingresado es: "+ doble);
    	System.out.println("El triple del número ingresado es: "+ triple);


    }
}