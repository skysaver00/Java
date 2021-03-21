import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int track, LinkedList<Song> song) {
        Song check = this.songs.findSong(track);
        if(check != null) {
            song.add(check);
            return true;
        }
        System.out.println("This album does not have a track " + track);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> song) {
        Song checkSong = songs.findSong(title);
        if(checkSong != null) {
            song.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            } else {
                songs.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for(int i = 0; i < this.songs.size(); i++) {
                Song thatSong = songs.get(i);
                if(thatSong.getTitle().equals(title)) {
                    return thatSong;
                }
            } return null;
        }

        private Song findSong(int trackNumber) {
            int num = trackNumber - 1;
            if((num >= 0) && (num < songs.size())) {
                return songs.get(num);
            } return null;
        }
    }
}
