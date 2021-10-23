package algoritmosDijkstra;

public class Nodo {
	private int id;
	private double peso;
	
	public Nodo(int id, double peso) {
		this.id = id;
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public int getId(){
		return this.id;
	}
	
}
