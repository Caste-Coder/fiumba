package ComplejidadComputacional;

import java.math.BigDecimal;
import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double[] coeficientes;

	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
	// la posicion n contiene al termino independiente.

	public Polinomio(double[] coeficientes) {
		this.coeficientes = coeficientes;
		this.grado = coeficientes.length - 1;
	}

	@Override
	public String toString() {
		String cad = new String("Polinomio grado=" + grado + ", P(x)= ");
		for (int i = 0; i < grado; i++) {
			cad += coeficientes[i] + "x^" + (grado - i) + " + ";
		}
		cad += coeficientes[grado];
		return cad;
	}

	double evaluarMSucesivas(double x) {
		double suma = 0, resPow;
		
		for(int i = 0; i<=grado; i++) {
			resPow = x;
			for(int j = 0; j < grado - i; j++) {
				resPow *= resPow;
			}
			suma += resPow * coeficientes[i];
		}
		return suma;
	}

	double evaluarRecursiva(double x){
		
		return evaluarRecursiva(x);
	}

//	double evaluarRecursivaPar(double x){...}
//
	double evaluarProgDinamica(double x){
		long tiempoInicio = System. nanoTime();
		double multiplicacionSucesivas = 1;
		double suma = 0;
		for(int i = grado; i >= 0; i--) {			
			suma += multiplicacionSucesivas * coeficientes[i];
			multiplicacionSucesivas *= x;
		}
		long Tiempofin = System. nanoTime();
		System.out.println("Tiempo Programacion dinamica:" + (Tiempofin-tiempoInicio));
		return suma;
}

//
//	double evaluarMejorada(double x){...}
//
	double evaluarPow(double x){
		double suma = 0;
		for(int i = 0; i<=grado; i++) {
			suma += Math.pow(x, i) * coeficientes[grado - i];
		}

		return suma;
	}

	double evaluarHorner(double x) {

		double suma = 0;
		long tiempoInicio = System. nanoTime();
		for (int i = 0; i <= grado; i++) {
			suma = suma * x + coeficientes[i];
		}
		long Tiempofin = System. nanoTime();
		System.out.println("Tiempo Horner:" + (Tiempofin-tiempoInicio));
		return suma;
		
	}
}
