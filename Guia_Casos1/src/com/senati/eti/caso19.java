package com.senati.eti;


import java.text.DecimalFormat;
import java.util.Scanner;

public class caso19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Ingrese el lado del triángulo: ");
		float lado = sc.nextFloat();
		
		float perimetro =lado*3;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("perimetro del triágulo: "+ df.format(perimetro));
	}

}
