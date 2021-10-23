package algoritmosDijkstra;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

//implementacion con cola de prioridad, el elemento de mayor prioridad
//se saca antes de la cola

public class GrafoLista extends Grafo {
	private List<PriorityQueue<Nodo>> grafo;
	//creo una cola de tipo Nodo, tiene id y peso
	
	public GrafoLista(int tamanio) {
		//armo un "" vector de vectores ""  pero todo manejado con listas
		//recibe la cantidad de Nodos
		//queda una linked list que en cada nodo tiene una cola de prioridad
		//que son las aritas donde se conectan los nodos
		this.grafo = new LinkedList<PriorityQueue<Nodo>>();
		for(int i = 0; i < tamanio; i++) {
			this.grafo.add(new PriorityQueue<Nodo>());
		}
	}
	

	@Override
	public int getNodos() {
		return this.grafo.size();
	}

	@Override
	public void setArista(int desde, int hasta, double peso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArista(int desde, int hasta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double[] dijkstra(int desde) {
		//getNodos: numero de nodos en la lista
		
		double[] distancias = new double[getNodos()]; //distancia de cada nodo
		return null;
	}
}
