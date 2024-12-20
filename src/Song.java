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