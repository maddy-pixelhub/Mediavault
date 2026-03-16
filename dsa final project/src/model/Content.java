package model;

public class Content {
    private String contentId;
    private String title;
    private String type;
    private String genre;
    private double rating;
    private int views;
    private Episode[] episodes;

    public Content(String contentId, String title, String type, String genre, double rating, int views) {
        this(contentId, title, type, genre, rating, views, null);
    }

    public Content(String contentId, String title, String type, String genre, double rating, int views, Episode[] episodes) {
        this.contentId = contentId;
        this.title = title;
        this.type = type;
        this.genre = genre;
        this.rating = rating;
        this.views = views;
        this.episodes = episodes;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Episode[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episode[] episodes) {
        this.episodes = episodes;
    }

    public void increaseViews() {
        views++;
    }

    public void displayContent() {
        System.out.println("Content ID: " + contentId);
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Views: " + views);

        if (episodes != null && episodes.length > 0) {
            System.out.println("Episodes:");
            for (Episode episode : episodes) {
                System.out.println("  Episode " + episode.getEpisodeNumber() + ": "
                        + episode.getTitle() + " (" + episode.getDuration() + " mins)");
            }
        }
    }
}
