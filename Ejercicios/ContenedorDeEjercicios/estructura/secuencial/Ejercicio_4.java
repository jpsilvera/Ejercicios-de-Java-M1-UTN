package estructura.secuencial;

import java.util.*;

public class Ejercicio_4 
{
	public static void main(String[] args)
	{
		double centigrados;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la temperatura en grados Celsius: ");
		centigrados = scan.nextInt();
		
		double farenheit = toFarenheit(centigrados, scan);
		System.out.println("Farenheit es: "+ farenheit);
	}
	
	public static double toFarenheit (double cent, Scanner scan)
	{
		double base;
		System.out.println("Ingrese la base de conversion de farenheit (32 en general)");
		base = scan.nextDouble();
		return base + (9 * cent / 5);
	}
}

