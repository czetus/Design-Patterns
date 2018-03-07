package apk;

class KartaWyciagnieta implements StanBankomatu
{

   private Bankomat bankomat;

	public KartaWyciagnieta(Bankomat bankomat)
	{
	  this.bankomat = bankomat;
	}

	@Override
	public void pinWprowadz(int pin) {
	  System.out.println("Brak karty w automacie");
	}

	@Override
	public void wlozKarte() {
	  System.out.println("Podaj Pin");
	  bankomat.setAktualnyStanBankomatu(bankomat.getKartaWSrodku());


	}

	@Override
	public void wyplataGotowki(int kwota) {
	  System.out.println("Karta zostala wyciagnieta");
	}

	@Override
	public void wyciagnijKarte() {
	  System.out.println("Karty nie ma w bankomacie");
	}




}
