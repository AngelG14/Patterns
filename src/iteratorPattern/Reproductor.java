package iteratorPattern;

public class Reproductor
{
    Playlist songs;
    Iterator iterator;

    public Reproductor(Playlist songs)
    {
        this.songs = songs;
        this.iterator = songs.createIterator();
    }

    public void playSongs()
    {
        System.out.println("\nReproduciendo");
        while (iterator.hasNext())
        {
            Song n = (Song)iterator.next();
            System.out.println(n.getSong());
        }
    }

    public void playSongsReverseOrder(){
        System.out.println("\nReproduciendo en reversa");
        while (iterator.hasPrevious())
        {
            Song n = (Song)iterator.previous();
            System.out.println(n.getSong());
        }
    }

}
