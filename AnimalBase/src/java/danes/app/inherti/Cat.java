package danes.app.inherti;


class Cat extends Animal
{


	public Cat(String name)
	{
         super(name);
	 setSound("Miauu!");

	}

	public enum ATTACK_TYPE
	{
	 AGGRESIVE("Furia"),
	 CUTE("Kicia");
	 private String name;

	  ATTACK_TYPE(String n)
	 {
		 this.name = n;
	 }
	 public String getName()
	 {
		return  this.name;
	 }
	}	

	public void attack(){
	 System.out.println(Cat.this.getName() + " atakuje w stylu " + ATTACK_TYPE.CUTE.getName());
	}

}
