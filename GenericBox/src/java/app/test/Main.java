package app.test;

import java.util.Arrays;

class Main
{

	public static void main(String[] args)
	{
   		Main m = new Main();

		Double[] doubles = {1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5};	

		Box<Double> dBox = new Box<>(Arrays.asList(doubles)); 

		Integer[] ints = {1,2,3,4,5,6,7,8};

		Box<Integer> iBox = new Box<>(Arrays.asList(ints));

	}

/**
 *Biore boxa z elementami i iteruje przez niego zmieniajac jego wartosci * 2
 */

	public  void multiply(Box<? extends Number> box)
	{
	  box.getItems().forEach(num->((Number)num) + 2));
	}	


}
