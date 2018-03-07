package danes.app.inherti;

class Animal
{

 private Double weight;
 private Integer legs;
 private String sound;
 private String name;

 	public Animal(String name)
	{
          this.name = name;
	}



	private void bePrivate()
	{
          System.out.println("In Supper class privat method");
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		if(weight > 0.0)
	        	this.weight = weight;
		else
			System.out.println("Waga jest niepoprawna");
	}

	/**
	 * @return the legs
	 */
	public Integer getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(Integer legs) {
		this.legs = legs;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public final void onlyInAnimal()
	{
		System.out.println("Animal in final method");
	}

/*	public static void main(String... args)
	{
		Cat cat = new Cat("Rysiek");
		System.out.println("Kotek ma na imie " + cat.getName());
		cat.attack();
	}
*/
}
