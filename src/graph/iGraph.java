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
	 * Adds an Edge 
	 * @param edge
	 */
	public void addEdge(Edge edge);
	
	/**
	 * Adds an Edge 
	 * @param from Node where the edge starts
	 * @param to   Node where the edge ends
	 * @param weight Weight of the Edge != -1 && 0
	 */
	public void addEdge(Node<?> from, Node<?> to, int weight);

	/**
	 * Removes a node in a Graph
	 * @param node node to remove
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
