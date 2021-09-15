package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Ingrese el nombre del Alumno: ");
		String nombre = sc.nextLine();
		
		System.out. println("Ingrese primero nota: ");
		float nt1 = sc.nextFloat();
		System.out. println("Ingrese segunda nota: ");
		float nt2 = sc.nextFloat();
		System.out. println("Ingrese tercera nota: ");
		float nt3 = sc.nextFloat();
		
		float promedio=((nt1*20/100)+(nt2*30/100)+(nt3*50/100))/3;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Nota promedio del alumno"+nombre);
		System.out.println("es: "+ df.format(promedio));
	}

}
