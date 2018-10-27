/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

/**
 *
 * @author maha
 */
public class Vertex {

    // each node has a label
    char label;
    int weight;
    Vertex parent;
//    Vertex rightChild;
//    Vertex leftChild;
//    int level;
//    int order;
//    int nodesInSameLine;
    int index;
    
    

    public Vertex() {
    }

    public Vertex(Vertex parent, int index, int weight, char label) {
        this.parent= parent;
        this.label = label;
        this.weight = weight;
        this.parent = parent;
        this.index= index;
    }
    
  
    
    

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

//    public Vertex getRightChild() {
//        return rightChild;
//    }
//
//    public void setRightChild(Vertex rightChild) {
//        this.rightChild = rightChild;
//    }
//
//    public Vertex getLeftChild() {
//        return leftChild;
//    }
//
//    public void setLeftChild(Vertex leftChild) {
//        this.leftChild = leftChild;
//    }
//
//    public boolean hasLeftChild() {
//        return this.leftChild == null;
//    }
//
//    public boolean hasRightChild() {
//        return this.rightChild == null;
//    }

}
