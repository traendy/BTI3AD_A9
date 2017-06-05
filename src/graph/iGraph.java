package graph;

import java.util.List;

import dykstra.DNode;

/**
 * Interface of an Graph
 *
 */
public interface iGraph {

	/**
	 * Adds an Node
	 * @param node
	 */
	public void addNode(Node<?> node);
	
	/**
	 * 
	 * @param edge
	 */
	public void addEdge(Edge edge);
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @param weight
	 */
	public void addEdge(Node<?> from, Node<?> to, int weight);

	/**
	 * 
	 * @param node
	 */
	public void removeNode(Node<?> node);

	/**
	 * 
	 * @param from
	 * @param to
	 */
	public void traverse(Node<?> from, Node<?> to);

	/**
	 * 
	 * @param node
	 * @return
	 */
	public List<DNode> getNeighbors(DNode node);

	/**
	 * 
	 * @param nodeA
	 * @param nodeB
	 * @return
	 */
	public int getWeight(Node<?> nodeA, Node<?> nodeB);
	
	/**
	 * 
	 */
	public List<Node<?>> getNodes();

  List<Node<?>> getNeighbors(Node<?> node);
}
