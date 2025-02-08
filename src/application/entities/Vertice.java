package application.entities;

import java.util.ArrayList;

public class Vertice<TIPO> {
	private TIPO dado;
	private ArrayList<TIPO> arestaInput;
	private ArrayList<TIPO> arestaOutput;

	public Vertice(TIPO dado) {
		this.dado = dado;
	}

	public TIPO getDado() {
		return dado;
	}

	public void setDado(TIPO dado) {
		this.dado = dado;
	}
	
	public void addArestaInput(Aresta<TIPO> aresta) {
		this.arestaInput.add(aresta);
	}
	public void addArestaOutput(Aresta<TIPO> aresta) {
		this.arestaOutput.add(aresta);
	}	
	 
	

}
