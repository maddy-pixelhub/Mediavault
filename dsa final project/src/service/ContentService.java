package service;

import model.Content;
import model.Episode;

public class ContentService {
    private Content[] contentList;
    private int size;

    public ContentService(int capacity) {
        contentList = new Content[capacity];
        size = 0;
    }

    public void addContent(Content content) {
        if (size < contentList.length) {
            contentList[size] = content;
            size++;
            System.out.println("Content added successfully.");
        } else {
            System.out.println("Content library is full.");
        }
    }

    public void displayAllContent() {
        if (size == 0) {
            System.out.println("No content available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            contentList[i].displayContent();
            System.out.println("--------------------");
        }
    }

    public Content searchById(String contentId) {
        for (int i = 0; i < size; i++) {
            if (contentList[i].getContentId().equalsIgnoreCase(contentId)) {
                return contentList[i];
            }
        }
        return null;
    }

    public void sortByViews() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (contentList[j].getViews() < contentList[j + 1].getViews()) {
                    Content temp = contentList[j];
                    contentList[j] = contentList[j + 1];
                    contentList[j + 1] = temp;
                }
            }
        }
        System.out.println("Content sorted by views.");
    }

    public void sortByRating() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (contentList[j].getRating() < contentList[j + 1].getRating()) {
                    Content temp = contentList[j];
                    contentList[j] = contentList[j + 1];
                    contentList[j + 1] = temp;
                }
            }
        }
        System.out.println("Content sorted by rating.");
    }

    public void loadPredefinedContent() {
        addContentSilently(new Content("MOV101", "HiNanna", "Movie", "romance", 8.8, 2450));
        addContentSilently(new Content("MOV102", "OG", "Movie", "Action", 8.7, 2310));
        addContentSilently(new Content("MOV103", "Varanasi", "Movie", "Action", 9.0, 2890));

        Episode[] strangerThingsEpisodes = {
            new Episode("EP201", "Chapter One: The Vanishing of Will Byers", 49, 1),
            new Episode("EP202", "Chapter Two", 56, 2),
            new Episode("EP203", "Chapter Three", 52, 3)
        };

        Episode[] breakingBadEpisodes = {
            new Episode("EP301", "Pilot", 58, 1),
            new Episode("EP302", "Cat's in the Bag...", 48, 2),
            new Episode("EP303", "...And the Bag's in the River", 48, 3)
        };

        addContentSilently(new Content("SER201", "Stranger Things", "Series", "Sci-Fi Thriller", 8.7, 3200,
                strangerThingsEpisodes));
        addContentSilently(new Content("SER202", "Breaking Bad", "Series", "Crime Drama", 9.5, 4100,
                breakingBadEpisodes));
    }

    private void addContentSilently(Content content) {
        if (size < contentList.length) {
            contentList[size] = content;
            size++;
        }
    }
}
