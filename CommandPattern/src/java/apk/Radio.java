package apk;


class Radio implements DeviceFunctions
{
	private Integer soundVolume = 30;

	@Override
	public void turnOn() {
		System.out.println("Radio On");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio Off");

	}

	@Override
	public void volumeUP() {
		++soundVolume;
		System.out.println("Radio Volume UP " + soundVolume);

	}

	@Override
	public void volumeDOWN() {
		--soundVolume;
		System.out.println("Radio Volume DOWN " + soundVolume);

	}

}
