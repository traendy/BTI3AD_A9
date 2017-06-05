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


}
