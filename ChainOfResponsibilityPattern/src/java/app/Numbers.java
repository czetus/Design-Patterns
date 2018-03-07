package app;

class Numbers{

	private int num1;
	private int num2;

	private String request;

	public Numbers(int n1, int n2, String cmd){
	 this.num1 = n1;
	 this.num2 = n2;
	 this.request = cmd;
	}

	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}

}
