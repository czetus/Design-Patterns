package app;

class MainTest
{

	public static void main(String[] args)
	{
		BankFasade bankFasade = new BankFasade(123456789,0321);
		bankFasade.withdraw(50.50);
		bankFasade.withdraw(100d);
		bankFasade.deposite(999d); 

/*
		int x = 0;
		int y = 0;
		while(x <= 10){
		
		  while(y <= 10){
			System.out.format("%d,",y);
			y++;
		  }
		  x++;
		  y = 0;

		} */

	}


}
