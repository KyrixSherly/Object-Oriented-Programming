import java.util.*;
public class check1stDay {
  public static void checkSunday() {
    int sum = 0;
    Calendar c = Calendar.getInstance();
    for(int year = 1901; year <= 2000; year ++){
      for(int month=1;month<=12;month++){
        c.set(year,month,1);
        int date = c.get(Calendar.DAY_OF_WEEK);
        if( date == 1) {
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    checkSunday();
  }
}