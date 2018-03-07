package app.test;

class Building
{

	private String name;
	private Double height;




	public static  void paint(Building b)
	{
	  System.out.println("Maluje wlasnie budynek " + b.getName() );
	}

	/**
	 *
	 */
	public Building(String name)
       	{
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
       	{
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() 
	{
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) 
	{
		this.height = height;
	}

}
