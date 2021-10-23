package algoritmosDijkstra;

public abstract class Grafo {
	
	public abstract int getNodos();
	public abstract void setArista(int desde, int hasta, double peso);
	public abstract double getArista(int desde, int hasta);
	public abstract double [] dijkstra(int desde);
}
