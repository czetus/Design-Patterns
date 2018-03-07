package app;

abstract class RemoteButton
{

	private EntertainmentDevice entertainmentDevice;

	public abstract void button9Press();
	public RemoteButton(EntertainmentDevice entrDev)
	{
	  this.entertainmentDevice = entrDev;
	}


	public void button5Pressed(){
	 entertainmentDevice.button5Pressed();
	}
	
	public void button6Pressed(){
	 entertainmentDevice.button6Pressed();
	}

	
}
