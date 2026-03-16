package service;

import model.Issue;

public class IssueService {
    private Issue[] issueList;
    private int size;

    public IssueService(int capacity) {
        issueList = new Issue[capacity];
        size = 0;
    }

    public void addIssue(Issue issue) {
        if (size < issueList.length) {
            issueList[size] = issue;
            size++;
            System.out.println("Issue added successfully.");
        } else {
            System.out.println("Issue list is full.");
        }
    }

    public void displayAllIssues() {
        if (size == 0) {
            System.out.println("No issues available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            issueList[i].displayIssue();
            System.out.println("--------------------");
        }
    }

    public Issue searchByIssueId(String issueId) {
        for (int i = 0; i < size; i++) {
            if (issueList[i].getIssueId().equalsIgnoreCase(issueId)) {
                return issueList[i];
            }
        }
        return null;
    }

    public void updateIssueStatus(String issueId, String newStatus) {
        Issue issue = searchByIssueId(issueId);
        if (issue != null) {
            issue.setStatus(newStatus);
            System.out.println("Issue status updated successfully.");
        } else {
            System.out.println("Issue not found.");
        }
    }
}