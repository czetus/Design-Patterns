package app;

class MainTest{

	public static void main(String[] args){
	
		Numbers numbers = new Numbers(11,4,"ml");
		Chain add = new AddNumbers();
		Chain sub = new SubtractNumbers();
		Chain div  = new DivideNumbers();
		Chain mul  = new MultiplyNumbers();
		add.setNextChain(sub);
		sub.setNextChain(div);
		div.setNextChain(mul);

		add.calculateNumbers(numbers);
	}
}
