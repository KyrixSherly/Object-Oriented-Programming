import ch.aplu.turtle.*;

public class drawTriangulo {
    static Turtle t1=new Turtle();
    public static void drawTriangle(int size) {
      for(int i=0;i<3;i++) {
        t1.forward(size);
        t1.left(120);
      }
    } 
    public static void main(String[] args) {
      drawTriangle(100);
    }
}