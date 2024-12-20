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
