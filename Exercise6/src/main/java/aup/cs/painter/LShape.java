package aup.cs.painter;

public class LShape extends Shape {
    public LShape(int h, int w) throws ShapeIllegalArgumentException {
        //Creates L shape and throws exception of it does not fit parameters for shape
        super();
        if(h<2 || w<2){
            throw new ShapeIllegalArgumentException("An L shape must be at least 2x2");
        }
        this.setHeight(h);
        this.setWidth(w);
    }

    @Override
    public void printLine(int line) {
        //Prints out one line of L shape
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
