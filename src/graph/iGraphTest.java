package graph;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import helper.GraphGenerator;

public class iGraphTest {
  
  MatrixGraph matrixGraph;
  ListGraph listGraph;
  List<Node<?>> nodes;
  
  @Before
  public void init(){
    nodes = new ArrayList<>();
    for(int i =0; i<10; i++){
      nodes.add(new Node<Integer>(i));
    }
    int[][] matrix = GraphGenerator.genNonDirectionMatrix(10);
   
    matrixGraph = new MatrixGraph(matrix, nodes);
    
    listGraph = new ListGraph(GraphGenerator.genListGraph(matrix, nodes));
    
  }

  @Test
  public void testAddNode() {
    Node<Integer> node = new Node<Integer>(100);
    listGraph.addNode(node);
    matrixGraph.addNode(node);
    assertEquals(11, listGraph.anzNodes);
    assertEquals(11, matrixGraph.anzNodes);
    
  }

  @Test
  public void testAddEdgeEdge() {
    Node<Integer> node = new Node<Integer>(66);
    listGraph.addNode(node);
    matrixGraph.addNode(node);
    Edge edge = new Edge(nodes.get(0), node, 999);
    listGraph.addEdge(edge);
    matrixGraph.addEdge(edge);
    
  }

  @Test
  public void testAddEdgeNodeOfQNodeOfQInt() {
    fail("Not yet implemented");
  }

  @Test
  public void testRemoveNode() {
    fail("Not yet implemented");
  }

  @Test
  public void testTraverse() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetWeight() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetNodes() {
    boolean lGraphList = true;
    boolean mGraphList = true;
    List<Node<?>> tempList = listGraph.getNodes();
    for(int i=0; i<tempList.size();i++){
      if(!tempList.get(i).equals(nodes.get(i))){
        lGraphList= false;
      }
    }
    tempList = matrixGraph.getNodes();
    for(int i=0; i<tempList.size();i++){
      if(!tempList.get(i).equals(nodes.get(i))){
        mGraphList= false;
      }
    }
    assertTrue(lGraphList&&mGraphList);
  }

  @Test
  public void testGetNeighborsNodeOfQ() {
    List<Node<?>> tempL =listGraph.getNeighbors(nodes.get(0));
    List<Node<?>> tempM =matrixGraph.getNeighbors(nodes.get(0));
    boolean gotSomeNeighbors = true;
    if(tempL.size()!=tempM.size()){
      gotSomeNeighbors = false;
      System.out.println(tempL.size());
      System.out.println(tempM.size());
      
    }
    
    assertTrue(gotSomeNeighbors);
    
  }

}
