// Número 10

import java.util.Scanner;

public class Ejercicio10{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int base, altura;

		 System.out.println("Ingrese la base del rectangulo ");
		 base = entrada.nextInt();

		 System.out.println("Ingrese la altura del rectangulo ");
		 altura = entrada.nextInt();

		 int area = base * altura;
		 int perimetro = (base*2) + (altura*2);

		 System.out.println("El area del rectangulo es: " + area);
		 System.out.println("El perimetro del rectangulo es: " + perimetro);

	}
}