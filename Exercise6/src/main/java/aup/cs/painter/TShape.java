package aup.cs.painter;

public class TShape extends Shape {

    public TShape(int h, int w) throws ShapeIllegalArgumentException {
        super();
        if(h<2 || w < 3 || (w%2 != 1)) {
            throw new ShapeIllegalArgumentException("Shape must be at least 2x3 and width must be odd");
        }
        this.height = h;
        this.width = w;
    }

    @Override
    public void printToScreen(int line) {
        if(line == 1) {
            for(int i = 0; i < this.getWidth(); i++) {
                System.out.print("*");
            }
        }
        else {
            if(line < this.getHeight() && line != 0) {
                for(int i = 0; i < this.getWidth(); i++) {
                    if(i == (this.getWidth()+1)/2-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            if(line > this.getHeight() - 1) {
                for(int i = 0; i < this.getWidth(); i++) {
                    System.out.print(" ");
                }
            }
        }
    }
}
