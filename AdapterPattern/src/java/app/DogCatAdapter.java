package app;

class DogCatAdapter implements AnimalBehavior
{

	private Dog dog;

	public DogCatAdapter(Dog dog)
	{
	   this.dog = dog;
	}

	@Override
	public void giveSound() {
		dog.dogIsTalkins();
	}

	@Override
	public void showHappynes() {
		dog.happyDog();
	}

}
