package application;

import application.entities.Grafo;

public class Main {

	public static void main(String[] args) {

		Grafo<String> grafo = new Grafo<String>();
		
		grafo.addVertices("Joao");
		grafo.addVertices("Lorenzo");
		grafo.addVertices("Creuza");
		grafo.addVertices("Creber");
		grafo.addVertices("Craudio");
	
		grafo.addAresta(2.0, "Joao","Lorenzo");		
		grafo.addAresta(3.0, "Lorenzo","Creber");
		grafo.addAresta(1.0, "Creber","Creuza");
		grafo.addAresta(1.0, "Creuza","Craudio");
		grafo.addAresta(2.0, "Craudio","Lorenzo");
		grafo.addAresta(3.0, "Craudio","Joao");

		grafo.breadthFirstSearch();


	
	
	}

}
