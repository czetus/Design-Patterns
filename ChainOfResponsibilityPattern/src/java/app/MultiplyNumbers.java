package app;


class MultiplyNumbers implements Chain
{

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
	  this.nextChain = nextChain;
	}

	@Override
	public void calculateNumbers(Numbers numbers) {
	  String request = numbers.getRequest();
	  int num1 = numbers.getNum1(); 
	  int num2 = numbers.getNum2();
	  
	  if(isProperOperation(request)){
	    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	  }else{
	    System.out.println("Dostepne tylko operacje add,sub,div,mul.");
	  }
	}

	private boolean isProperOperation(String request){
	  
		if(request.equals("mul"))
			return true;

	  return false;	
	}

}
