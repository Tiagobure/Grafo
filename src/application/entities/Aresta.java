package application.entities;

public class Aresta<TIPO> {
	private Double weight;
	private Vertice<TIPO> start;
	private Vertice<TIPO> end;
	
	
	
	
	public Aresta(Double weight, TIPO start, TIPO end) {
		this.weight = weight;
		this.start = (Vertice<TIPO>) start;
		this.end = (Vertice<TIPO>) end;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Vertice<TIPO> getStart() {
		return start;
	}
	public void setStart(Vertice<TIPO> start) {
		this.start = start;
	}
	public Vertice<TIPO> getEnd() {
		return end;
	}
	public void setEnd(Vertice<TIPO> end) {
		this.end = end;
	}
	
	
	
	
	
}
