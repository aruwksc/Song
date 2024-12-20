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
