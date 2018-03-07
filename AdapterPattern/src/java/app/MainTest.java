package app;


class MainTest
{
	public static void main(String[] args)
	{
	
		AnimalBehavior cat = new Cat();
		Dog dog = new Dog();
		
		System.out.println("Regular Cat");
		cat.giveSound();
		cat.showHappynes();
		
		System.out.println("Regular Dog");
		dog.dogIsTalkins();
		dog.happyDog();

		System.out.println("Cat to dog Adapter");
		AnimalBehavior dogAdaptered = new DogCatAdapter(dog);

		dogAdaptered.showHappynes();
		dogAdaptered.giveSound();
			

	}

}
