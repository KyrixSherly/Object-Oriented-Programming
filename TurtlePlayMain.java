package com.sd.turtle;
import ch.aplu.turtle.*;

class TurtlePlayMain {
  public static void main(String[] args) {
    Turtle t1=new Turtle();
    for(int a=0;a<4;a++) {
      t1.fd(100);
      t1.right(90);
    }
  }
}