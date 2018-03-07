package apk;
import java.util.*;
class RemoteDevice 
{

	private Command command;
	private LinkedList<Command> commandsInvoked = new LinkedList<>();

	public RemoteDevice(Command command)
	{
	  this.command = command;
	}

	public void press(){
		commandsInvoked.add(command);
	   command.execute();
	}

	public void pressUndo()
	{
	  command.undo();
	}
	public void repeatLastInvoke()
	{
	  Command cmd =	 commandsInvoked.poll();

	  if(cmd != null)
	    cmd.execute();

	}



}
