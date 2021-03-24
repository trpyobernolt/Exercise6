package aup.cs.painter;

public class LShape extends Shape {
    public LShape(int h, int w) throws ShapeIllegalArgumentException {
        super();
        if(h<2 || w<2){
            throw new ShapeIllegalArgumentException("An L shape must be at least 2x2");
        }
        this.setHeight(h);
        this.setWidth(w);
    }

    @Override
    public void printLine(int line) {
        if(line < this.getHeight() && line != 0) {
            printSymbol();
            printSpaces(this.getWidth() - 1);
        }
        if(line == this.getHeight()) {
            printWidth('*');
        }
        if(line > this.getHeight()) {
            printSpaces(this.getWidth());
        }
    }
}
