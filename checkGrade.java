public class checkGrade {
  public static void computeGrade(double marks) {
    for (int a=0;a<1;a++) {
      if(90<=marks && marks<=100) {
        System.out.println("A");
      }
      else if(80<=marks && marks<90) {
        System.out.println("B");
      }
      else if(70<=marks && marks<80) {
        System.out.println("C");
      }
      else if(60<=marks && marks<70) {
        System.out.println("D");
      }
      else if(marks <60) {
        System.out.println("F");
      }
      else {
        System.out.println("Error");
      }
    }
  }
  public static void main(String[] args) {
    computeGrade(80.0);
  }
}