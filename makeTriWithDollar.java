public class makeTriWithDollar {
  public static void makeStar (int height,String Symbol) {
    StringBuffer sbuf=new StringBuffer();
    for (int i=0;i<height;i++) {
      for(int j=0;j<i;j++) {
        sbuf.append(Symbol);
      }
      System.out.printf("%d %s\n",i,sbuf.toString());
      sbuf.delete(0,sbuf.length());
    }
  }
  public static void makeStar2 (int height,String Symbol) {
    StringBuffer sbuf=new StringBuffer();
    String white = " ";
    for (int i=0;i<height;i++) {
      for(int j=height;j>i;j--) {
        sbuf.append(white);
      }
      for(int k=0;k<=i;k++) {
        sbuf.append(Symbol);
      }
      System.out.printf("%d %s\n",i,sbuf.toString());
      sbuf.delete(0,sbuf.length());
    }
  }
  public static void main(String[] args) {
    makeStar(10,"*");
    makeStar2 (10,"*");
  }
}
        