package application.entities;

import java.util.ArrayList;

public class Vertice<TIPO> {
	private TIPO dado;
	
	private ArrayList<Aresta<TIPO>> arestaInput;
	private ArrayList<Aresta<TIPO>> arestaOutput;

	public Vertice(TIPO dado) {
		this.dado = dado;
		this.arestaInput = new ArrayList<Aresta<TIPO>>();
		this.arestaOutput = new ArrayList<Aresta<TIPO>>();

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

	public ArrayList<Aresta<TIPO>> getArestaInput() {
		return arestaInput;
	}

	public void setArestaInput(ArrayList<Aresta<TIPO>> arestaInput) {
		this.arestaInput = arestaInput;
	}

	public ArrayList<Aresta<TIPO>> getArestaOutput() {
		return arestaOutput;
	}

	public void setArestaOutput(ArrayList<Aresta<TIPO>> arestaOutput) {
		this.arestaOutput = arestaOutput;
	}	
	 
	

}
