package apk;

class TVReceiver implements DeviceFunctions 
{

 	private Integer soundVolume = 0;
/*	private Commandc 

	public TVReceiver(Command command)
	{
	  this.cmd = command;
	}
	*/
	

	@Override
	public void turnOn() {
		System.out.println("TV ON");

	}

	@Override
	public void turnOff() {
		System.out.println("TV OFF");

	}

	@Override
	public void volumeUP() {
		++soundVolume;
		System.out.println("TV volume UP " + soundVolume);
	}	

	@Override
	public void volumeDOWN() {
		--soundVolume;
		System.out.println("TV volume down " + soundVolume);
	}

}
