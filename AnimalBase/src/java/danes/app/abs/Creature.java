package danes.app.abs;

abstract class Creature 
{

	protected String name;
	protected Double weight;
	protected String sound;

	
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void setWeight(Double weight);
	public abstract Double getWeight();

	public abstract void setSound(String sound);
	public abstract String getSound();



	public static void main(String[] args)
	{
		Cat2 cat = new Cat2("Rysiek");
		System.out.println(cat.getName());
	}

}
