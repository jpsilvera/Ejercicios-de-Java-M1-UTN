package estructura.secuencial;

import java.util.*;

public class Ejercicio_1 
{
	public static void main(String[] args) 
	{
				int primero, segundo;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce un número entero:"); 
				primero = scan.nextInt();
								
				System.out.println("Introduce el segundo número entero:");
				segundo = scan.nextInt();
				
				System.out.println(String.format("Los números ingresados son: ") + primero +" y " + segundo);
				
	}

}
