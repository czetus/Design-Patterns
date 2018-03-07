class Cebula2 implements Pizza
{
 private Pizza pizza;
	public Cebula2(Pizza pizza)
	{
	this.pizza = pizza;
	}

	public String getDescription()
	{
	 return pizza.getDescription() + ", cebula";
	}


	public double getCost()
	{
	 return pizza.getCost() + 0.50;
	}

}
