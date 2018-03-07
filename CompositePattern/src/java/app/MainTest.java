package app;

public class MainTest
{


	public static void main(String args[])
	{
		SongComposite mainFolder = new SongGroup("Katalog Glowny","Glowny katalog");
		SongComposite disco = new SongGroup("Disco Polo","Disco polo RELAX");
		SongComposite blues = new SongGroup("Blues","Bluesowe piosenki");

		Song s1 = new Song("Song name1", "bad Band Name");
		Song s2 = new Song("Laries Cold", "bad Band Name 1");
		Song s3 = new Song("Muslim Jam", "bad Band Name 2 ");
		Song s4 = new Song("Cultis Rulins", "bad Band Name 3 ");
		Song s5 = new Song("Mono Mako", "bad Band Name 4 ");

		mainFolder.add(disco);
		mainFolder.add(blues);
		disco.add(s1); disco.add(s2);
		blues.add(s3); blues.add(s4);
		blues.add(s5);


		DisckJockey larry = new DisckJockey(mainFolder);
		larry.displaySongs();		
	}
}
