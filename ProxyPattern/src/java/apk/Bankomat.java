package apk;
import apk.proxy.*;
public class Bankomat implements BankomatData
{
	private StanBankomatu pinWprowadzony;
	private StanBankomatu wyplataGotowki;
	private StanBankomatu brakKarty;
	private StanBankomatu kartaWSrodku; 

	private StanBankomatu aktualnyStanBankomatu;

	private int aktualnyStanKonta = 2500;



	public Bankomat()
	{
	 kartaWSrodku = new KartaWSrodku(this); 
	 pinWprowadzony = new PinWprowadzony(this);
	 wyplataGotowki = new WyplacKwote(this);
	 brakKarty = new KartaWyciagnieta(this);

	 aktualnyStanBankomatu = brakKarty;	 
	}


	public void wlozKarte(){
	 this.aktualnyStanBankomatu.wlozKarte();

	}
	public void wpiszPin(int pin){
	 this.aktualnyStanBankomatu.pinWprowadz(pin);
	}

	public void wyplacGotwke(int kwota){
	 this.aktualnyStanBankomatu.wyplataGotowki(kwota);
	}
/*
	public void wyjmijKarte(){
         this.aktualnyStanBankomatu.wyciagnijKarte();
	}
*/
	/**
	 * @return the pinWprowadzony
	 */
	public StanBankomatu getPinWprowadzony() {
		return pinWprowadzony;
	}

	/**
	 * @param pinWprowadzony the pinWprowadzony to set
	 */
	public void setPinWprowadzony(StanBankomatu pinWprowadzony) {
		this.pinWprowadzony = pinWprowadzony;
	}

	/**
	 * @return the wyplataGotowki
	 */
	public StanBankomatu getWyplataGotowki() {
		return wyplataGotowki;
	}

	/**
	 * @param wyplataGotowki the wyplataGotowki to set
	 */
	public void setWyplataGotowki(StanBankomatu wyplataGotowki) {
		this.wyplataGotowki = wyplataGotowki;
	}

	/**
	 * @return the brakKarty
	 */
	public StanBankomatu getBrakKarty() {
		return brakKarty;
	}

	/**
	 * @param brakKarty the brakKarty to set
	 */
	public void setBrakKarty(StanBankomatu brakKarty) {
		this.brakKarty = brakKarty;
	}


	/**
	 * @return the kartaWSrodku
	 */
	public StanBankomatu getKartaWSrodku() {
		return kartaWSrodku;
	}

	/**
	 * @param kartaWSrodku the kartaWSrodku to set
	 */
	public void setKartaWSrodku(StanBankomatu kartaWSrodku) {
		this.kartaWSrodku = kartaWSrodku;
	}

	/**
	 * @return the aktualnyStanBankomatu
	 */
	public StanBankomatu getAktualnyStanBankomatu() {
		return aktualnyStanBankomatu;
	}

	/**
	 * @param aktualnyStanBankomatu the aktualnyStanBankomatu to set
	 */
	public void setAktualnyStanBankomatu(StanBankomatu aktualnyStanBankomatu) {
		this.aktualnyStanBankomatu = aktualnyStanBankomatu;
	}

	/**
	 * @return the aktualnyStanKonta
	 */
	public int getAktualnyStanKonta() {
		return aktualnyStanKonta;
	}

	/**
	 * @param aktualnyStanKonta the aktualnyStanKonta to set
	 */
	public void setAktualnyStanKonta(int aktualnyStanKonta) {
		this.aktualnyStanKonta = aktualnyStanKonta;
	}

	@Override
	public StanBankomatu getData() {
		return getAktualnyStanBankomatu();
	}

	@Override
	public int pokazGotowkeWBankomacie() {
		return getAktualnyStanKonta(); 
	}

}
