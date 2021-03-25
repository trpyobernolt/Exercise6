package aup.cs.painter;

public class TShape extends Shape {

    public TShape(int h, int w) throws ShapeIllegalArgumentException {
        //Creates T shape and throws exception of it does not fit parameters for shape
        super();
        if(h<2 || w < 3 || (w%2 != 1)) {
            throw new ShapeIllegalArgumentException("T Shape must be at least 2x3 and width must be odd");
        }
        this.setHeight(h);
        this.setWidth(w);
    }

    @Override
    public void printLine(int line) {
        //Prints out one line of a T shape
        if(line == 1) {
            printWidth('*');
        }
        else if(line <= this.getHeight()){
            printSpaces(this.getWidth()/2);
            printSymbol();
            printSpaces(this.getWidth()/2);
        }
        else {
            printSpaces(this.getWidth());
        }
    }
}
