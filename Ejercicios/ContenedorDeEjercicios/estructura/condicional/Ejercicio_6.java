package estructura.condicional;

/*Ejercicio 6: Programa java que lea un car�cter por teclado
y compruebe si es un d�gito num�rico (cifra entre 0 y 9).*/

import java.util.Scanner;

public class Ejercicio_6 
{
	public static void main(String[] args) 
	{
		String input = " ";
		System.out.println("Ingrese un n�mero entre el 0 y 9: ");
		Scanner scanNumber = new Scanner(System.in);
		input = scanNumber.nextLine();
		
		//Validar la longitud del input
		validarLongitudInput(input);
		
		/*Alternativa con Metodo booleano
		if (validarLongitudInput(input)) 
		{
			validarInput(input);
		}*/
	}
	
	/*Alternativa con boolean
	private static boolean validarLongitudInput(String input) 
	{
		if (input.length() > 1)
		{
			System.out.println("El n�mero ingresado tiene m�s de 1 caracter.");
		}
		return false;
	}*/
	
	private static void validarLongitudInput(String input) 
	{
		if (input.length() > 1)
		{
			System.out.println("El n�mero ingresado tiene m�s de 1 caracter.");
		} else {
			validarInput(input);
		}
	}


	public static void validarInput(String input) 
	{
		try 
		{
			Integer integer = new Integer(input);
			
			if (integer >=0 && integer <= 9)
			{
				System.out.println("El caracter ingresado es valido y su valor es: " + input);
			} else {
				System.out.println("Es un n�mero invalido.");
			}
		} catch (Exception e) 
		{
			// Muestra el error e.printStackTrace();
			System.out.println("El valor ingresado es incorrecto");
		}
	}
}
