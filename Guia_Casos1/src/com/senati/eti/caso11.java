package com.senati.eti;

import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine(); //crea palabras y objetos
		
		int cantidad = nombre.length();// equivalente a longitud
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Número de caracteres: " + cantidad);
	}

}
