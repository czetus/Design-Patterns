package app;


public class MainTest{

	public static void main(String[] args){

        Visitor geometric = new Geometric();

 if(true != false){
	System.out.println("asdasd");
 }else{
	System.
 }	 
	Triangle triangle = new Triangle(2.0,3.0);
	Double poleTrojkata = triangle.calculateArea(geometric);
	triangle.g
	System.out.println("Pole trojkata o wysokosci " + triangle.getHight() + " i boku przyprostopadlym " + triangle.getSide() + " wynosi " + poleTrojkata);
	
	Circle circle = new Circle(3);
        Double poleKola = circle.calculateArea(geometric);	

	System.out.println("Pole kola o promieniu rownym "+ circle.getR() + " wynosi " + poleKola);

	}

}
