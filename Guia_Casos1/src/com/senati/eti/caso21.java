package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Gasto: ");
		int gasto = sc.nextInt();
		
		float ct=gasto-(gasto*42/100);
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Total a gastar: S/"+ df.format(ct));
	}

}
