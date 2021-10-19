package ComplejidadComputacional;

public class PolinomioApp {

	public static void main(String[] args) {
		Polinomio p1 = new Polinomio(new double[] {4, 3, 2, 8, 5 , 6, 4, 3, 2, 8, 5 , 6, 50 , 58});
		System.out.println(p1);
//		System.out.println("P(2.5)= " + p1.evaluarMSucesivas(2.5)); //34.5

		//System.out.println("P(2.5)= " + p1.evaluarMSucesivas(5)); //34.5
		System.out.println("P(2.5)= " + p1.evaluarHorner(10)); //34.5
		System.out.println("P(2.5)= " + p1.evaluarProgDinamica(10)); //34.5
	}
}
