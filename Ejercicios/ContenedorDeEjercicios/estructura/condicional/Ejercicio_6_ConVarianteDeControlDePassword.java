package estructura.condicional;

import java.util.Scanner;

public class Ejercicio_6_ConVarianteDeControlDePassword 
{
	public static void main(String[] args) 
	{
		String input = " ";
		System.out.println("Ingrese un n�mero entre el 0 y 9: ");
		Scanner scanNumber = new Scanner(System.in);
		input = scanNumber.nextLine();
		
		//Concatenar el mensaje
		String mensaje = "";
		mensaje += validarLongitudInput(input);
		mensaje += validarInput(input);
		
		if (mensaje.length() ==0)
		{
			System.out.println("Est� todo bien!.");
		} else {
			System.out.println(mensaje);
		}
		
		//Validar la longitud del input
		validarLongitudInput(input);
		
	}
	
	private static String validarLongitudInput(String input) 
	{
		if (input.length() > 1)
		{
			return ("El n�mero ingresado tiene m�s de 1 caracter.\n"); // \n Simula un espacio de Enter.
		} else {
			return "";
		}
	}


	public static String validarInput(String input) 
	{
		try 
		{
			Integer integer = new Integer(input);
			
			if (integer >=0 && integer <= 9)
			{
				return "";
			} else {
				return ("Es un n�mero invalido. \n");
			}
		} catch (Exception e) 
		{
			// Muestra el error e.printStackTrace();
			return("El valor ingresado es incorrecto");
		}
	}
}
