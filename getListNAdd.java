import java.util.*;
public class getListNAdd {
  public static List<Integer> list = new ArrayList<Integer>();
  public static void get4multiple () {  
    for (int i=1;i<1001;i++) {
      if (i%4==0 && i%5!=0) {
        list.add(i);
      }
    }
    int sum =0 ;
    for (int j=0;j<list.size();j++) {
      sum += list.get(j);
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    get4multiple();
  }
}