package app;

class TvDevice extends EntertainmentDevice
{

	public TvDevice(int newDeviceState, int newMaxSetting)
	{
	 super(newDeviceState,newMaxSetting);
	}
	

	@Override
	public void button5Pressed() {
	  System.out.println("Channel Down");
	  deviceState--;
	}

	@Override
	public void button6Pressed() {
	  System.out.println("Channel Up");
	  deviceState++;
	}


}
