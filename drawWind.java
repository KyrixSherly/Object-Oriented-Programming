import ch.aplu.turtle.*;

Turtle t1=new Turtle();

void makeSwirlSquare(int size,int bigger,int turns,double angle) {
 int a=2;
 for(int i=0;i<turns;i++) {
   if(i%a!=0) {
     size+=bigger;
   }
   t1.forward(size);
   t1.right(angle);
 }
}



