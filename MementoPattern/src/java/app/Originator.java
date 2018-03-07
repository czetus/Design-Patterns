package app;

class Originator{

	private String article;

	public void setArticle(String article){
	 this.article = article; 
	}

	public Memento createMemento(){
	 System.out.println("Dodaje nowy Memento " + article);	
	  return new Memento(article);
	}

	public String restoreMemento(Memento memento){
	  return this.article = memento.getArticle();
	}
}
