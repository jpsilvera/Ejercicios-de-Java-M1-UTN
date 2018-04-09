package ejercicios.principiantes;

import java.util.Scanner;

public class Ejercicio_7 
{
	public static void main(String[] args) 
	{
		/*7. Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje 
		 *indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10
		 * y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) 
		 * dentro del println para resolverlo. */
		
		int c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un valor para evaluar si es positivo o negativo: ");
		c = scan.nextInt();
		
	       System.out.println(c + (c >= 0 ? " es positivo " : " es negativo "));
	       System.out.println(c + (c % 2 == 0 ? " es par " : " es impar "));
	       System.out.println(c + (c % 5 == 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
	       System.out.println(c + (c % 10 == 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));
	       System.out.println(c + (c > 100 ? " es mayor que 100 " : " es menor que 100 "));		
	}

}
