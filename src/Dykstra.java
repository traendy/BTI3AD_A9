import java.util.ArrayList;
import java.util.List;

public class Dykstra<T> {
  
  private iGraph<T> workingGraph;
  
  
  /**
   * TODO oder doch besser mit konstruktor?s
   * @param Graph
   * @return
   */
  public  Node<?> doTheDykstra(iGraph<?> Graph){
    this.workingGraph=(iGraph<T>) Graph;
    initialAllNodes();
    List rand = new ArrayList<Node<T>>();
    //rand= getRand(start);
    
    //ggf muss dass für die rekursion ausgelagert wernden
    // reread Seite 85 3. ergänze Rand R bei v
    for(int i =0; rand.size()>0; i++){
      Node<T> temp = getMinimalCost(rand);
      rand.remove(temp);
      temp.mark();
      
    }
    return null;
  }
  
  
  
  
  private void initialAllNodes(){
    //initStartNode(start);
    //for each
    //initDefaultNOde(def);
    //
  }
  
  /**
   * Initialisiert den StartKnoten
   * @param start StartKnoten
   */
  private void initStartNode(Node<T> start){
    start.setPred(start);
    start.setCost(0);
    start.mark();
  }
  /**
   * Initialisiert Standardknoten
   * @param def nicht startKnoten
   */
  private void initDefaultNOde(Node<T> def){
    def.setPred(null);
    def.setCost(Float.MAX_VALUE);
    //marked is false by definition 
    
  }
  
  
  /**
   * Bestimmt den Rand der aus Knoten bestehen die adjazent zum
   * @param start sind
   * @param start Knoten dessen Rand bestimmt werden soll
   * @return Liste aller benachbarten Knoten
   */
  private List<Node> getRand(Node start){
  
      
    return null;
  }
  
  /**
   * Gibt den Knoten mit minimalen Kosten aus einer Liste von Knoten zurück
   * @param list Liste mit zu unterscheidenden Knoten
   * @return Knoten mit geringstem Abstand
   */
  private Node getMinimalCost(List<Node> list){
    return null;
  }
  
  /**
   * Findet alle Nachbarn zu einem Knoten center
   * @param center Knoten dessen Nachbarn gesucht sind
   * @return Liste aller Nachbarknoten
   */
  private List<Node >getAllNeighbors(Node center){
    return null;
  }
  
  /**
   * setzt die Kosten eines Knotens um ihn zu erreichen 
   * @param node knoten der neue kosten bekommen soll
   */
  private void updateCost(Node nodeK, Node nodeV ){
    float cost = nodeV.getCost() 
        + workingGraph.getWeight(nodeK, nodeV);
    if(nodeK.getCost() > cost){
      nodeK.setCost(cost);
      nodeK.setPred(nodeV);
    }
    //nimm k in R mit auf
  }
  
  
  
}

