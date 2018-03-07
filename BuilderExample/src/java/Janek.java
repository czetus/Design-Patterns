class Janek implements HumanBuilder
{
	private Human janek;

	public Janek()
	{
	 this.janek = new Human();
	}

	public void buildBrain(){
	 janek.setBrain("Clear Thinking sometimes");	
	}

	public void buildEyes(){
	 janek.setColorOfEyes("Green");
	}

	public void buildHeight(){
	 janek.setHeight(183.0);
	}

	public void buildName(){
	 janek.setName("Janek");
	}

	public void buildWieght(){
	 janek.setWeight(76.5);
	}
	public Human getHuman(){
	 return this.janek;
	}
}
