package aup.cs.painter;

import java.util.ArrayList;

public abstract class Node implements Cloneable {
    private int height;
    private int width;
    static int panels;

    public Node(){
        this(10, 10);
    }

    public Node(int height, int width){
        this.height = height;
        this.width = width;
    }

    protected void printSymbol(){
        //Prints one symbol to the screen
        char printSymbol = '*';
        System.out.print(printSymbol);
    }

    protected void printWidth(char c){
        ///Prints out width of node with a given char
        for(int i = 0; i < getWidth(); i++){
            System.out.print(c);
        }
    }

    protected void printSpaces(int numOfSpaces){
        //prints out a given number of spaces
        String spaces = new String(new char[numOfSpaces]).replace("\0", " ");
        System.out.print(spaces);
    }

    protected void printInterior(ArrayList<Node> nodes, int line){
        //Prints out the interior of a panel
        System.out.print("|");
        int acc = 0;
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).printLine(line-1);
            if(i < nodes.size() + 1){
                System.out.print(" ");
            }
            int widthHere = nodes.get(i).getWidth();
            acc += widthHere + 2;
        }
        int numOfSpaces = getWidth() - acc;
        printSpaces(numOfSpaces);
        System.out.print("|");
    }

    public Node clone() throws CloneNotSupportedException {
        //Makes a clone of given node
        Node clonedNode = (Node) super.clone();
        clonedNode.height = this.height;
        clonedNode.width = this.width;
        return clonedNode;
    }

    public abstract void printLine(int line);

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    protected void setHeight(int h){
        this.height = h;
    }
    protected void setWidth(int w) {
        this.width = w;
    }
}
