package app;

public interface Visitor{

	Double calculateArea(Circle circle);
	Double calculateArea(Rectangle circle);
	Double calculateArea(Triangle circle);
	//Double calculateArea(Square square);
}
