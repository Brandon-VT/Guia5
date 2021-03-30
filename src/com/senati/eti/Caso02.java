package com.senati.eti;

import java.util.Scanner;

import com.senati.eti.model.Calculadora2;

public class Caso02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		float n1 = sc.nextFloat();
		System.out.print("Número 2: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 cal = new Calculadora2(n1, n2);
		
		System.out.println("\nNÚMEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Primer número: " + cal.getNumero1());
		System.out.println("Segundo número: " + cal.getNumero2());
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		
		System.out.println("1. Suma...................: " + cal.Operar(1));
        System.out.println("2. Resta..................: " + cal.Operar(2));
        System.out.println("3. Producto...............: " + cal.Operar(3));
        System.out.println("4. División...............: " + cal.Operar(4));
        System.out.println("5. Resto..................: " + cal.Operar(5));

	}

}
