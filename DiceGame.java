jshell> class DiceGame{
   ...> private Player p1;
   ...> private Player p2;
   ...> public void startGame(){
   ...> p1=new Player("chulsoo");
   ...> p2=new Player("youngsoo");
   ...> p1.play();
   ...> p2.play();
   ...> if(p1.getNum() > p2.getNum()) {
   ...> System.out.println(p1.getName()+ " win");
   ...> }
   ...> else if (p1.getNum()==p2.getNum()){
   ...> System.out.println(" draw");
   ...> }
   ...> else {
   ...> System.out.println(p2.getName() + " win");
   ...> }
   ...> }
   ...> }