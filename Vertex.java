/*
 Group Members:
 Algorithms and Data Structures
 Section CH 
 Project 3 - Prim's Algorithm 
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

    int index;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    

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


}
