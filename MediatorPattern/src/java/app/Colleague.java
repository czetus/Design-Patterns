package app;

public abstract class Colleague{

private Mediator mediator;
	
        public Colleague(Mediator mediator){
	  this.mediator = mediator;
	  mediator.addCollegaue(this);;
	}



	public void salleOffer(int stock, String shares, int ColCode){
	  mediator.saleOffer(stock,shares,ColCode);
	}

	public void buyOffer(int stock, String shares,int ColCode){
	  mediator.buyOffer(stock,shares,ColCode);
	}	
}


