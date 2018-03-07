package danes;
import java.util.*;

class User implements Subject, Observer
{

	private String name;
	private Integer age;
	private Message message;
	
	private List<Observer> observers;




	/**
	 *
	 */
	public User(String name, Integer age)
       	{
		this.name = name;
		this.age = age;
		observers = new ArrayList<>();
	}
	



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
		notifyObserver();

	}

	@Override
	public void notifyObserver() {
			observers.stream().forEach(c->
					{
				System.out.println("Autorem wiadomosci jest " + this.name);  
							c.update(this.message);
					});
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);


	}

	@Override
	public void update(Message message) {
		System.out.println(message.getMessage() + " a moje imie to " + this.name);	
	}

}
