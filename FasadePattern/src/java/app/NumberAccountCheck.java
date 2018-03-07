package app;

class NumberAccountCheck
{
	private Integer numberAccount;

	/**
	 *
	 */
	public NumberAccountCheck(Integer numberAccount) 
	{
		this.numberAccount = numberAccount;
	}


	public boolean isCorrect()
	{
	  if(numberAccount.equals(123456789))
	  {
		return true;
	  }
		return false;
	  	  
	}	


}
