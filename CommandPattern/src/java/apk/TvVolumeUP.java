package apk;

class TvVolumeUP implements Command
{

	private DeviceFunctions deviceFunctions;

	public TvVolumeUP(DeviceFunctions deviceFunctions)
	{
	 this.deviceFunctions = deviceFunctions;
	}

	public void execute()
	{
	 deviceFunctions.volumeUP();
	}

	@Override
	public void undo() {
	 deviceFunctions.volumeDOWN();

	}

}
