package dykstra;

import java.util.ArrayList;
import java.util.Collections;
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
	public List<DNode> doTheDykstra(iGraph graph,DNode start, DNode goal) {
		ArrayList<DNode> shortestPath = new ArrayList<>();
		//1.Initialisiere alle Knoten
		initialAllNodes(start, graph);
		List<DNode> border = new ArrayList<>();
		//2. Bestimme den Rand border vom start
		border =  getRand(start, graph);
		//3. 
		while(border.size()>0){
		  DNode v = getMinimalCost(border);
		  v.mark(); // makiere v
		  border.remove(0);// entferne v aus R
		  for(DNode n: getNextRand(v, graph)){//update alle Knoten des Randes die nicht markiert sind
		    border.add(n);// f�gesie in R ein
		  }
		  
		}

	  
	  return getShortestPath(start, goal);
	}


/**
 * F�gt alle Knoten in eine Liste ein vom Start bis zum Ziel
 * @param start startKnoten
 * @param goal ziel Knoten
 * @return Liste aller Knoten vom Start zum Ziel
 */
  private List<DNode> getShortestPath(DNode start, DNode goal) {
    List<DNode> tempList= new ArrayList<>();
    DNode temp = goal;
   
    while(temp!=start){
      tempList.add(temp);
      temp= temp.pred;
    }
    Collections.reverse(tempList);
    return tempList;
  }



  private List<DNode>  getNextRand(DNode v, iGraph graph) {
    List<DNode> neigbors = graph.getNeighbors(v);
    for(DNode d: neigbors ){
      if(d.marked){
        neigbors.remove(d);
      }else{
        updateCost(d, v);
      }
    }
	  return neigbors;
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

	/**
	 * 1.Initialisiert alle Knoten des Graphen
	 * @param start
	 * @param graph
	 */
	private void initialAllNodes(Node<?> start, iGraph graph) {
		initStartNode(start);
		for(Node<?> node : graph.getNodes()){
		  if(!node.equals(start)){
		    initDefaultNOde(node);
		  }
		  
		}
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
	 * 2.Bestimmt den Rand der aus Knoten bestehen die adjazent zum
	 * 
	 * @param start
	 *            Knoten dessen Rand bestimmt werden soll
	 * @return Liste aller benachbarten Knoten
	 */
	private List<DNode> getRand(DNode start, iGraph graph) {
	  
		return graph.getNeighbors(start);
	}

	/**
	 * Gibt den Knoten mit minimalen Kosten aus einer Liste von Knoten zur�ck
	 * 
	 * @param list
	 *            Liste mit zu unterscheidenden Knoten
	 * @return Knoten mit geringstem Abstand
	 */
	private DNode getMinimalCost(List<DNode> list) {
	  Collections.sort(list);
	return list.get(0);
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
