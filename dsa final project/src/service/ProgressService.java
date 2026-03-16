package service;

import model.Progress;

public class ProgressService {
    private Progress[] progressList;
    private int size;

    public ProgressService(int capacity) {
        progressList = new Progress[capacity];
        size = 0;
    }

    public void addProgress(Progress progress) {
        if (size < progressList.length) {
            progressList[size] = progress;
            size++;
            System.out.println("Progress added successfully.");
        } else {
            System.out.println("Progress list is full.");
        }
    }

    public void displayAllProgress() {
        if (size == 0) {
            System.out.println("No progress records available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            progressList[i].displayProgress();
            System.out.println("----------------------");
        }
    }

    public Progress searchByContentId(String contentId) {
        for (int i = 0; i < size; i++) {
            if (progressList[i].getContentId().equalsIgnoreCase(contentId)) {
                return progressList[i];
            }
        }
        return null;
    }

    public void updateWatchedDuration(String contentId, int watchedDuration) {
        Progress progress = searchByContentId(contentId);
        if (progress != null) {
            progress.setWatchedDuration(watchedDuration);
            System.out.println("Watched duration updated successfully.");
        } else {
            System.out.println("Content progress not found.");
        }
    }

    public void showProgressByContentId(String contentId) {
        Progress progress = searchByContentId(contentId);
        if (progress != null) {
            progress.displayProgress();
        } else {
            System.out.println("Content progress not found.");
        }
    }
}