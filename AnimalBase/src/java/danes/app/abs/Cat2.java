package danes.app.abs;

class Cat2 extends Creature 
{

	public Cat2(String n)
	{
		this.name = n;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	   this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setWeight(Double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}

	@Override
	public Double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void setSound(String sound) {
		// TODO Auto-generated method stub
		this.sound = sound;
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return this.sound;
	}

	public static void main()
	{
		Cat2 cat = new Cat2("Rysiek");
		System.out.println(cat.getName());
	}
}
