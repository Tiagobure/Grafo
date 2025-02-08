package application;

import application.entities.Grafo;

public class Main {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<String>();
		
		grafo.addVertices("João");
		grafo.addVertices("Lorenzo");
		grafo.addVertices("Creusa");
		grafo.addVertices("Claudio");
		grafo.addVertices("Renato");
	
		grafo.addAresta(2.0, "João","Lorenzo");		
		grafo.addAresta(3.0, "Lorenzo","Claudio");
		grafo.addAresta(1.0, "claudio","Creusa");
		grafo.addAresta(1.0, "João","Creusa");
		grafo.addAresta(2.0, "Renato","Lorenzo");
		grafo.addAresta(4.0, "Creusa","Renato");



	
	
	}

}
