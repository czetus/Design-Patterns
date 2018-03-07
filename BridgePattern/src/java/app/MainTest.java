package app;

class MainTest
{

	public static void main(String[] args)
	{
		EntertainmentDevice tv = new TvDevice(5,111);
		RemoteButton muteButton = new MuteRemote(tv);
		
		tv.button8Pressed();
		muteButton.button5Pressed();
		muteButton.button6Pressed();
		muteButton.button9Press();



	}

}
