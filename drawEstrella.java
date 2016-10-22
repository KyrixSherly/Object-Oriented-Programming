import ch.aplu.turtle.*;

public class drawEstrella {
    static Turtle t1=new Turtle();
    public static void drawStar(int size) {
      for(int i=0;i<5;i++) {
        t1.left(60);
        t1.forward(size);
        t1.right(120);
        t1.forward(size);
        t1.right(120-180*3/5);
      }
    } 
    public static void main(String[] args) {
      drawStar(100);
    }
}