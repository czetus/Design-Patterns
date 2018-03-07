class Sheep implements Animal
{


	public Animal makeCopy()
	{
	Sheep sheep = null; 
	   try{
	       sheep = (Sheep)super.clone();
	   }catch(CloneNotSupportedException ex){}
	  return sheep;
	}

	public String toString()
	{
         return "Molly sheep !";
	}
}
