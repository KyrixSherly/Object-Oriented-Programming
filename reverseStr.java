import java.util.*;

public class reverseStr {
  public static void reverse(String word) {
    for(int i=word.length()-1;i>=0;i--) {
      System.out.print(word.charAt(i));
    }
  }
  public static void main(String[] args){
    reverse("hello");
  }
}