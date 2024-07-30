/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrfelipelima.grafos;

/**
 *
 * @author mrfel
 */
public class AdjacencyMatrix {
    private static final int DOTS_QTD = 9;								//quantidade de vértices no grafo
	private char[] dots = new char[DOTS_QTD];							//array com os vértices do grafo

	public AdjacencyMatrix(){
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

	public int[][] buildAdjacencyMatrix(){
		int[][] adjacencyMatrix = new int[DOTS_QTD][DOTS_QTD];			//Matriz NxN
		this.initializeAdjacencyMatrix(adjacencyMatrix);

		adjacencyMatrix[0][1] = 1;  //AB
                adjacencyMatrix[0][2] = 1;  //AC
                adjacencyMatrix[0][3] = 1;  //AD
                adjacencyMatrix[0][4] = 1;  //AE
                
                adjacencyMatrix[1][0] = 1;  //BA
                adjacencyMatrix[1][5] = 1;  //BF
                
                adjacencyMatrix[2][0] = 1;  //CA
                
                adjacencyMatrix[3][0] = 1;  //DA
                adjacencyMatrix[3][6] = 1;  //DG
                
                adjacencyMatrix[4][0] = 1;  //EA
                
                adjacencyMatrix[5][1] = 1;  //FB
                adjacencyMatrix[5][7] = 1;  //FH
                
                adjacencyMatrix[6][3] = 1;  //GD
                adjacencyMatrix[6][8] = 1;  //GI
                
                adjacencyMatrix[7][5] = 1;  //HF
                
                adjacencyMatrix[8][6] = 1;  //IG

		return adjacencyMatrix;		
	}

	public void initializeAdjacencyMatrix(int[][] adjacencyMatrix){
		for(int i=0; i<adjacencyMatrix.length; i++){
			for(int j=0; j<adjacencyMatrix[i].length; j++){
				adjacencyMatrix[i][j] = 0;								//Inicialização da matriz
			}
		}
	}

	public void displayAdjacencyMatrix(int[][] adjacencyMatrix){
		for(int i=0; i<adjacencyMatrix.length; i++){					//itero as linhas
			for(int j=0; j<adjacencyMatrix[i].length; j++){				//itero as colunas
				if(adjacencyMatrix[i][j] != 0){							//quero imprimir somente as ligações
					System.out.println(dots[i] + "->" + dots[j]);		//Imprime as arestas
				}
			}
		}
	}
}
