package challenge.linkedlist;

public class Song {
    private String title;
    private double durationInSeconds;

    public Song(String title, double durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                '}';
    }


    public void playSong() {
        System.out.println("Playing " + title);
    }

    public String getTitle() {
        return title;
    }
}
