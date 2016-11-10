import java.util.*;
public class getList {
  public static List<Integer> list = new ArrayList<Integer>();
  public static void get4multiple () {  
    for (int i=1;i<1001;i++) {
      if (i%4==0 && i%5!=0) {
        list.add(i);
      }
    }
    System.out.println(list);
  }
  public static void main(String[] args) {
    get4multiple();
  }
}