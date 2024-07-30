/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mrfelipelima.grafos;

import java.util.List;

/**
 *
 * @author mrfel
 */
public class Grafos {

    public static void main(String[] args) {
        System.out.println("===== BUSCA EM LARGURA =====");
        Graph larGraph = new Graph();
        
        larGraph.addVertex('A');
        larGraph.addVertex('B');
        larGraph.addVertex('C');
        larGraph.addVertex('D');
        larGraph.addVertex('E');
        larGraph.addVertex('F');
        larGraph.addVertex('G');
        larGraph.addVertex('H');
        larGraph.addVertex('I');

        larGraph.addEdge(0,1);						//AB
        larGraph.addEdge(0,2);						//AC
        larGraph.addEdge(0,3);						//AD
        larGraph.addEdge(0,4);						//AE

        larGraph.addEdge(1,5);						//BF

        larGraph.addEdge(5,7);						//FH

        larGraph.addEdge(3,6);						//DG

        larGraph.addEdge(6,8);						//GI

        larGraph.breadthFirstSearch();
        
        System.out.println("\n===== BUSCA EM PROFUNDIDADE =====");
        larGraph.depthFirstSearch();
        
        System.out.println("\n===== MATRIZ DE ADJACENCIA =====");
        AdjacencyMatrix adjMatrix = new AdjacencyMatrix();
        int[][] adjacencyMatrix = adjMatrix.buildAdjacencyMatrix();
        adjMatrix.displayAdjacencyMatrix(adjacencyMatrix);
        
        System.out.println("\n===== LISTA DE ADJACENCIA =====");
        AdjacencyList adjList = new AdjacencyList();
        List<List<Character>> adjacencyList = adjList.buildAdjacencyList();
        adjList.displayAdjacencyList(adjacencyList);
    }
}
