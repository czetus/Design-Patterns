package danes;

interface Subject
{
 public void notifyObserver();
 public void removeObserver(Observer observer);
 public void register(Observer observer);
}
