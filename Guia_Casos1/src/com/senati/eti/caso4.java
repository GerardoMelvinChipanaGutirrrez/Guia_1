package com.senati.eti;
import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float numero1 = 0;
		float numero2 = 0;
		System.out.println("Primer número: ");
		numero1 = sc.nextFloat();
		
		System.out.println("segundo número: ");
		numero2 = sc.nextFloat();
		
		float suma = numero1 + numero2;
		float resta = numero1 - numero2;
		float producto = numero1 * numero2;
		float cociente = numero1 / numero2;
		float restaentero = numero1 % numero2;
		
		System.out.println("NÚMEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Suma........:" + suma);
		System.out.println("Resta.......:" + resta);
		System.out.println("producto....:" + producto);
		System.out.println("cociente....:" + cociente);
		System.out.println("resto_entero:" + restaentero);
	}

}
