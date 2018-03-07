package apk.proxy;

import apk.*;

public class BankomatProxy implements BankomatData{

	@Override
	public StanBankomatu getData() {
		Bankomat bankomat = new Bankomat();

		return bankomat.getAktualnyStanBankomatu();
	}

	@Override
	public int pokazGotowkeWBankomacie() {
		Bankomat bankomat = new Bankomat();
		return bankomat.getAktualnyStanKonta();
	}

}
