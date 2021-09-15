package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Ingrese las horas trabajadas: ");
		int horas = sc.nextInt();
		
		System.out. println("Tarifa: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = sueldo * 5/100;
		float total = sueldo + bono;
		float dolares = total * 3.24f;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Sueldo..........: "+ df.format(sueldo));
		System.out.println("Bono............: "+ df.format(bono));
		System.out.println("Total...........: "+ df.format(total));
		System.out.println("Total de dólares: "+ df.format(dolares));
	}

}
