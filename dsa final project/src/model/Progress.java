package model;

public class Progress {
    private String contentId;
    private String title;
    private int totalDuration;
    private int watchedDuration;

    public Progress(String contentId, String title, int totalDuration, int watchedDuration) {
        this.contentId = contentId;
        this.title = title;
        this.totalDuration = totalDuration;
        this.watchedDuration = watchedDuration;
    }

    public String getContentId() {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public int getWatchedDuration() {
        return watchedDuration;
    }

    public void setWatchedDuration(int watchedDuration) {
        this.watchedDuration = watchedDuration;
    }

    public int getRemainingDuration() {
        return totalDuration - watchedDuration;
    }

    public double getCompletionPercentage() {
        return ((double) watchedDuration / totalDuration) * 100;
    }

    public void displayProgress() {
        System.out.println("Content ID: " + contentId);
        System.out.println("Title: " + title);
        System.out.println("Total Duration: " + totalDuration + " mins");
        System.out.println("Watched Duration: " + watchedDuration + " mins");
        System.out.println("Remaining Duration: " + getRemainingDuration() + " mins");
        System.out.printf("Completion: %.2f%%\n", getCompletionPercentage());
    }
}