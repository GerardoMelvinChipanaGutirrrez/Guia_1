package com.senati.eti;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		int sumatoria = (n * (n + 1))/ 2;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("sumatoria.....: "+ sumatoria);
	}

}
