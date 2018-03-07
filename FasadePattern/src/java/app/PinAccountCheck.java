package app;

class PinAccountCheck
{

	private Integer pin;
	/**
	 *
	 */
	public PinAccountCheck(Integer pinNumber) {
		this.pin = pinNumber;
	}

	public boolean isCorrect()
	{
	  if(pin.equals(0321))
	  {
		System.out.println("Pin konta jest poprawny");
		return true;
	  }
		System.out.println("Pin jest bledny");
		return false;
	  	  
	}	
}
