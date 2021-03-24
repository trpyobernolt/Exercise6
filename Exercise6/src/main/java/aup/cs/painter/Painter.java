package aup.cs.painter;

public class Painter {
    protected static Panel pane;

    public static void main(String[] args) {
        Painter p = new Painter();
        try {
            p.init();
            p.printToScreen();
        } catch (NodeOverflow | ShapeIllegalArgumentException no) {
            System.err.println("Elements overflow from painter");
        }
    }

    private void init() throws NodeOverflow, ShapeIllegalArgumentException {
        pane = new Panel(20,30);
        Panel pane2 = new Panel(10,20);
        pane.add(new IShape(6,5));
        pane.add(new TShape(8,7));
        pane.add(new LShape(5,6));
        pane2.add(pane2);
    }

    private void printToScreen() {
        //Iterates over the height of the pane and prints each line
        int h = pane.getHeight();
        for(int i = 0; i < h; i++) {
            pane.printLine(i);
        }
    }

}
