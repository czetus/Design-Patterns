package danes;

class Main
{

	public static void main(String[] args)
	{
		
		User piotr = new User("Piotr Danes",32);

		User janek = new User("Jan Danes",28);
		piotr.register(janek);
		Message msg = new Message("Jestem Piotrek, gram w football Managaer !!.",piotr);
		piotr.setMessage(msg);	

	}
}
