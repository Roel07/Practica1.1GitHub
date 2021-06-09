//Numero 12

import java.util.Scanner;

public class Ejercicio12{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double gradosC, gradosF;

		System.out.println("Ingrese la temperatura en grados celcius (°C) ");
		gradosC = entrada.nextDouble();

		gradosF = ((gradosC*9/5) +32);

		System.out.println("Los grados Fahrenheits son: " + gradosF);
	}
}