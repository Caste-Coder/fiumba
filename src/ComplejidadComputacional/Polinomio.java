package ComplejidadComputacional;

import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
	int caste;
	int yamil;
	int caste2;
	int yamil2;
	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
	// la posicion n contiene al termino independiente.

	public Polinomio(double [] coeficientes){
		this.coeficientes = coeficientes;
		this.grado = coeficientes.length -1;
	}

	@Override
	public String toString() {
		String cad = new String("Polinomio grado=" + grado + ", P(x)= ");
		for(int i = 0; i<grado; i++) {
			cad += coeficientes[i] + "x^" + (grado- i) + " + ";
		}
		cad += coeficientes[grado];
		return cad;
	}
	
	double evaluarMSucesivas(double x){
		double suma = 0;
		for(int i = 0; i<=grado; i++) {
			suma += Math.pow(x, i) * coeficientes[grado - i];
		}
		return suma;
	
	}
	public void mostrar() {
<<<<<<< HEAD
		System.out.println("Hola soy julian");
		System.out.println("Hola soy julian");
=======

>>>>>>> c12f1b861d9aa700e1b22d3501083dbd3a0d7edf
	}
	
//	double evaluarRecursiva(double x){}
//
//	double evaluarRecursivaPar(double x){...}
//
//	double evaluarProgDinamica(double x){...}
//
//	double evaluarMejorada(double x){...}
//
//	double evaluarPow(double x){...}
//
//	double evaluarHorner(double x){...}
}
