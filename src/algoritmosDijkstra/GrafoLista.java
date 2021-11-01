package algoritmosDijkstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

//implementacion con cola de prioridad, el elemento de mayor prioridad
//se saca antes de la cola

public class GrafoLista extends Grafo {
	private List<PriorityQueue<Nodo>> grafo;
	private int[] precedores = null;
	// creo una cola de tipo Nodo, tiene id y peso

	public GrafoLista(int tamanio) {
		// armo un "" vector de vectores "" pero todo manejado con listas
		// recibe la cantidad de Nodos
		// queda una linked list que en cada nodo tiene una cola de prioridad
		// que son las aritas donde se conectan los nodos
		this.grafo = new LinkedList<PriorityQueue<Nodo>>();
		for (int i = 0; i < tamanio; i++) {
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

		double[] distancias = new double[getNodos()];
		this.precedores = new int[getNodos()]; // indica cuantos nodos hay?

		Set<Integer> vMenosS = new HashSet<Integer>();
		// cargo el vector V-S
		for (int i = 0; i < this.getNodos(); i++) {
			if (desde != i)
				vMenosS.add(i);
		}

		// inicializo el vector de distancias con todo en infinito (maximo valor del
		// tipo de dato)
		for (int i = 0; i < this.getNodos(); i++) {
			distancias[i] = Double.MAX_VALUE;
		}

		// el nodo de donde tomo la distancia tiene distancia 0 con el mismo
		distancias[desde] = 0;

		for (int i = 0; i < this.predecesores.length; i++) {
			this.predecesores[i] = desde; // no lo entiendo
		}

		// Primer paso: se carga en distancias todas las distancias a nodos directos
		// desde el nodo inicial

		for (Nodo nodo : this.grafo.get(desde)) {
			distancias[nodo.getId()] = nodo.getPeso(); // entiendo que recorre todos los nodos q salgan de Desde
			// en si busca todos los adyacentes al nodo que mande y coloca la distancia que
			// tienen hacia ese nodo
		}

		// hago un while hasta terminar con V-S (si termino es porque ya busque todo)

		while (!vMenosS.isEmpty()) {

			boolean bandera = false;
			double min = distancias[integer];
			int w = 0;

			for (Integer integer : vMenosS) {
				if (!bandera) {
					min = distancias[integer];
					w = integer;
				} else {
					if (distancias[integer] < min) {
						min = distancias[integer];
						w = integer;

					}
				}

			}
		}

	}
}
