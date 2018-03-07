class Cebula extends PizzaDecorator
{

	public Cebula(Pizza pizza)
	{
	 super(pizza);
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
