package aup.cs.painter;

public class LShape extends Shape {
    public LShape(int h, int w) throws ShapeIllegalArgumentException {
        super();
        if(h<2 || w<2){
            throw new ShapeIllegalArgumentException("An L shape must be at least 2x2");
        }
        this.height = h;
        this.width = w;
    }

    @Override
    public void printToScreen(int line) {
        if(line < this.getHeight() && line != 0) {
            System.out.print("*");
            for(int i = 0; i < this.getWidth() - 1; i++) {
                System.out.print(" ");
            }
        }
        if(line == this.getHeight()) {
            for(int i = 0; i < this.getWidth(); i++) {
                System.out.print("*");
            }
        }
        if(line > this.getHeight()) {
            for(int i = 0; i < this.getWidth(); i++) {
                System.out.print(" ");
            }
        }
    }
}
