package com.cursos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2 {
	public void Ejecutar() {
		BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
		int n = (int) (Math.random() * 100) + 1;
		System.out.println("Adivina que número he pensado:");
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Dame un número entre el 1 y 100 (" + n + ") [Intento " + i + "]: ");
				String cad = con.readLine().toLowerCase();
				int n2 = Integer.parseInt(cad);
				if (n2 == n) {
					System.out.println("Acertaste :)");
					return;
				}
				System.out.println(n2 < n ? "No llegas" : "Te pasas");
			} catch (Exception e) {
				System.out.println("No es un número válido.");
			}
		}
		System.out.println("\nOoooh! No has podido. :(\n\n");
	}

}
