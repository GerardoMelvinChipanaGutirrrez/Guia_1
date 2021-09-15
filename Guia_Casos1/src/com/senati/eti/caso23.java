package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Ingrese el nombre del producto: ");
		String nombre = sc.nextLine();
		
		System.out. println("Ingrese el precio: ");
		float nt1 = sc.nextFloat();
		System.out. println("Ingrese la cantidad: ");
		float nt2 = sc.nextFloat();
		
		float importe1=nt1*nt2;
		float igv=importe1*18/100;
		float descuento=importe1*3/100;
		float importe3=importe1-descuento+igv;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("El precio de: "+ nombre);
		System.out.println("es: S/"+ df.format(importe3));
	}

}
