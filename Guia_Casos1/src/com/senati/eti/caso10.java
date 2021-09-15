package com.senati.eti;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out. println("Ingrese el radio: ");
		float radio = sc.nextFloat();
		
		float resultado1 = radio*radio*3.14f;
		float resultado2 = (float)(2*radio*3.14f);
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Área del cuadrado.....: "+ resultado1);
		System.out.println("Perimetro del cuadrado: "+ resultado2);

	}

}
