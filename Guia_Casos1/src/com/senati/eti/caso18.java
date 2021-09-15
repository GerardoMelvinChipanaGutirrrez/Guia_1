package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Ingrese la base del triángulo: ");
		float base = sc.nextFloat();
		
		System.out. println("Ingrese la altura del triángulo: ");
		float altura  = sc.nextFloat();
		
		float area=(base*altura)/2;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Área del triágulo: "+ df.format(area));
	}

}
