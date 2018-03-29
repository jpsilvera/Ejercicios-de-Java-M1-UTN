package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio_11 
{

	public static void main(String[] args) 
	{
		System.out.println("Ingrese un número de 5 cifras:/n");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		numero = validarIngreso(numero,scan);
		//Validar que sean 5 digitos
		solucionCadena(numero);
		solucionEntero(numero);
	
	}

	
	
	
	
	
	
	
	
	
	private static void solucionEntero(int numero) {
		// TODO Auto-generated method stub
		
	}

	private static void solucionCadena(int numero) {
		// TODO Auto-generated method stub
		
	}



	private static int validarIngreso(int numero, Scanner scanner) 
	{
		if (numero > 9999 && numero < 100000) 
		{
			System.out.println("El valor es correcto");
			return numero;
		}else{
			System.out.println("El valor es incorrecto, re-ingrese un numero de 5 cifras");
			numero = scanner.nextInt();
			return validarIngreso(numero, scanner);	
		}
		
	}

}
