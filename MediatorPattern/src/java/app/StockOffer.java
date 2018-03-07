package app;

public class StockOffer{


  private int collCode;
  private int stock;
  private String shares;


	public StockOffer(int stock, String shares, int coll){
	 this.collCode = coll;
	 this. stock = stock;
	 this. shares = shares;
	}

	/**
	 * @return the collCode
	 */
	public int getCollCode() {
		return collCode;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @return the shares
	 */
	public String getShares() {
		return shares;
	}

}
