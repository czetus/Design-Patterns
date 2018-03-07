package apk;

class TvVolumeDown implements Command
{

	private DeviceFunctions deviceFunctions;

	public TvVolumeDown(DeviceFunctions device)
	{
  	  this.deviceFunctions = device;
	}

	@Override
	public void execute() {
	   deviceFunctions.volumeDOWN();
	}

	@Override
	public void undo() {
	 deviceFunctions.volumeUP();
	}

}
