package apk;
import java.util.Arrays;
import java.util.LinkedList;
class MainTest
{

  public static void main(String[] args)
  {

        DeviceFunctions tv = new TVReceiver();
	Command tvOff = new TvOff(tv);  
	RemoteDevice remoteDevice = new RemoteDevice(tvOff);

	remoteDevice.press();
	
	Command tvOn = new TvOn(tv);
	remoteDevice = new RemoteDevice(tvOn);
	remoteDevice.press();
 
	Command tvVolumeUp = new TvVolumeUP(tv);
        remoteDevice = new RemoteDevice(tvVolumeUp);
	remoteDevice.press();
	remoteDevice.press();
	remoteDevice.repeatLastInvoke();
	remoteDevice.press();
remoteDevice.repeatLastInvoke();
	remoteDevice.repeatLastInvoke();

	remoteDevice = new RemoteDevice(new TvVolumeDown(tv));
	remoteDevice.press();
		remoteDevice.repeatLastInvoke();
remoteDevice.repeatLastInvoke();


	DeviceFunctions tv2 = new TVReceiver();
	DeviceFunctions radio = new Radio();

	Command on = new TvOn(tv2);
	Command radioOn = new TvOn(radio);

	RemoteDevice pilot = new RemoteDevice(on);
	RemoteDevice pilot2 = new RemoteDevice(radioOn);

	pilot.press();
	pilot2.press();
/*
	Command turnAllOff = new TurnOffAllDevices(Arrays.asList(new DeviceFunctions[]{tv2,radio}));

	RemoteDevice universalPilot = new RemoteDevice(turnAllOff);

	universalPilot.press();
*/
	LinkedList<Command> listOfCommends = new LinkedList<>();
	listOfCommends.addFirst(on);
	listOfCommends.addFirst(radioOn);
	listOfCommends.addFirst(tvOff);
	listOfCommends.addFirst(tvOn);
	listOfCommends.addFirst(tvVolumeUp);

	listOfCommends.forEach(cmd->
			{
			cmd.undo();	
			});

  }

}
