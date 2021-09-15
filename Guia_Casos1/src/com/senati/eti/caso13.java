package com.senati.eti;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Alumno: " + nombre + " " +  apellido);	
	}

}
