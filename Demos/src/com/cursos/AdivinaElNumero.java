package com.cursos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdivinaElNumero {
	public final byte MAX_INTENTOS = 10;
	public final byte NUMERO_INICIAL = 1;
	public final byte NUMERO_FINAL = 100;

	public void jugar() {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int objetivo = (int) (Math.random() * NUMERO_FINAL) + NUMERO_INICIAL;
		System.out.println("Adivina que número he pensado:");
		for (int intento = 1; intento <= MAX_INTENTOS; intento++) {
			try {
				System.out.println("Dame un número entre el " + NUMERO_INICIAL + " y " + NUMERO_FINAL + " (" + objetivo
						+ ") [Intento " + intento + "]: ");
				String leido = teclado.readLine().toLowerCase();
				int numero = Integer.parseInt(leido);
				String resultado = validaJugada(objetivo, numero);
				System.out.println(resultado);				
				if(resultado.startsWith("Acertaste")) 
					return;
			} catch (Exception e) {
				System.out.println("No es un número válido.");
			}
		}
		System.out.println("\nOoooh! No has podido. :(\n\n");
	}

	String validaJugada(int objetivo, int numero) {
		if (numero == objetivo) {
			return "Acertaste :)";
		}
		return numero < objetivo ? "No llegas" : "Te pasas";
	}
	
	

}
