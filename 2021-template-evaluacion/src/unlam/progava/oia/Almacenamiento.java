package unlam.progava.oia;

import java.util.ArrayList;

public class Almacenamiento {
	
	private ArrayList<Integer> memoriaApps;
	private int espacioNecesario;
	private int cantAplicacionesABorrar;
 
	
	public Almacenamiento() {
		memoriaApps = new ArrayList<Integer>();
		cantAplicacionesABorrar = 0;
	}
	
	public void agregar(int valor) {
		memoriaApps.add(valor);
	}
	
	public void setEspacio(int espacioNecesario) {
		this.espacioNecesario = espacioNecesario;
	}
	public ArrayList<Integer> getList() {
		return this.memoriaApps;
	}
	
	public void calcularAplicaciones() {
		
		int cantMin = memoriaApps.size();
		int memoriaAcumulada = 0;
		for(int i = 0; i < memoriaApps.size(); i++) {
			
			for(int j = 0; (j < cantMin && (j+i) < memoriaApps.size()); j++) {
				
				memoriaAcumulada += memoriaApps.get(j+i);
				if(memoriaAcumulada >= espacioNecesario)
					cantMin = j+1;
			}
			
			memoriaAcumulada = 0;
		}
		
		cantAplicacionesABorrar = cantMin;
	}

	public int getCantAplicacionesABorrar() {
		return cantAplicacionesABorrar;
	}
	
}
