package model;

public class StreamingRequest {
    private String requestId;
    private String userId;
    private String contentId;
    private String subscriptionType;
    private int priority;

    public StreamingRequest(String requestId, String userId, String contentId, String subscriptionType) {
        this.requestId = requestId;
        this.userId = userId;
        this.contentId = contentId;
        this.subscriptionType = subscriptionType;
        this.priority = subscriptionType.equalsIgnoreCase("Premium") ? 1 : 2;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getUserId() {
        return userId;
    }

    public String getContentId() {
        return contentId;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public int getPriority() {
        return priority;
    }

    public void displayRequest() {
        System.out.println("Request ID: " + requestId);
        System.out.println("User ID: " + userId);
        System.out.println("Content ID: " + contentId);
        System.out.println("Subscription Type: " + subscriptionType);
        System.out.println("Priority: " + priority);
    }
}