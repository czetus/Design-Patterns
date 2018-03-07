package apk;

class KartaWSrodku implements StanBankomatu
{

  private Bankomat bankomat;

  public KartaWSrodku(Bankomat bankomat)
  {
    this.bankomat = bankomat;
  }

	@Override
	public void pinWprowadz(int pin) {
	  	if(pin == 123456){

		 System.out.println("Poprawny Pin");
		 bankomat.setAktualnyStanBankomatu(bankomat.getPinWprowadzony());
		}else{
		 System.out.println("Bledny Pin");
		 bankomat.setAktualnyStanBankomatu(bankomat.getBrakKarty());
		}
	}

	@Override
	public void wlozKarte() {
	  System.out.println("Karta jest juz w srodku");
	}

	@Override
	public void wyplataGotowki(int kwota) {
	  System.out.println("Podaj Pin najpierw");
	}

	@Override
	public void wyciagnijKarte() {
		System.out.println("Karta wyciagnieta");

	}



}
