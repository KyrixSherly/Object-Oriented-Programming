package com.sd.ch8;

public class Circle extends Point {
  public double radius; 
  public double getArea = radius*radius*3.14;
  
  public void circle() {
    System.out.print(getArea);
  }
}