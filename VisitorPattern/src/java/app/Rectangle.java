package app;


public class Rectangle{

 private double side1; 
 private double side2;

  public Rectangle(double sideOne, double sideTwo){
   this.side1 = sideOne;
   this.side2 = sideTwo;
  }

 public Double calculateArea(Visitor visitor){
 	return visitor.calculateArea(this);
	}

	/**
	 * @return the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}

}


