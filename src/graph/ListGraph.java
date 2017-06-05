package graph;

import java.util.ArrayList;
import java.util.List;

import dykstra.DNode;

public class ListGraph implements iGraph {
   public List <ArrayList<Node<?>>> graphList;
   public int anzNodes =0;
  
	@Override
	public void addNode(Node<?> node) {
	  graphList.add(new ArrayList<Node<?>>());
	  anzNodes++;
	}

	@Override
	public void addEdge(Edge edge) {
		addEdge(edge.from, edge.to, edge.weight);

	}

	@Override
	public void addEdge(Node<?> from, Node<?> to, int weight) {
	  graphList.get(from.id).add(to);
	  graphList.get(to.id).add(from);
	  //TODO handle weight
    

	}

	@Override
	public void removeNode(Node<?> node) {
		graphList.remove(node.id);
		for(int i =0; i<graphList.size();i++){
		  for(Node<?> n: graphList.get(i)){
		    if(n.equals(node)){
		      graphList.get(i).remove(n);
		    }
		  }
		}
		anzNodes--;
	}

	@Override
	public void traverse(Node<?> from, Node<?> to) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Node<?>> getNeighbors(Node<?> node) {
	
		return graphList.get(node.id);
	}

	@Override
	public int getWeight(Node<?> nodeA, Node<?> nodeB) {
		// TODO 
		return 0;
	}

	@Override
	public List<Node<?>> getNodes() {
		// TODO
	  return null;
	}

  @Override
  public List<DNode> getNeighbors(DNode node) {
    // TODO Auto-generated method stub
    return null;
  }

}
