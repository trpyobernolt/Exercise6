package aup.cs.painter;

import java.util.ArrayList;

public class Panel extends Painter implements Node {
    private int height;
    private int width;
    private int totalWidth;
    private int totalHeight;

    private ArrayList<Node> list = new ArrayList<>();

    public Panel(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public void add(Node n) throws NodeOverflow {
        //adds a given node to the list and catches possible exceptions
        if(totalWidth + n.getWidth() >= pane.getWidth()) {
            throw new NodeOverflow();
        }
        if(totalHeight + n.getHeight() >= pane.getHeight()) {
            throw new NodeOverflow();
        }
        totalWidth += n.getWidth();
        totalHeight += n.getHeight();
        list.add(n);
    }

    public void printLine(int line) {
        //Prints out a panel line
        this.printToScreen(line);
    }

    public void printToScreen(int line) {
        if(line == 0 || line == this.getHeight()-1) {
            for(int i = 0; i < this.getWidth() + 2; i++) {
                System.out.print("-");
            }
        }
        else{
            System.out.print("|");
            for(int i = 0; i < list.size(); i++) {
                list.get(i).printToScreen(line);
            }
            for(int x = 0; x < (this.getWidth() - this.totalWidth); x++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.print("\n");
    }

    public int getHeight() {
        //returns height
        return height;
    }

    public int getWidth() {
        return width;
    }
}
