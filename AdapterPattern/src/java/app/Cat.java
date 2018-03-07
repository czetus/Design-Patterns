package app;


class Cat implements AnimalBehavior{

	@Override
	public void giveSound() {
		System.out.println("Miauuuu");
	}

	@Override
	public void showHappynes() {
		System.out.println("Not moving raised tail");

	}

}
