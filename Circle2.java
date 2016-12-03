package com.sd.ch8;

public class Circle2 implements IFShape {
  public double radius;
  public double area;
  public double perimeter;
  public Circle(double r) {
       this.radius=r;
       this.area=r*r*(3.14);
       this.perimeter=2*r*(3.14);
  }
  public double calcArea() {
    return this.area;
  }
  @Override
  public double calcPerimeter() {
    return this.perimeter;
  }
  public void main(String[] args) {
    Circle c=new Circle(3.0);
    c.calcArea();
    c.calcPerimeter();
  }
}