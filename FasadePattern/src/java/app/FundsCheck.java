package app;

class FundsCheck
{
	private Double saldo = 600.00;


	public Double getCashInAccount(){ return saldo;}

	private boolean haveEnoughMoney(Double amountToGet)
	{
		if(amountToGet > getCashInAccount())
		{
			return false;
		}

		return true;
	}

	public Double depositeAmount(Double amountToDeposite)
	{
		saldo += amountToDeposite;
	 return amountToDeposite;
	}

	public Double getMoneyFromAccount(Double amountToGet)
	{
	  if(haveEnoughMoney(amountToGet))
	  {
		saldo -= amountToGet;
		return amountToGet;
	  }
	  return 0.00;
	}	
}
