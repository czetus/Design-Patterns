package app.test;

class MyObj{

	public boolean equals(Object obj) { return true;}

	public int hashCode() {return str.length();}
	
	private String str;

	public MyObj(String message)
	{
	 this.str = message;
	}


      public String toString(){
	  return "here in String " + str;
	}

}
