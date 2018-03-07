package apk;

class TvOn implements Command
{

	private DeviceFunctions deviceFunctions;
	public TvOn(DeviceFunctions deviceFunctions)
	{
	  this.deviceFunctions = deviceFunctions;
	}

	@Override
	public void execute() {
	  deviceFunctions.turnOn();
	}

	@Override
	public void undo() {
	 deviceFunctions.turnOff();
	}

}
