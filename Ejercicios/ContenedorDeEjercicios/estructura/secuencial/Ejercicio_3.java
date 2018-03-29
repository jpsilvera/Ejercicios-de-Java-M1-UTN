package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un número para realizar los calculos: ");
		numero = scan.nextInt();
		
		System.out.println("El doble del número ingresado es: "+ 2*numero);
		System.out.println("El triple del número ingresado es: "+ 3*numero);	
	}

}
