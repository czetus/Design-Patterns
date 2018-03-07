package app;

class DisckJockey
{
 private SongComposite songsCompsite;

	public DisckJockey(SongComposite ssComp)
	{
		this.songsCompsite = ssComp;
	}


	public void displaySongs()
	{
	  songsCompsite.displaySong();
	}


}
