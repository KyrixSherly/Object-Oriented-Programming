jshell> class DiceGame{
   ...> private Player a1;
   ...> private Player a2;
   ...> public void startGame(){
   ...> a1=new Player("chulsoo");
   ...> a2=new Player("youngsoo");
   ...> a1.play();
   ...> a2.play();
   ...> if(a1.getNum() > a2.getNum()) {
   ...> System.out.println(a1.getName()+ " win");
   ...> }
   ...> else if (a1.getNum()==a2.getNum()){
   ...> System.out.println(" draw");
   ...> }
   ...> else {
   ...> System.out.println(a2.getName() + " win");
   ...> }
   ...> }
   ...> }
