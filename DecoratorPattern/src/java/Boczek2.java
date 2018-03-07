class Boczek2 implements Pizza
{
 private Pizza pizza;
	public Boczek2(Pizza pizza)
	{
	  this.pizza = pizza;

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
