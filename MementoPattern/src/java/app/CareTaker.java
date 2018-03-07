package app;

import java.util.ArrayList;
import java.util.List;

public class CareTaker{

 private List<Memento> mementos = new ArrayList<>();

 public void addMemento(Memento memento){
	mementos.add(memento);
	 System.out.println("mementos().size() -> " + mementos.size());
 }

  public Memento getMemento( int index){
	  System.out.println("mementos().size() -> " + mementos.size());
  return mementos.get(index);
 }

}
