package ejercicios.principiantes;

public class Ejercicio_5 
{
	public static void main(String[] args) 
	{
		/*Ejercicio b�sico inicial 5
		Escribe un programa java que declare una variable A de tipo entero y as�gnale un valor. 
		A continuaci�n muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) 
		dentro del println para resolverlo.
		Si por ejemplo A = 14 la salida ser�
		14 es par
		Si fuese por ejemplo A = 15 la salida ser�:
		15 es impar*/
		
		int A = 16;
		
		System.out.println("El n�mero ingresado es: " + A);
		
		System.out.println((A % 2 == 0 ? "El n�mero es par." : "El n�mero es impar."));
	}

}
