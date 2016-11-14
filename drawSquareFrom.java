import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
import java.util.*;

public class drawSquareFrom {
  static Turtle t1=new Turtle();
  static double tracks[][]={{100,100},{200,100},{200,200},{100,200},{100,100}};
  public static void drawSquareFrom() {
    for(double[] t:tracks) {
      t1.moveTo(t[0],t[1]);
    }
  }
  public static void main(String[] args) {
      drawSquareFrom();
  }
}