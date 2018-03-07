package apk;

import java.util.List;

class TurnOffAllDevices implements Command
{

	private List<DeviceFunctions> devices;
	
	public TurnOffAllDevices(List<DeviceFunctions> bunchOfDevices)
	{
	   this.devices = bunchOfDevices;
	}
	
	@Override
	public void execute() {
	  devices.forEach(device->device.turnOff());
	}

	@Override
	public void undo() {
	 devices.forEach(device->device.turnOn());
	}

}
