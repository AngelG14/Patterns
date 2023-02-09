package iteratorPattern;

import java.util.ArrayList;

class MusicIterator implements Iterator
{
    ArrayList<Song> songList;

    int pos;

    public MusicIterator(ArrayList<Song> songList)
    {
        this.songList = songList;
        this.pos = 0;
    }

    public Object next()
    {
        Song song =  songList.get(pos);
        pos += 1;
        return song;
    }

    public boolean hasNext()
    {
        if (pos >= songList.size() ||
                songList.get(pos) == null)
            return false;
        else
            return true;
    }

    public Object previous()
    {
        pos -= 1;
        Song song =  songList.get(pos);
        return song;
    }

    public boolean hasPrevious()
    {
        if (pos <= 0 ||
                songList.get(pos-1) == null)
            return false;
        else
            return true;
    }

}