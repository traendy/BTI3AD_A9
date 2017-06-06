package graph;

/**
 * A Nodeclass for a Graph, very simple
 * @author peter lupadder
 *
 * @param <T>  Type of datum
 */
public class Node<T> {
	/**
	 * unique id 
	 */
	public final int id;
	/**
	 * static id counter to get unique id
	 */
	private static int idCount=0;
	/**
	 * load
	 */
	private T datum;
	
	/**
	 * Constructor
	 * @param datum
	 */
	public Node(T datum){
		this.datum = datum;
		id = idCount++;
	}
	/**
	 * Getter datum
	 * @return datum
	 */
	public T getDatum(){
		return datum;
	}
	
	
	/**
	 * like equals() of Object
	 * @param n note to check with
	 * @return if n == this true 
	 */
	public boolean equals(Node<T> n){
		boolean ret= false;
		if (n != null){
			if (id == n.id) ret=true;
		}
		return ret;
	}
  @Override
  public String toString() {
    return "Node [id=" + id + ", datum=" + datum + "]";
  }
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Node)) {
		return false;
	}
	Node other = (Node) obj;
	if (id != other.id) {
		return false;
	}
	return true;
}


}
