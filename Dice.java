
 class Dice{
 private int number=0;
 public void roll(){
   number = (int) (Math.random()*6);
   System.out.println("It's "+number);
 }
 public int getNum() {
   return this.number;
 }
 }

