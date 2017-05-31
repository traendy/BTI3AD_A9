
public interface iGraph<T>{

  public void addNode(iNode<T> node);
  
  public void removeNode(iNode<T> node);
  
  public void traverse();
  
  public iNode<T>[] getNeighbors(iNode<T> node);
  
  public float getWeight(iNode<T> nodeA, iNode<T> nodeB);
}
