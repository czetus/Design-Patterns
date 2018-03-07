package app;

class Song extends SongComposite
{
	private String songName;
	private String bandName;

	public Song(String songName,String bandName)
	{
	  this.songName = songName;
	  this.bandName = bandName;
	}

	public String getBandName() {return bandName;};
	public String getSngName() {return songName;};

	public void displaySong() {System.out.println(getSngName() + " " + getBandName());};
}
