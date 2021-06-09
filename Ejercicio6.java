/* Diseñar un algoritmo que genere un número aleatorio del 0 al 200, lo muestre y luego calcule 
y muestre el mismo numero aumentado en un 30% (función aleatorio (min y max) que retorna un 
numero aleatorio entre el min y mas)*/

public class Ejercicio6{

	public static void main(String[] args) {
		
		int numero;
		double nAumentado;
		double porcentaje = 0.3;
		numero = (int)(Math.random()*200+1);

		System.out.println("El numero aleatorio generado es: "+ numero);

		nAumentado = (numero + (numero * porcentaje));

		System.out.println("El numero aumentado en un 30% es: " + nAumentado); 
	}
}