package util;

public class CircularBuffer {
    private String[] buffer;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addToBuffer(String content) {
        if (size == capacity) {
            System.out.println("Buffer is full. Overwriting oldest content.");
            front = (front + 1) % capacity;
            size--;
        }

        rear = (rear + 1) % capacity;
        buffer[rear] = content;
        size++;
        System.out.println(content + " added to playback buffer.");
    }

    public void playNext() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        String current = buffer[front];
        System.out.println("Playing: " + current);
        front = (front + 1) % capacity;
        size--;
    }

    public void showBuffer() {
        if (size == 0) {
            System.out.println("Buffer is empty.");
            return;
        }

        System.out.println("Current Buffer:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println(buffer[index]);
        }
    }
}