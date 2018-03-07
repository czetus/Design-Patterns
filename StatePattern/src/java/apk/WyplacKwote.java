package apk;

class WyplacKwote implements StanBankomatu
{
   private Bankomat bankomat;

	public WyplacKwote(Bankomat bankomat)
	{
	  this.bankomat = bankomat;
	}

	@Override
	public void pinWprowadz(int pin) {
	  System.out.println("Pin zostal juz wprowadzony");
	}

	@Override
	public void wlozKarte() {
	  System.out.println("Karta zostala juz wlozona");

	}

	@Override
	public void wyplataGotowki(int kwota) {
		if(bankomat.getAktualnyStanKonta() - kwota < 0){
			System.out.println("Brak funduszy na wykonanie tej operacji!");
			bankomat.setAktualnyStanBankomatu(bankomat.getBrakKarty());
		}else{
			System.out.println("Saldo przed wyplata = " + bankomat.getAktualnyStanKonta());
		    Double kwotaPoTransakcji = (bankomat.getAktualnyStanKonta() - Double.valueOf(kwota));
	              bankomat.setAktualnyStanKonta(kwotaPoTransakcji);
			System.out.println("Wyplacona kwota " + kwota + ", saldo = " + bankomat.getAktualnyStanKonta());
		      bankomat.setAktualnyStanBankomatu(bankomat.getBrakKarty());
		}

	}

	@Override
	public void wyciagnijKarte() {
	  System.out.println("Karta zostala wyjeta");
	  bankomat.setAktualnyStanBankomatu(bankomat.getWyciagnijKarte());
	}

}
