package service;

import java.util.Stack;

public class NavigationService {
    private Stack<String> navigationHistory;

    public NavigationService() {
        navigationHistory = new Stack<>();
    }

    public void visitPage(String page) {
        navigationHistory.push(page);
        System.out.println(page + " visited.");
    }

    public void goBack() {
        if (navigationHistory.isEmpty()) {
            System.out.println("No navigation history available.");
        } else {
            String removedPage = navigationHistory.pop();
            System.out.println("Went back from: " + removedPage);
        }
    }

    public void showCurrentPage() {
        if (navigationHistory.isEmpty()) {
            System.out.println("No current page.");
        } else {
            System.out.println("Current page: " + navigationHistory.peek());
        }
    }

    public void displayHistory() {
        if (navigationHistory.isEmpty()) {
            System.out.println("Navigation history is empty.");
        } else {
            System.out.println("Navigation History:");
            for (int i = navigationHistory.size() - 1; i >= 0; i--) {
                System.out.println(navigationHistory.get(i));
            }
        }
    }
}