package org.cuatrovientos.ip;

import java.util.Random;

/**
 * Aplicación que genera direcciones IP
 * @author Julen
 *
 */
public class GeneradorIp {
	/**
	 * Función para devolver un numero aleatorio entre el minimo y maximo
	 * @param min
	 * @param max
	 * @return valor resultado
	 */
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
		max = max + 1;
		return rnd.nextInt(max -min)+ min;
	}
	
	/**
	 * Función para devolver una direccion IP utilizando la funcion generarNumero
	 * @return valor resultado
	 */
	public String generarIp() {
		
		String direccion = "";
		
		for (int i=0; i<4;i++) {
			if (i == 3) {
				direccion = direccion + generarNumero(0, 254) ;
			}	
			else {	
			direccion = direccion + generarNumero(0, 254) + ".";
			}
		}
		
		return direccion;
	}
	
}
