import java.util.*;

public class Student {
  private String name;
  private int studentNum;
  public static void studentSort(){
    Student(String name,int sNum) {
      this.name=name;
      this.studentNum=sNum;
    }
    public String getName() {
      return name;
    } 
    Student s1=new Student("ej 1",1);
    Student s2=new Student("ej 5",5);
    Student s3=new Student("ej 3",3);
  
    List<String> studentNameList=new ArrayList<String>();
    studentNameList.add(s1.getName());
    studentNameList.add(s2.getName());
    studentNameList.add(s3.getName());
  
    Collections.sort(studentNameList);
  }
  public static void main(String[] args) {
    studentSort();
  }
}
  