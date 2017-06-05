package dykstra;

import graph.Node;

public class DNode extends Node implements Comparable<DNode>{
	public static final int UNCOST = -1;
	
	public Node<?> node;
	public DNode pred;
	public int cost;
	public boolean marked;
	public static int datum = 0;
	


	public DNode(Node<?> node) {
	  super(datum);
		this.node = node;
		pred = null;
		cost = UNCOST;
		marked = false;
	}
	
	public void mark(){
		marked = true;
	}

  @Override
  public int compareTo(DNode o) {
    return cost-o.cost;
  }
}
