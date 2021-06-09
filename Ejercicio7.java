/*Diseñar un algoritmo que genere un numero aleatorio del 10 al 50, luego lo muestre y luego 
calcule y muestre el mismo número disminuido en un 15%*/

public class Ejercicio7{

	public static void main(String[] args) {
		
		int numero;
		double nDisminuido;
		double porcentaje = 0.15;
		numero = (int)(Math.random()*50+10);

		System.out.println("El numero aleatorio generado es: "+ numero);

		nDisminuido = (numero - (numero * porcentaje));

		System.out.println("El numero disminuido en un 15% es: " + nDisminuido); 
	}
}