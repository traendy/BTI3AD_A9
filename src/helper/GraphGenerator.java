package helper;

import java.util.Random;

import graph.ListGraph;
import graph.MatrixGraph;

public class GraphGenerator {
	
	/**
	 * 
	 */
	
	/**
     * Soll eine Matrix erstellen, die an jeder position mit einem
     * zuf�lligen wert belegt wird. 
     * Dann wird an zuf�lligen stellen der Float MaxValue gesetzt.
     * Dies soll simmulieren, dass dort keine verbindung mgl ist
     * ggf durch -1 o� zu ersetzen, abh davon ob wir negative Gewichte zu lassen
     * @param Size anzahl der Knoten im Graph
     * @return Matrixdarstellung des Graphen
     */
    public static int[][] genMatrix(int Size){
      int[][] tempMatrix = new int[Size][Size];
      Random random = new Random();
      int tmp;
      for(int i =0; i<tempMatrix.length;i++){
        for(int j =0; j<tempMatrix.length;j++){
          tempMatrix[i][j]=10*random.nextInt();
        } 
      }
      /*
      int k = random.nextInt(Size/2);
      for(int i =0; i<=k;i++){
        int a = random.nextInt(Size);
        int b = random.nextInt(Size);
        tempMatrix[a][b]= Float.MAX_VALUE;
      }
      */
      return tempMatrix;
    }
	
	/**
	 * 
	 * @param N
	 *   Size of the Matrix
	 * @return
	 */
	public static MatrixGraph genRandomGraph(int[][] matrix){
		return null;
		
	}

	/**
	 * 
	 * @param source
	 * @return
	 */
	public static ListGraph genListGraph(int[][] matrix){
		return null;
	}
}
