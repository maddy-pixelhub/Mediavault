package service;

import model.StreamingRequest;
import java.util.PriorityQueue;
import java.util.Comparator;

public class StreamingService {
    private PriorityQueue<StreamingRequest> requestQueue;

    public StreamingService() {
        requestQueue = new PriorityQueue<>(new Comparator<StreamingRequest>() {
            @Override
            public int compare(StreamingRequest r1, StreamingRequest r2) {
                return Integer.compare(r1.getPriority(), r2.getPriority());
            }
        });
    }

    public void addRequest(StreamingRequest request) {
        requestQueue.offer(request);
        System.out.println("Streaming request added successfully.");
    }

    public void processRequest() {
        if (requestQueue.isEmpty()) {
            System.out.println("No streaming requests to process.");
        } else {
            StreamingRequest request = requestQueue.poll();
            System.out.println("Processing streaming request:");
            request.displayRequest();
        }
    }

    public void showNextRequest() {
        if (requestQueue.isEmpty()) {
            System.out.println("No pending streaming requests.");
        } else {
            System.out.println("Next streaming request:");
            requestQueue.peek().displayRequest();
        }
    }

    public void displayAllRequests() {
        if (requestQueue.isEmpty()) {
            System.out.println("No streaming requests available.");
        } else {
            System.out.println("All streaming requests:");
            for (StreamingRequest request : requestQueue) {
                request.displayRequest();
                System.out.println("--------------------");
            }
        }
    }
}