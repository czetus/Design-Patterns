package app;


public class Triangle{

 private double hight;
 private double side;

  public Triangle(double hight, double straight){
   this.hight = hight;
   this.side = straight;
  }

 public Double calculateArea(Visitor visitor){
 	return visitor.calculateArea(this);
	}

	/**
	 * @return the hight
	 */
	public double getHight() {
		return hight;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;

	}

}
