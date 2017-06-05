package dykstra;

import graph.Node;

public class DNode{
	public static final int UNCOST = -1;
	
	public Node<?> node;
	public DNode pred;
	public int cost;
	public boolean marked;
	
	

	public DNode(Node<?> node) {
		this.node = node;
		pred = null;
		cost = UNCOST;
		marked = false;
	}
	
	public void mark(){
		marked = true;
	}
}
