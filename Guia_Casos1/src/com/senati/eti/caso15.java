package com.senati.eti;

import java.util.Scanner;//para escanear
import java.text.DecimalFormat;//para decimales

public class caso15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		//#cualquien digito numero
		//definir variable de los comandos
		System.out. println("Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out. println("Precio: ");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = importe1 / 4.05f;
		float importe3 = importe1 / 4.55f;
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Importe en soles.....: "+ df.format(importe1));
		System.out.println("Importe en d�lares.....: "+ df.format(importe2));
		System.out.println("Importe en euros.....: "+ df.format(importe3));
	}

}
