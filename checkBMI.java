public class checkBMI {
  public static void checkMyBMI(double weight,double height) {
    double bmi = weight/(height*height);
    System.out.println(bmi);
    if (bmi < 20.0) {
      System.out.println("You're low weight.");
    }
    else if (bmi >=20.0 && bmi <= 25.0) {
      System.out.println("You're normal.");
    }
    else if (bmi > 25.0 && bmi <=29.9) {
      System.out.println("You're overweight.");
    }
    else if (bmi >=30.0 && bmi <=40.0) {
      System.out.println("You're obesity.");
    }
    else {
      System.out.println("You're extremely obesity.");
    }
  }
  public static void main(String[] args) {
    checkMyBMI(62.0,178.0);
  }
}