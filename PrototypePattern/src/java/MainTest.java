class MainTest
{
  public static void main(String[] args)
  {
	  CloneFactory factory = new CloneFactory();
 	Sheep molly = new Sheep();
	
	Sheep copy = (Sheep) factory.getClone(molly);

	System.out.println("Orig: " + molly + "," + System.identityHashCode(molly));

	System.out.println("Copy: " + copy + "," + System.identityHashCode(copy));

  }
}
