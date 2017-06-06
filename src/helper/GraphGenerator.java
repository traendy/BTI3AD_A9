package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import graph.Node;
import graph.NodeEdgeList;

public class GraphGenerator {
	
	/**
	 * 
	 */
	
	/**
     * Generate a Matrix for an non Directional Graph. 
     * ggf durch -1 o� zu ersetzen, abh davon ob wir negative Gewichte zu lassen
     * @param Size anzahl der Knoten im Graph
     * @return Matrixdarstellung des Graphen
     */
    public static int[][] genNonDirectionMatrix(int Size){
      int[][] tempMatrix = new int[Size][Size];
      Random random = new Random();
      int tmp;
      for(int   i=0; i < Size ;i++){
        for(int j=i; j < Size ;j++){
          if (i == j ) {
        	  tempMatrix[i][j] = 0;
          }
          else {
        	  tmp=random.nextInt(100);//also 33% der f�lle keine Kante?
        	  if (tmp%3 == 0){
        		  tempMatrix[i][j] = -1;
        		  tempMatrix[j][i] = -1;
        	  } else {
        		  tempMatrix[i][j] = tmp;
        		  tempMatrix[j][i] = tmp;
        	  }
          }
        } 
      }
      return tempMatrix;
    }
    
    /**
     * Generates a ListGraph with the Matrixrepresentation and a list of all Nodes of a Graph
     * @param matrix Matrix representation of a Graph
     * @param nodes List of all Nodes in a Graph
     * @return listGraph representation of a Graph
     */
    public static List<NodeEdgeList> genListGraph(int[][] matrix, List<Node<?>> nodes){
      List<NodeEdgeList> list = new ArrayList<>();
      for(int i =0; i<matrix.length; i++){
        Node<?> temp = nodes.get(i);
        HashMap<Node<?>, Integer> tempNeighbors = new HashMap<>();
        for(int j =0; j<matrix.length; j++){
          if(i!=j && matrix[i][j]>0){
              tempNeighbors.put(nodes.get(j), matrix[i][j]);
          }
        }
        list.add(new NodeEdgeList(temp, tempNeighbors));
      }
      
      
      return list;
    }
}
