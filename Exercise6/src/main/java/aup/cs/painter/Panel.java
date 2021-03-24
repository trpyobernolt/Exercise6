package aup.cs.painter;

import java.util.ArrayList;
import java.util.Collections;

public class Panel extends Node {
    private int height;
    private int width;
    private int containedWidth = 1;
    private ArrayList<Node> list = new ArrayList<>();

    public Panel(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public void add(Node nodeToAdd) throws NodeOverflow {
        list.add(nodeToAdd);
        containedWidth += nodeToAdd.getWidth() + 1;
        if(containedWidth >= getWidth() - 1 || nodeToAdd.getHeight() >= getHeight() - 1){
            throw new NodeOverflow();
        }
    }

    public void printLine(int line){
        if((line == 1) || (line == getHeight())){
            printWidth('-');
        }
        else if(line <= getHeight()){
            printInterior(list, line);
        }
        else{
            printSpaces(getWidth());
        }
    }

    public int getHeight() {
        //returns height
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void sort(){
        Collections.sort(list, new NodeComparator());
        for(Node n : list) {
            if(n instanceof Panel) {
                ((Panel) n).sort();
            }
        }
    }
}
