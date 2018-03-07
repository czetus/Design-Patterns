package apk;

class PinWprowadzony implements StanBankomatu
{

	private Bankomat bankomat;

	public PinWprowadzony(Bankomat bankomat) {
		this.bankomat = bankomat;
	}

	@Override
	public void pinWprowadz(int pin) {
		 System.out.println("Pin zostal juz wprowadzony");
	}

	@Override
	public void wlozKarte() {
	  System.out.println("Karta jest juz w srodku");
	}

	@Override
	public void wyplataGotowki(int kwota) {

		if(bankomat.getAktualnyStanKonta() - kwota < 0){
			System.out.println("Brak funduszy na wykonanie tej operacji!");
			bankomat.setAktualnyStanBankomatu(bankomat.getBrakKarty());
		}else{
			System.out.println("Saldo przed transakcja = " + bankomat.getAktualnyStanKonta());
		    int kwotaPoTransakcji = bankomat.getAktualnyStanKonta() - kwota;
	              bankomat.setAktualnyStanKonta(kwotaPoTransakcji);
			System.out.println("Wyplacona kwota " + kwota + ",saldo po transkacji = " + bankomat.getAktualnyStanKonta());
		      bankomat.setAktualnyStanBankomatu(bankomat.getBrakKarty());
		} 
	}

	@Override
	public void wyciagnijKarte() {
		System.out.println("Karta wyciagnieta");

	}

}
