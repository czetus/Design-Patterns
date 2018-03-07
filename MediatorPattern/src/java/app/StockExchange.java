package app;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements Mediator{

	private List<StockOffer> buys;
	private List<StockOffer> sells;
	private List<Colleague> colleagues;

	public StockExchange(){
	  buys = new ArrayList<>();
	  sells = new ArrayList<>();
	  colleagues = new ArrayList<>();
	}

	@Override
	public void saleOffer(int stock, String shares, int code) {
	  boolean isSold = false;
	  buys.stream().filter(offer->offer.getShares().equals(shares) && offer.getStock() == stock)
		       .forEach(ord->System.out.println(stock + " stock of:w
					       :q
					       "))
	}

	@Override
	public void buyOffer(int stock, String shares, int code) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCollegaue(Colleague coll) {
		// TODO Auto-generated method stub

	}

}
