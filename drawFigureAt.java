import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class drawFigureAt {
    static Turtle t1=new Turtle();
    public static void drawSquareAt(int size,double x,double y) {
      t1.setPos(x,y);
      for(int i=0;i<4;i++) {
        t1.forward(size);
        t1.left(90);
      }
    } 
    public static void main(String[] args) {
      drawSquareAt(100,-50.0,-50.0);
    }
}