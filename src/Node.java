public class Node<T> implements iNode<T>{

  private T datum;
  private Node<T> pred;
  private float cost;
  private boolean marked= false;
  

  public Node(T datum){
    this.pred = null;
    this.cost = Float.MAX_VALUE;
    this.marked = false;
    this.datum = datum;
  }
  
  
  public void setPred(Node<T> pred) {
    this.pred = pred;
  }


  @Override
  public T getDatum() {
   
    return datum;
  }

  @Override
  public void setDatum(T datum) {
   this.datum =datum;
    
  }

  @Override
  public iNode<T> getPred() {
    // TODO Auto-generated method stub
    return pred;
  }

  @Override
  public float getCost() {
    // TODO Auto-generated method stub
    return cost;
  }
  
  public void setCost(float cost){
    this.cost= cost;
  }

  @Override
  public boolean isMarked() {
    // TODO Auto-generated method stub
    return marked;
  }

  @Override
  public void mark() {
    marked= true;
    
  }
  
  

}
