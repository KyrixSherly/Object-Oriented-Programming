public class rockScissorsPaper {
  public static void playGame (String p1,String p2) {    
    if (p1.equals("Rock")){
      if (p2.equals("Scissors")){
        System.out.println("p1 win!!");
      }
      else if (p2.equals("Paper")){
        System.out.println("p2 win!!");
      }
      else {
        System.out.println("draw!!");
      }
    }
    else if (p1.equals("Scissors")) {
      if (p2.equals("Paper")){
        System.out.println("p1 win!!");
      }
      else if (p2.equals("Rock")) {
        System.out.println("p2 win!!");
      }
      else {
        System.out.println("draw!!");
      }
    }
    else {
      if (p2.equals("Rock")){
        System.out.println("p1 win!!");
      }
      else if (p2.equals("Scissors")){
        System.out.println("p2 win!!");
      }
      else {
        System.out.println("draw!!");
      }
    }
  }
  public static void main(String[] args) {
    playGame("Rock","Paper");
  }
}