class MainTest
{
	public static void main(String[] args)
	{
		Pizza chlopska = new Cebula(new Boczek(new PlainPizza()));

		Pizza chlopska2 = new Cebula2(new Boczek2(new PlainPizza2()));
		
		System.out.println(chlopska.getDescription());
		System.out.println(chlopska.getCost());

		System.out.println(chlopska2.getDescription());
		System.out.println(chlopska2.getCost());

	}
}
