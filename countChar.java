import java.util.*;

public class countChar {
  public static void countWord() {
    Map<String,Integer> countW=new HashMap<String,Integer>();
    countW.put("sangmyung university",1);
    char[] letters="sangmyung university".toCharArray();
    for(char c: letters) {
      s=Character.toString(c);
      if(countW.containsKey(s)) {
        countW.put(s,countW.get(s)+1);
      }
      else {
        countW.put(s,1);
      }
    }
    System.out.println(countW.get("sangmyung university"));
    
   public static void main(String[] args) {
    countWord();
  }
}