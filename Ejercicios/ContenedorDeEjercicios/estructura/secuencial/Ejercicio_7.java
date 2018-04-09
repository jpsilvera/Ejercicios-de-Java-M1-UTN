package estructura.secuencial;

import java.util.*;

public class Ejercicio_7 
{
	public static void main(String[] args) 
	{
		/*Ejercicio 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la
		 *hipotenusa según el teorema de Pitágoras.*/
		
	        Scanner scan = new Scanner(System.in);
	        double cateto1, cateto2;
	        
	        System.out.print("Introduzca longitud del primer cateto: ");
	        cateto1 = scan.nextDouble();
	        
	        System.out.print("Introduzca longitud del segundo cateto: ");
	        cateto2 = scan.nextDouble();
	        
	      System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));
	}
}
