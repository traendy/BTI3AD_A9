package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dykstra.DNode;

public class MatrixGraph implements iGraph {
  
  public Map<Integer, Node<?>> matrixMap;
  public int matrix [][];
  public int anzNodes=0;
  
  

	public MatrixGraph(Map<Integer, Node<?>>matrixMap) {
    super();
    this.matrixMap = matrixMap;
    this.anzNodes = matrixMap.size();
    this.matrix = new int[anzNodes][anzNodes];
  }

  @Override
	public void addNode(Node<?> node) {
		anzNodes++;
		matrixMap.put(anzNodes, node);

	}

	@Override
	public void addEdge(Edge edge) {
		addEdge(edge.from, edge.to, edge.weight);

	}

	@Override
	public void addEdge(Node<?> from, Node<?> to, int weight) {
		matrix[from.id][to.id] = weight;

	}

	
	/**
	 * TODO Was ist mit den Edges
	 */
	@Override
	public void removeNode(Node<?> node) {
		matrixMap.remove(node);
		anzNodes--;

	}

	@Override
	public void traverse(Node<?> from, Node<?> to) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Node<?>> getNeighbors(Node<?> node) {
	  List<Node<?>> temp = new ArrayList<>();
	  for(int i =0;i<anzNodes; i++){
	    if(matrix[node.id][i]!=-1){ //TODO -1 == unendlich?
	    temp.add(matrixMap.get(matrix[node.id][i]));
	    }
	  }
		return temp;
	}

	@Override
	public int getWeight(Node<?> nodeA, Node<?> nodeB) {		
		return matrix[nodeA.id][nodeB.id];
	}

	@Override
	public List<Node<?>> getNodes() {
	  List<Node<?>> temp = new ArrayList<>();
	  for(int i=0; i<anzNodes; i++){
	    temp.add(matrixMap.get(i));
	  }
		return temp;
	}

  @Override
  public List<DNode> getNeighbors(DNode node) {
    // TODO Auto-generated method stub
    return null;
  }

}
