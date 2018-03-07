package apk;


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
	}

}
