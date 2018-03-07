package app;

public class Circle{

 public final Double PI = 3.1415;
 private double r;

  public Circle(double radius){
   this.r = radius;
  }

 public Double calculateArea(Visitor visitor){
	return visitor.calculateArea(this);
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

}
