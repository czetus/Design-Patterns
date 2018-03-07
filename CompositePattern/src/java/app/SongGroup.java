package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SongGroup extends SongComposite
{
	private String groupName;
	private String description;
	private List<SongComposite> songs = new ArrayList<>();

	public SongGroup(String groupName, String description)
	{
	  this.groupName = groupName;
	  this.description = description;
	}

	public String getGrouoName() { return groupName;};
	public String getDescription() { return description;};

	public void add(SongComposite song)
	{
	 this.songs.add(song);
	}

	public void displaySong() 
	{
		System.out.println("Katalog: " + getGrouoName() + ", Opis: " + getDescription());
		Iterator<SongComposite> iterator = songs.iterator();
		while(iterator.hasNext())
		{
		 SongComposite song = iterator.next();
			song.displaySong();
		}
	}

	public void remove(SongComposite song)
	{
	 this.songs.remove(song);
	}

}
