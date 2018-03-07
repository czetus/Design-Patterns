class Boczek extends PizzaDecorator
{

	public Boczek(Pizza pizza)
	{
	  super(pizza);

	}

	public double getCost()
	{
         return  pizza.getCost() + 2.0;
	}

	public String getDescription()
	{
         return  pizza.getDescription() + ", boczek";
	}

}
