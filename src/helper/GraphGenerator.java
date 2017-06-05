package helper;

import java.util.Random;

import graph.ListGraph;
import graph.MatrixGraph;

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
        	  tmp=random.nextInt(100);
        	  if (tmp == 0){
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
}
