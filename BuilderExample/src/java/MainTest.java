class MainTest
{

	public static void main(String[] args)
	{
		HumanBuilder janek = new Janek();
		HumanEngineer engineer = new HumanEngineer(janek);
		engineer.makeHuman();
		Human human = engineer.getHuman(); 

		
		System.out.println(human.getName() + ", " + human.gethColorOfEyes() + ", " + human.getWeight());
	}

}
