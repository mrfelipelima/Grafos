/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfelipelima.grafos;

/**
 *
 * @author mrfel
 */

import java.util.List;
import java.util.LinkedList;

public class AdjacencyList {
    private static final int DOTS_QTD = 9;								//quantidade de vértices no grafo
	private char[] dots = new char[DOTS_QTD];							//array com os vértices do grafo

	AdjacencyList(){
		dots[0] = 'A';
		dots[1] = 'B';
		dots[2] = 'C';
		dots[3] = 'D';
		dots[4] = 'E';
		dots[5] = 'F';
		dots[6] = 'G';
		dots[7] = 'H';
		dots[8] = 'I';
	}

	/**
	* Constrói a lista de adjacências.
	*/
	public List<List<Character>> buildAdjacencyList(){
		List<List<Character>> adjacencyList = new LinkedList<>();

		List<Character> adjacencyToA = new LinkedList<>();  //lista encadeada
		adjacencyToA.add('B');  //AB
		adjacencyToA.add('C');  //AC
		adjacencyToA.add('D');  //AD
		adjacencyToA.add('E');  //AE

		List<Character> adjacencyToB = new LinkedList<>();  //lista encadeada
		adjacencyToB.add('A');  //BA
		adjacencyToB.add('F');  //BF
                
                List<Character> adjacencyToF = new LinkedList<>();
                adjacencyToF.add('B'); //FB
                adjacencyToF.add('H'); //FH
                
                List<Character> adjacencyToH = new LinkedList<>();
                adjacencyToH.add('F'); //HF

		List<Character> adjacencyToC = new LinkedList<>();				//lista encadeada
		adjacencyToC.add('A');  //CA

		List<Character> adjacencyToD = new LinkedList<>();				//lista encadeada
		adjacencyToD.add('A');  //DA
		adjacencyToD.add('G');  //DG
                
                List<Character> adjacencyToG = new LinkedList<>();
                adjacencyToG.add('D'); //GD
                adjacencyToG.add('I'); //GI
                
                List<Character> adjacencyToI = new LinkedList<>();
                adjacencyToI.add('G'); //IG
                
                List<Character> adjacencyToE = new LinkedList<>();
                adjacencyToE.add('A'); //EA

		adjacencyList.add(adjacencyToA);								//Adiciona todas as adjacências em um lista encadeada só.
		adjacencyList.add(adjacencyToB);
		adjacencyList.add(adjacencyToC);
		adjacencyList.add(adjacencyToD);
		adjacencyList.add(adjacencyToE);
		adjacencyList.add(adjacencyToF);
		adjacencyList.add(adjacencyToG);
		adjacencyList.add(adjacencyToH);
		adjacencyList.add(adjacencyToI);

		return adjacencyList;
	}

	/**
	* Imprime todas as adjacências.
	*/
	public void displayAdjacencyList(List<List<Character>> adjacencyList){
		for(int i=0; i<adjacencyList.size(); i++){
			System.out.println(dots[i] + "->" + adjacencyList.get(i));		//Imprime as arestas
		}
	}
}
