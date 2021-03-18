import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else return false;
    }

    private Song findSong(String title) {
        for(int i = 0 ; i < this.songs.size(); i++) {
            Song thatSong = this.songs.get(i);
            if(thatSong.getTitle().equals(title)) {
                return thatSong;
            }
        } return null;
    }

    public boolean addToPlayList(int track, List<Song> song) {
        int num = track - 1;
        if((num >= 0) && (num <= this.songs.size())) {
            song.add(this.songs.get(num));
            return true;
        }
        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> song) {
        Song checkSong = findSong(title);
        if(checkSong != null) {
            song.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
