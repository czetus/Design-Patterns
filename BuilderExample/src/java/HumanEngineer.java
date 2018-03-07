class HumanEngineer
{

	private HumanBuilder builder;

	public HumanEngineer(HumanBuilder humanBuilder)
	{
		this.builder = humanBuilder;
	}

	public Human getHuman(){
	 return  builder.getHuman();
	}

	public void makeHuman(){
	
		builder.buildBrain();
		builder.buildEyes();
		builder.buildHeight();
		builder.buildName();
		builder.buildWieght();
	}


}
