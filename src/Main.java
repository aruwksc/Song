class Song {
    private String title;
    private int duration; // Duration in seconds

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getter and Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public void displayInfo() {
        System.out.println("Song: " + title + ", Duration: " + duration + " seconds");
    }
}

class Artist {
    private String name;
    private String genre;

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    // Getter and Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public void displayInfo() {
        System.out.println("Artist: " + name + ", Genre: " + genre);
    }
}

class Playlist {
    private String playlistName;
    private Song[] songs;

    public Playlist(String playlistName, Song[] songs) {
        this.playlistName = playlistName;
        this.songs = songs;
    }

    // Getter and Setter
    public String getPlaylistName() { return playlistName; }
    public void setPlaylistName(String playlistName) { this.playlistName = playlistName; }

    public void displayPlaylist() {
        System.out.println("Playlist: " + playlistName);
        for (Song song : songs) {
            song.displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Misfit", 159);
        Song song2 = new Song("Connversation", 181);
        Song song3 = new Song("Legends", 191);


        Artist artist1 = new Artist("Juice WRLD", "Hip-Hop/Rap");


        Song[] playlistSongs = { song1, song2, song3 };
        Playlist playlist1 = new Playlist("My Favorites", playlistSongs);


        artist1.displayInfo();
        playlist1.displayPlaylist();
    }
}
