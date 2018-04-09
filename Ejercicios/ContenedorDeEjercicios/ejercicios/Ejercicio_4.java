package ejercicios;

public class Ejercicio_4 {

	public static void main(String[] args) 
	{
		/*Ejercicio básico inicial 4
		Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. 
		A continuación realiza las instrucciones necesarias para que:
		B tome el valor de C
		C tome el valor de A
		A tome el valor de D
		D tome el valor de B
		Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa debe mostrar:
		Valores iniciales
		A = 1
		B = 2
		C = 3
		D = 4
		Valores finales
		B toma el valor de C -> B = 3
		C toma el valor de A -> C = 1
		A toma el valor de D -> A = 4
		D toma el valor de B -> D = 2 */
		
		int A = 5;
		int B = 7;
		int C = 13;
		int D = 39;
		
		System.out.println(String.format("El valor ingresado para A es %d, para B es %d, para C es %d y para D es %d", A, B, C, D));
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println(String.format("Los valores intercambiados son: A = %d, B = %d, C = %d, D = %d", A,B,C,D));
	}
}
