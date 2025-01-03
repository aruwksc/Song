public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Misfit", 159);
        Song song2 = new Song("Conversation", 181);
        Song song3 = new Song("Legends", 191);

        Artist artist1 = new Artist("Juice WRLD", "Hip-Hop/Rap");

        Song[] playlistSongs = { song1, song2, song3 };
        Playlist playlist1 = new Playlist("My Favorites", playlistSongs);

        artist1.displayInfo();
        playlist1.displayPlaylist();

        // Demonstrating overridden methods
        System.out.println("Overridden toString: " + song1.toString());
        System.out.println("Song1 equals Song2? " + song1.equals(song2));
        System.out.println("HashCode of Song1: " + song1.hashCode());
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

    @Override
    public String toString() {
        return "Artist{name='" + name + "', genre='" + genre + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name) && genre.equals(artist.genre);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + genre.hashCode();
    }
}

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

    @Override
    public String toString() {
        return "Song{title='" + title + "', duration=" + duration + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return duration == song.duration && title.equals(song.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + duration;
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

    @Override
    public String toString() {
        return "Playlist{playlistName='" + playlistName + "', songs=" + java.util.Arrays.toString(songs) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Playlist playlist = (Playlist) obj;
        return playlistName.equals(playlist.playlistName) && java.util.Arrays.equals(songs, playlist.songs);
    }

    @Override
    public int hashCode() {
        return playlistName.hashCode() + java.util.Arrays.hashCode(songs);
    }
}
