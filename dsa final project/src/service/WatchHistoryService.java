package service;

import java.util.LinkedList;

public class WatchHistoryService {
    private LinkedList<String> watchHistory;

    public WatchHistoryService() {
        watchHistory = new LinkedList<>();
    }

    public void addToHistory(String contentTitle) {
        watchHistory.addFirst(contentTitle);
        System.out.println(contentTitle + " added to watch history.");
    }

    public void removeLastWatched() {
        if (watchHistory.isEmpty()) {
            System.out.println("Watch history is empty.");
        } else {
            String removed = watchHistory.removeFirst();
            System.out.println("Removed from watch history: " + removed);
        }
    }

    public void showLatestWatched() {
        if (watchHistory.isEmpty()) {
            System.out.println("No watch history available.");
        } else {
            System.out.println("Latest watched: " + watchHistory.getFirst());
        }
    }

    public void displayWatchHistory() {
        if (watchHistory.isEmpty()) {
            System.out.println("Watch history is empty.");
        } else {
            System.out.println("Watch History:");
            for (String content : watchHistory) {
                System.out.println(content);
            }
        }
    }
}