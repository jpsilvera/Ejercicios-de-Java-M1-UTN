package estructura.secuencial;

import java.util.*; //Va a utilizar math y Scanner

public class Ejercicio_5 
{
	public static void main(String[] args) 
	{
	
		/*Ejercicio 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
		 * pantalla la longitud y el área de la circunferencia.*/

		/*Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*/
		
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area;
        
        System.out.println("Introduce radio de la circunferencia:");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio; 
        area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);
	}
}
