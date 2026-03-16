package model;

public class Issue {
    private String issueId;
    private String userId;
    private String issueType;
    private String status;

    public Issue(String issueId, String userId, String issueType, String status) {
        this.issueId = issueId;
        this.userId = userId;
        this.issueType = issueType;
        this.status = status;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayIssue() {
        System.out.println("Issue ID: " + issueId);
        System.out.println("User ID: " + userId);
        System.out.println("Issue Type: " + issueType);
        System.out.println("Status: " + status);
    }
}