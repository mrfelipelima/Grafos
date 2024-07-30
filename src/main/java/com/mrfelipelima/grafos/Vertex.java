package com.mrfelipelima.grafos;
/*
 * Classe do vértice ou Nó (node)
 */

public class Vertex {
	private char label;			// Atributo de classe: rótulo do vértice
	private boolean wasVisited; // Atributo de classe: informa se o vértice foi visitado

	/*
	 * Método construtor do vértice que recebe um Caractere como parâmetro
	 */
	public Vertex(char label){
		this.label = label;
	}

	/*
	 * Método que retorna o rótulo vértice
	 */
	public char getLabel(){
		return this.label;
	}

	/*
	 * Método que seta/altera o rótulo do vértice
	 */
	public void setLabel(char label){
		this.label = label;
	}

	/*
	 * Método que obtém a informação se o vértice foi visitado
	 */
	public boolean getWasVisited(){
		return this.wasVisited;
	}

	/*
	 * Método que seta/altera a informação se o vértice foi visitado
	 */
	public void setWasVisited(boolean wasVisited){
		this.wasVisited = wasVisited;
	}
}