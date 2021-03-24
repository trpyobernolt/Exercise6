package aup.cs.painter;

public abstract class Shape extends Node {

    public Shape(int h, int w) {
        super(h,w);
    }

    public Shape() {
        this(69,69);
    }
}
