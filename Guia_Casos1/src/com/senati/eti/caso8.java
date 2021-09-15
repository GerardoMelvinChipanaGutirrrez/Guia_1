package com.senati.eti;

import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el lado del cuadrado: ");
		int lado1 = sc.nextInt();
		
		int resultado1 = lado1^2;
		//lado * lado o (cast)math.pow(lado,numero)
		int resultado2 = lado1*4;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Área del cuadrado.....: "+ resultado1);
		System.out.println("Perimetro del cuadrado: "+ resultado2);
	}

}
