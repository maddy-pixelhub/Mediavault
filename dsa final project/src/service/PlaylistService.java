package service;

import java.util.Stack;

public class PlaylistService {
    private Stack<String> playlistEdits;

    public PlaylistService() {
        playlistEdits = new Stack<>();
    }

    public void addEdit(String action) {
        playlistEdits.push(action);
        System.out.println("Playlist action added: " + action);
    }

    public void undoLastEdit() {
        if (playlistEdits.isEmpty()) {
            System.out.println("No playlist edits to undo.");
        } else {
            String lastAction = playlistEdits.pop();
            System.out.println("Undone action: " + lastAction);
        }
    }

    public void showLastEdit() {
        if (playlistEdits.isEmpty()) {
            System.out.println("No playlist edits available.");
        } else {
            System.out.println("Last edit: " + playlistEdits.peek());
        }
    }

    public void displayAllEdits() {
        if (playlistEdits.isEmpty()) {
            System.out.println("No playlist edit history.");
        } else {
            System.out.println("Playlist Edit History:");
            for (int i = playlistEdits.size() - 1; i >= 0; i--) {
                System.out.println(playlistEdits.get(i));
            }
        }
    }
}