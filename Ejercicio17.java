//Número 17

import java.util.Scanner;

public class Ejercicio17{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int lado1, lado2, lado3;

		System.out.println("Ingrese el primer lado: ");
		lado1 = entrada.nextInt();

		System.out.println("Ingrese el segundo lado: ");
		lado2 = entrada.nextInt();

		System.out.println("Ingrese el tercer lado: ");
		lado3 = entrada.nextInt();

		if (lado1 == lado2 && lado1 == lado3){
			System.out.println("Triangulo equilatero");

		} else if (lado1 == lado2 && lado1 != lado3){
			System.out.println("Triangulo Isoceles: " );

		}else 
			System.out.println("El triangulo es Escaleno: " );

	}

}