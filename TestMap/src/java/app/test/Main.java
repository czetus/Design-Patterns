package app.test;

import java.util.*;

class Main
{

	public static void main(String[] args)
	{

		Map<MyObj,Integer> map = new HashMap<>();
		map.put(new MyObj("test1ii"),1);
		map.put(new MyObj("test2"),2);
		map.put(new MyObj("test343241"),3);

		map.forEach((key,valu)->System.out.println(key.toString() + " value == " + valu));



	}


}
