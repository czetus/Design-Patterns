
class MainTest
{

	public static void main(String[] args)
	{


		new Thread(()->
				{
				  	
		Singleton s1 = Singleton.getInstance();
		System.out.println("Object s1 = " + System.identityHashCode(s1));		
				})
		 .start();



		new Thread(()->{
		Singleton s2 = Singleton.getInstance();
		System.out.println("Object s2 = " + System.identityHashCode(s2));		
				})
		.start();
	}

}
