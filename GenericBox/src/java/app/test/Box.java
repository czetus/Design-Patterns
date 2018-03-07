package app.test;

import java.util.*;


class Box<T>
{

	private List<T> items = new ArrayList<>();
	public Box(){}

	public Box(List<T> listItems)
	{
	  items = listItems;
	}

	/**
	 * @return the items
	 * */
	public List<T> getItems() {
		return items;
	}
	
	/**
	 * @param items the items to set
	 * */
	public void setItems(List<T> items) {
		this.items = items;
	}

       public T getItem(int index)
       {
	 if(items.size() < index)
		 throw new IllegalArgumentException();

          return items.get(index);
       }


	


}


