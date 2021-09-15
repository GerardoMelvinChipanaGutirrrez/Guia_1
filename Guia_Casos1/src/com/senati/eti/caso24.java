package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Primer monto: ");
		float monto1 = sc.nextFloat();
		System.out. println("segundo monto: ");
		float monto2 = sc.nextFloat();
		System.out. println("Tercer monto: ");
		float monto3 = sc.nextFloat();
		
		float sumatoria=monto1+monto2+monto3;
		float op1=(monto1*20/100)+(monto2*20/100);
		float op2=(monto3+(monto3*60/100))/2;
		float op3=(sumatoria*8/100)-sumatoria;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Respuesta 1: "+ df.format(op1));
		System.out.println("Respuesta 2: "+ df.format(op2));
		System.out.println("Respuesta 3: "+ df.format(op3));
	}

}
