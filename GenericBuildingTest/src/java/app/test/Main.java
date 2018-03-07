package app.test;

import java.util.*;

class Main
{


	public static void main(String[] args)
	{
	
		House h1 = new House("Blok mieszkalny");
		House h2 = new House("Dom mieszkalny Lubicka");
		House h3 = new House("Blizniak 123");
		House h4 = new House("Zamek");

		List<House> list = new ArrayList<>();
		list.add(h1); list.add(h2); list.add(h3); list.add(h4);

		System.out.println(h2.getName());                
		




		Main main = new Main();

		main.paintAllBuilding(list);
               /* paintAllBuilding(list); */
	}

	public   <T extends Building>   void paintAllBuilding(/*List<? extends Building>*/ List<T> listOfBuilding)
	{

	 listOfBuilding.forEach(Building::paint); 
	}


}
