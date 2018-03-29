package estructura.secuencial;

import java.util.Scanner;
import java.math.*;

public class Ejercicio_8 
{
	public static void main(String[] args) 
	{
		double radio;
		double volumenDeLaEsfera;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de la esfera: ");
		radio = scan.nextDouble();
		
		volumenDeLaEsfera = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radio, 3 );
		
		System.out.println("El volumen de la esfera es: " + volumenDeLaEsfera);
	}
}
