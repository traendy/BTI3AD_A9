

public interface iNode<T> {

 public T getDatum();
 
 public void setDatum(T datum);
 
 
 /**
  * Gibt den Vorg�ngerknoten aus zu dem man gehen muss um 
  * am preiswertesten zu diesem zu kommen (Seite 85)
  * @return
  */
 public iNode<T> getPred();
 
 /**
  * get die minimalen Kosten bis zu diesem Knoten (Seite 85)
  */
 public float getCost();
 /**
  * gibt zur�ck ob der Knoten schon behandeltwurde (Seite 85)
  * @return
  */
 public boolean isMarked();
 
 public void mark();
 
 
}
