package app;

abstract class EntertainmentDevice
{

	private int soundVolume = 10;
	protected int deviceState;
	protected int maxSettings;

	public abstract void button5Pressed();
	public abstract void button6Pressed();

	public EntertainmentDevice( int newDeviceState, int newMaxSettings)
	{
	 this.deviceState = newDeviceState;
	 this.maxSettings = newMaxSettings;
	}

	public void button7Pressed()
	{
		++soundVolume;
		System.out.println("Volume UP level = " + soundVolume);
	}


	public void button8Pressed()
	{
		--soundVolume;
		System.out.println("Volume DOWN level = " + soundVolume);
	}
}
