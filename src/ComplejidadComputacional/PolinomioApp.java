package ComplejidadComputacional;

public class PolinomioApp {

	public static void main(String[] args) {
		Polinomio p1 = new Polinomio(new double[] {3, 2, 1});
		System.out.println(p1);
//		System.out.println("P(2.5)= " + p1.evaluarMSucesivas(2.5)); //34.5
		System.out.println("P(2.5)= " + p1.evaluarMSucesivas(1)); //34.5
		System.out.println("P(2.5)= " + p1.evaluarHorner(1)); //34.5
	}
}
