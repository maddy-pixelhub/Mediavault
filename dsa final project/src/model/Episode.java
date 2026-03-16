package model;

public class Episode {
    private String episodeId;
    private String title;
    private int duration;
    private int episodeNumber;

    public Episode(String episodeId, String title, int duration, int episodeNumber) {
        this.episodeId = episodeId;
        this.title = title;
        this.duration = duration;
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void displayEpisode() {
        System.out.println("Episode ID: " + episodeId);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Episode Number: " + episodeNumber);
    }
}