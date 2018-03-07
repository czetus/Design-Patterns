package app;

class BankFasade
{

 private PinAccountCheck pinChecker;
 private NumberAccountCheck accountChecker;
 private FundsCheck fundsChecker;
 private BankABC bank;
 private Integer accountNumber;
 private Integer pinNumber;

 public BankFasade(Integer accountNumber, Integer pin)
 {
	this.accountNumber = accountNumber;
	this.pinNumber = pin;

	bank = new BankABC();

	pinChecker = new PinAccountCheck(pin);
	accountChecker = new NumberAccountCheck(accountNumber);
	fundsChecker = new FundsCheck();
 }

 private boolean isPinAndAccountNumberCorrect(){
	return pinChecker.isCorrect() && accountChecker.isCorrect();	
 }

 public void withdraw(Double amount)
 {
	if(isPinAndAccountNumberCorrect() )
	{
	System.out.println("Operacja powiodla sie");
	System.out.println("Slado poczatkowe ["+ fundsChecker.getCashInAccount() +"]\n, Wyplacone zostalo " + fundsChecker.getMoneyFromAccount(amount) + ", saldo na koncie wynosi " + fundsChecker.getCashInAccount());
	}else{
 	System.out.println("Operacja nie powidola sie");	
	}

 }

 public void deposite(Double amount)
 {
  if(isPinAndAccountNumberCorrect())
  {
	  System.out.println("Operacja powiodla sie");
	  System.out.println("Slado poczatkowe ["+ fundsChecker.getCashInAccount() +"]\n, Wplacone zostalo " + fundsChecker.depositeAmount(amount) + ", saldo na koncie wynosi " + fundsChecker.getCashInAccount());

  }else{
 	  System.out.println("Operacja nie powidola sie");	
  }
 }

}
