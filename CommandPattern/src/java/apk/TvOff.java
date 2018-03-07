package apk;

class TvOff implements Command
{

	private DeviceFunctions deviceFunctions;

	public TvOff(DeviceFunctions device)
	{
  	  this.deviceFunctions = device;
	}

	@Override
	public void execute() {
	   deviceFunctions.turnOff();
	}

	@Override
	public void undo() {
	  deviceFunctions.turnOn();
	}

}
