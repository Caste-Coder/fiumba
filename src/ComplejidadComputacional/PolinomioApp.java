package ComplejidadComputacional;

public class PolinomioApp {

	public static void main(String[] args) {
		int x = 1; 
		Polinomio p1 = new Polinomio(new double[] {4, 3, 2, 8, 5 , 6, 4, 3, 2, 8, 5 , 6, 50 , 58, 4, 3, 2, 8, 5 , 6, 4, 3, 2, 8, 5 , 6, 50 , 58});
		System.out.println(p1);
		System.out.println("P("+x+")= " + p1.evaluarMSucesivas(x)); //
		System.out.println("P("+x+")= " + p1.evaluarProgDinamica(x)); //
		System.out.println("P("+x+")= " + p1.evaluarHorner(x));
		System.out.println("P("+x+")= " + p1.evaluarRecursivaPar(x)); 
		System.out.println("P("+x+")= " + p1.evaluarRecursiva(x)); 
	}
}
