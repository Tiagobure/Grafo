package application.entities;

import java.util.ArrayList;

public class Grafo<TIPO> {
	private ArrayList<Vertice<TIPO>> vertices;
	private ArrayList<Aresta<TIPO>> arestas;

	public Grafo() {
		this.vertices = new ArrayList<Vertice<TIPO>>();
		this.arestas = new ArrayList<Aresta<TIPO>>();
	}

	public void addVertices(TIPO dado) {
		Vertice<TIPO> newVertice = new Vertice<TIPO>(dado);
		this.vertices.add(newVertice);
	}

	public void addAresta(Double weight, TIPO dadoStart, TIPO dadoEnd) {
		Vertice<TIPO> start = this.getVertice(dadoStart);
		Vertice<TIPO> end = this.getVertice(dadoEnd);
		Aresta<TIPO> aresta = new Aresta<TIPO>(weight, start, end);
		start.addArestaOutput(aresta);
		end.addArestaInput(aresta);
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

	public void breadthFirstSearch() {
		ArrayList<Vertice<TIPO>> marked = new ArrayList<Vertice<TIPO>>();
		ArrayList<Vertice<TIPO>> queue = new ArrayList<Vertice<TIPO>>();
		Vertice<TIPO> current = this.vertices.get(0);
		marked.add(current);
		System.out.println(current.getDado());
		queue.add(current);
		while (queue.size() > 0) {
			Vertice<TIPO> visited = queue.get(0);
			for (int i = 0; i < visited.getArestaOutput().size(); i++) {
				Vertice<TIPO> next = visited.getArestaOutput().get(i).getEnd();
				if (!marked.contains(next)) {
					marked.add(next);
					System.out.println(next.getDado());
					queue.add(next);
				}
			}
			queue.remove(0);
		}

	}

}
