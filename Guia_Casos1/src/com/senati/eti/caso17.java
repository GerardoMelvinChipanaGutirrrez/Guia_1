package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out. println("Número de aprobados: ");
		int aprovados = sc.nextInt();
		
		System.out. println("Número de desaprovados: ");
		int desaprobados = sc.nextInt();
		
		System.out. println("Número de retirados: ");
		int retirados = sc.nextInt();
		
		float val=aprovados+desaprobados+retirados;
		float ap=aprovados*100/val;
		float ds=desaprobados*100/val;
		float rt=retirados*100/val;
		
		System.out.println("-----------");
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Aprovados...: "+ df.format(ap)+"%");
		System.out.println("Desaprobados: "+ df.format(ds)+"%");
		System.out.println("Retirados...: "+ df.format(rt)+"%");
	}

}
