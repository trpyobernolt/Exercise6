package aup.cs.painter;

public class IShape extends Shape {

    public IShape(int h, int w) throws ShapeIllegalArgumentException {
        super();
        if(h<2 || w < 3 || (w%2 != 1)) {
            throw new ShapeIllegalArgumentException("I Shape must be at least 2x3 and width must be odd");
        }
        this.setHeight(h);
        this.setWidth(w);
    }

    @Override
    public void printLine(int line) {
        if(line == 1 || line == this.getHeight()) {
            printWidth('*');
        }
        else if(line <= getHeight()){
            printSpaces(getWidth()/2);
            printSymbol();
            printSpaces(getWidth()/2);
        }
        else{
        printWidth(' ');
         }
    }
}
