package estructura.secuencial;

import java.util.*;

public class Ejercicio_1 
{
	public static void main(String[] args) 
	{
				int primero, segundo;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce un n�mero entero: "); 
				primero = scan.nextInt();
								
				System.out.println("Introduce el segundo n�mero entero:");
				segundo = scan.nextInt();
				
				System.out.println(String.format("Los n�meros ingresados son: ") + primero +" y " + segundo);
				
	}

}
