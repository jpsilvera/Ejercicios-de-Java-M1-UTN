package ejercicios.principiantes;

import java.util.Scanner;

public class Ejercicio_6 
{
	public static void main(String[] args) 
	{
		/*Ejercicio b�sico inicial 6
		Escribe un programa java que declare una variable B de tipo entero y as�gnale un valor. 
		A continuaci�n muestra un mensaje indicando si el valor de B es positivo o negativo. 
		Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
		
		Si por ejemplo B = 1 la salida ser�
		1 es positivo
		Si fuese por ejemplo B = -1 la salida ser�:
		-1 es negativo */
		
		int B;
	    Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el n�mero a evaluar: ");
		B = scan.nextInt();
		
		System.out.println(B >= 0 ? "El n�mero ingresado es positivo." : "El n�mero ingresado es negativo.");
	}
}
