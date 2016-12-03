import java.util.*;

public class SayHelloInWorld{
  public String greet;
  public SayHelloInWorld(String greet) {
    this.greet=greet;
  }
  public void sayHello() {
    System.out.println(greet+" means Hello!");
  }
  
  public void main(String[] args) {
    SayHelloInWorld[] h=new SayHelloInWorld[5];
    h[0]=new SayHelloInWorld("Bonjour");
    h[1]=new SayHelloInWorld("Hallo");
    h[2]=new SayHelloInWorld("Ciao");
    h[3]=new SayHelloInWorld("Buon giorno");
    h[4]=new SayHelloInWorld("Buenos dias");
    
    h[0].sayHello();
  }
}