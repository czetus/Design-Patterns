package app.test;

import java.util.*;

class Main
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("a"); list.add("b");

		ListIterator<String> iterator = list.listIterator();

		while(iterator.hasNext())
		{
		  System.out.println(iterator.next());
		  iterator.previous();
		}


	}
}

