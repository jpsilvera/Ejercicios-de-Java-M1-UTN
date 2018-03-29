package ejercicios.principiantes;

import java.util.*;

public class Ejercicio_2 {

	public static void main(String[] args) 
	{
		/* Ejercicio básico inicial 2:

			Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna 
			a cada una un valor. A continuación muestra por pantalla:
			
			El valor de cada variable.
			La suma  X + Y
			La diferencia  X – Y
			El producto  X * Y
			El cociente  X / Y
			El resto  X % Y
			
			La suma  N + M
			La diferencia  N – M
			El producto  N * M
			El cociente  N / M
			El resto  N % M
			
			La suma X + N
			El cociente Y / M
			El resto Y % M
			El doble de cada variable
			La suma de todas las variables
			El producto de todas las variables
			Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla: */
		
			int X = 3, Y = 4;
			double N = 3.5, M = 6.8;
			
			System.out.println("El valor de X es: " + X);
			System.out.println("El valor de Y es: " + Y);
			
			System.out.println("El valor de M es: " + M);
			System.out.println("El valor de N es: " + N);
			
			System.out.println("N + M: " + (N+M));
			System.out.println("N - M: " + (N-M));
			System.out.println("N * M: " + (N*M));
			System.out.println("N / M: " + (N/M));
			System.out.println("N % M: " + (N%M));

			System.out.println("X + N: " + (X+N));
			System.out.println("Y / M: " + (Y/M));
			System.out.println("Y % M: " + (Y*M));
			
			System.out.println("El doble de X es: " + 2*X);
			System.out.println("El doble de Y es: " + 2*Y);
			System.out.println("El doble de N es: " + 2*N);
			System.out.println("El doble de M es: " + 2*M);
			
			System.out.println("La suma de todas las variables es: " + (X+Y+N+M));
			System.out.println("El producto de las variables es: " + (X*Y*N*M));
			
			
			

	}

}
