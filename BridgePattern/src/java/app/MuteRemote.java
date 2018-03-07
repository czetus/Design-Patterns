package app;

class MuteRemote extends RemoteButton
{

	public MuteRemote(EntertainmentDevice device)
	{
	super(device);
	}
	@Override
	public void button9Press() {
	  System.out.println("Device was muted");
	}


}
