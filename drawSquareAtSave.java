import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
import java.util.*;

public class drawSquareAtSave {
  static Turtle t1=new Turtle();
  static ArrayList<Double[]> posArr=new ArrayList<Double[]>();
  static Double[] pos=new Double[2];
  public static void drawFigureAtSave(int size,double x,double y) {
    t1.setPos(x,y);
    for(int i=0;i<4;i++) {
      t1.forward(size);
      t1.left(90);
      pos[0]=t1.getX();
      pos[1]=t1.getY();
      posArr.add(pos);
      for(Double[] p: posArr) {
        System.out.printf("(%.1f,%.1f)",p[0],p[1]);
      } 
    }
  }
    public static void main(String[] args) {
      drawFigureAtSave(100,-50.0,-50.0);
    }
}