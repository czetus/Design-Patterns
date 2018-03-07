package app;

interface Mediator{

	void saleOffer(int stock, String shares,int code);
	void buyOffer(int stock, String shares,int code);
	void addCollegaue(Colleague coll);
}
