package aup.cs.painter;

public class Painter {
    protected static Panel pane;

    public static void main(String[] args) {
        Painter p = new Painter();
        try {
            p.init();
            p.printToScreen();
            pane.sort();
            p.printToScreen();
        } catch (NodeOverflow no) {
            System.err.println("Elements overflow from painter");
        }
    }

    private void init() throws NodeOverflow {
        //populates panels
        pane = new Panel(15,100);
        Panel pane2 = new Panel(10,28);
        Panel pane3 = new Panel(12, 15);
        try {
            pane.add(pane3);
            TShape t = new TShape(7,5);
            pane.add(t);
            pane.add(t.clone());
            pane2.add(new TShape(8,7));
            pane2.add(new LShape(5,3));
            pane.add(pane2);
            pane2.add(new IShape(4,3));
            pane.add(new TShape(10,5));
        } catch (ShapeIllegalArgumentException | CloneNotSupportedException e) {
            System.out.println("Could not add given shapes: " + e.getMessage());
        }
    }

    private void printToScreen() {
        //Iterates over the height of the pane and prints each line
        int h = pane.getHeight();
        for(int i = 1; i <= h; i++) {
            pane.printLine(i);
            System.out.print("\n");
        }
    }
}
