package com.senati.eti;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el lado1 del cuadrado: ");
		int lado1 = sc.nextInt();
		System.out.println("Ingrese el lado2 del cuadrado: ");
		int lado2 = sc.nextInt();
		
		int resultado1 = lado1*lado2;
		int resultado2 = (lado1*2)+(lado2*2);
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Área del cuadrado.....: "+ resultado1);
		System.out.println("Perimetro del cuadrado: "+ resultado2);

	}

}
