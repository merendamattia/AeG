package com.utilityPackage;

import java.util.Scanner;

public class MCD {
	static int calcola(int a, int b) {
		if(b == 0)
			return a;
		if(a >= b)
			return calcola(a - b, b);
		else 
			return calcola(b - a, a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MCD ");

		System.out.print("Inserire primo numero: ");
		int a = sc.nextInt();
		System.out.print("Inserire secondo numero: ");
		int b = sc.nextInt();

		System.out.println(calcola(a, b));
	}
}
