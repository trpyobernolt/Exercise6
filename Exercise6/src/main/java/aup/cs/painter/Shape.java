package aup.cs.painter;

public class Shape implements Node {
    protected int height;
    protected int width;

    public Shape(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public Shape() {
        //This only exists to satisfy compiler
    }

    @Override
    public void printToScreen(int line) {
        boolean b = true;
        assert (!b) : "THIS SHOULD NEVER BE CALLED";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
