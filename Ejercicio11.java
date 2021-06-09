//Numero 11.

import java.util.Scanner;

public class Ejercicio11{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		double yardasV = 0.0109361, metrosV = 0.01, piesV = 0.0328084, pulgV = 0.393701;

		System.out.println("Ingrese el valor en centimetros que desea convertir: ");
		numero = entrada.nextDouble();

		double  yardas = numero * yardasV;
		double  metros = numero * metrosV;
		double  pies = numero * piesV;
		double  pulg = numero * pulgV;

		System.out.println("El valor en yardas es: " + yardas);
		System.out.println("El valor en metros es: " + metros);
		System.out.println("El valor en pies es: " + pies);
		System.out.println("El valor en pulgadas es: " + pulg);


	}
}