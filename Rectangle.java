import java.util.*;

public class Rectangle  {
  protected double length;
  protected double width;
  protected boolean isSelected;
  public Rectangle(double l,double w) {
    this.length=l;
    this.width=w;
  }
  public double getLength() {
    return this.length;
  }
  public double getWidth() {
    return this.width;
  }
  public boolean getSelected() {
    return this.isSelected;
  }
  public void setSelected(boolean b) {
    this.isSelected=b;
  }
  public void main(String[] args) {
    Rectangle(10.0,20.0);
  }
}

