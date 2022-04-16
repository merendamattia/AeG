package com.utilityPackage;

import java.util.Scanner;

public class mcm {
	static int mcm(int a, int b) {
		return (a * b) / MCD.calcola(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("mcm ");

		System.out.print("Inserire primo numero: ");
		int a = sc.nextInt();
		System.out.print("Inserire secondo numero: ");
		int b = sc.nextInt();

		System.out.println(mcm(a, b));
	}
}
