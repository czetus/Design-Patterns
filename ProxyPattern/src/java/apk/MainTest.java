package apk;
import apk.proxy.*;

class MainTest
{
	public static void main(String[] args)
	{
	  Bankomat bankomat = new Bankomat();
	  bankomat.wlozKarte();
	  bankomat.wpiszPin(123456);
	  bankomat.wyplacGotwke(1000);

	  bankomat.wlozKarte();
	  bankomat.wpiszPin(123456);
	  bankomat.wyplacGotwke(1600);
System.out.println("------------\n");
	BankomatData b1 = new Bankomat();
	BankomatData b2 = new BankomatProxy();

	System.out.println(b1.pokazGotowkeWBankomacie());
	b1.getData().wlozKarte();
	b1.getData().pinWprowadz(123456);
	b1.getData().wyplataGotowki(100);

	}

}
