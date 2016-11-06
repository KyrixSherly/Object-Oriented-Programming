public class checkLeapYear {
  public static void checkLY(int year) {
    if(((year%4==0) && (year % 100 !=0)) || (year % 4 ==0)) {
      System.out.printf(" %d is Leap Year!!",year);
    }
    else {
      System.out.println("It's not Leap Year.");
    }
  }
  public static void main(String[] args) {
    checkLY(2016);
  }
}