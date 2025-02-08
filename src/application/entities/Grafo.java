package application.entities;

import java.util.ArrayList;

public class Grafo<TIPO> {
	private ArrayList<Vertice<TIPO>> vertices;
	private ArrayList<Aresta<TIPO>> arestas;

	public Grafo() {
		super();
		this.vertices = new ArrayList<Vertice<TIPO>>();
		this.arestas = new ArrayList<Aresta<TIPO>>();
	}

	public void addVertices(TIPO dado) {
		Vertice<TIPO> newVertice = new Vertice<TIPO>(dado);
		this.vertices.add(newVertice);
	}

	public void addAresta(Double weight, TIPO start, TIPO end) {
		Vertice<TIPO> rStart = this.getVertice(start);
		Vertice<TIPO> theEnd = this.getVertice(end);
		Aresta<TIPO> aresta = new Aresta<TIPO>(weight, start, end);
		rStart.addArestaOutput(aresta);
		theEnd.addArestaInput(aresta);
		this.arestas.add(aresta);
	}

	public Vertice<TIPO> getVertice(TIPO dado) {
		Vertice<TIPO> vertice = null;
		for (int i = 0; i < this.vertices.size(); i++) {
			if (this.vertices.get(i).getDado().equals(dado)) {
				vertice = this.vertices.get(i);
				break;
			}
		}
		return vertice;
	}

}
