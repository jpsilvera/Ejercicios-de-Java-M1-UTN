package ejercicios.principiantes;

import java.util.*;

public class Ejercicio_3 
{
	 public static void main(String[] args)
	 {
			/*Escribe un programa Java que declare una variable entera N y asígnale un valor. 
			A continuación escribe las instrucciones que realicen los siguientes:
			
			Incrementar N en 77.
			Decrementarla en 3.
			Duplicar su valor.
			Si por ejemplo N = 1 la salida del programa será:
			Valor inicial de N = 1
			N + 77 = 78
			N - 3 = 75
			N * 2 = 150*/
			
			int N = 10;
			
			System.out.println("El valor ingresado es: " +N);
			
			N += 77;
			System.out.println("El valor incrementado en 77 es: " + N);
			
			N -=3;
			System.out.println("El valor decrementado en 3 es: " + N);
			
			System.out.println("El doble de N es: " + N*2);			
	 }
}
