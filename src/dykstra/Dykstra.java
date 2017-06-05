package dykstra;

import java.util.ArrayList;
import java.util.List;

import graph.Node;
import graph.iGraph;

public class Dykstra {
	private iGraph workingGraph;
	private Node<?> goal;
	private ArrayList<DNode> shortesPathsToGoal;

	/**
	 * TODO oder doch besser mit konstruktor?s
	 * 
	 * @param Graph
	 * @return
	 */
	public Node<?> doTheDykstra(iGraph graph, Node<?> goal) {
		this.workingGraph = graph;
		this.goal = goal;
		initialAllNodes();
		ArrayList<DNode> nodes = new ArrayList<DNode>();

		ArrayList<DNode> rand = new ArrayList<DNode>();
		// rand= getRand(start);

		// ggf muss dass f�r die rekursion ausgelagert wernden
		// reread Seite 85 3. erg�nze Rand R bei v
		for (int i = 0; rand.size() > 0; i++) {
			// DNode<?> temp = getMinimalCost(rand);
			// rand.remove(temp);
			// temp.mark();

		}
		return null;
	}

	/**
	 * Retruns the shortest (cheapest) way from start to goal
	 * 
	 * @param graph
	 * @param goal
	 * @param start
	 * @return lowes Cost.
	 */
	public int getMinimalCost(iGraph graph, Node<?> goal, Node<?> start) {

		return -1;
	}

	public List<DNode> getShortestPathDNode(
			iGraph graph, Node<?> goal, Node<?> start) {
		if (!(this.goal.equals(goal))){
			// do the dykstra
		}
		ArrayList<DNode> shortestPath = new ArrayList<DNode>();
		return shortestPath;
	}

	/** 
	 * 
	 */
	public List<Node<?>> getShortestPathNode(
			iGraph graph, Node<?> goal, Node<?> start) {
		if (!(this.goal.equals(goal))){
			// do the dykstra
		}
		ArrayList<Node<?>> shortestPath = new ArrayList<Node<?>>();
		return shortestPath;
	}

	private void initialAllNodes() {
		// initStartNode(start);
		// for each
		// initDefaultNOde(def);
		//
	}

	/**
	 * Initialisiert den StartKnoten
	 * 
	 * @param start
	 *            StartKnoten
	 */
	private DNode initStartNode(Node<?> start) {
		DNode d = new DNode(start);
		d.pred = d;
		d.cost = 0;
		d.mark();
		return d;
	}

	/**
	 * Initialisiert Standardknoten
	 * 
	 * @param def
	 *            nicht startKnoten
	 */
	private DNode initDefaultNOde(Node<?> def) {
		DNode d = new DNode(def);
		return d;

	}

	/**
	 * Bestimmt den Rand der aus Knoten bestehen die adjazent zum
	 * 
	 * @param start
	 *            sind
	 * @param start
	 *            Knoten dessen Rand bestimmt werden soll
	 * @return Liste aller benachbarten Knoten
	 */
	private List<DNode> getRand(Node start) {

		return null;
	}

	/**
	 * Gibt den Knoten mit minimalen Kosten aus einer Liste von Knoten zur�ck
	 * 
	 * @param list
	 *            Liste mit zu unterscheidenden Knoten
	 * @return Knoten mit geringstem Abstand
	 */
	private Node getMinimalCost(List<Node> list) {
		return null;
	}

	/**
	 * Findet alle Nachbarn zu einem Knoten center
	 * 
	 * @param center
	 *            Knoten dessen Nachbarn gesucht sind
	 * @return Liste aller Nachbarknoten
	 */
	private List<Node> getAllNeighbors(Node center) {
		return null;
	}

	/**
	 * setzt die Kosten eines Knotens um ihn zu erreichen
	 * 
	 * @param node
	 *            knoten der neue kosten bekommen soll
	 */
	private void updateCost(DNode nodeK, DNode nodeV) {
		int cost = nodeV.cost + workingGraph.getWeight(nodeK.node, nodeV.node);
		if (nodeK.cost > cost) {
			nodeK.cost = cost;
			nodeK.pred = nodeV;
		}
		// TODO nimm k in R mit auf
	}

}
