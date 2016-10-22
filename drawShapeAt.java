import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class drawShapeAt {
    static Turtle t1=new Turtle();
    static enum Shape {TRI,SQU};
    public static void drawTriangleOrSquareAt(int size,double x,double y) {
      t1.setPos(x,y);
      Shape sel=Shape.SQU;
      switch(sel) {
        case TRI:
          for(int i=0;i<3;i++) {
            t1.forward(size);
            t1.left(120);
          }
          break;
        case SQU:
           for(int i=0;i<4;i++) {
            t1.forward(size);
            t1.left(90);
          }
          break;
      }
    }
    public static void main(String[] args) {
      drawTriangleOrSquareAt(100,-50.0,-50.0);
    }
}