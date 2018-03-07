package app;


public class Geometric implements Visitor{
/*Przy dodaniu nowej figury np. kwadrat bede musial dodac tutaj metode do liczenia 
 * a jesli bym uzyl gdzies kompozytora ale zachowanie dzialania funkcji gdzies musi byc zaimplementowane
 *
 * */

	@Override
	public Double calculateArea(Circle circle) {
		 Double result = circle.PI * Math.pow(circle.getR(),2); 
		return result;
	}

	@Override
	public Double calculateArea(Rectangle rectangle) {
		return rectangle.getSide1() * rectangle.getSide2();
	}

	@Override
	public Double calculateArea(Triangle triangle) {
		return (triangle.getHight() * triangle.getSide()) / 2;
	} 

}
