package iteratorPattern;

import java.util.ArrayList;

public class Playlist implements Collection
{
    ArrayList<Song> songList;

    public Playlist()
    {
        songList = new ArrayList<Song>();

    }

    public void addItem(String str)
    {
        Song song = new Song(str);
        songList.add(song);
    }

    public Iterator createIterator()
    {
        return new MusicIterator(songList);
    }
}
