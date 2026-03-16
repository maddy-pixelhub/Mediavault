package service;

import model.User;

public class UserService {
    private User[] userList;
    private int size;

    public UserService(int capacity) {
        userList = new User[capacity];
        size = 0;
    }

    public void addUser(User user) {
        if (size < userList.length) {
            userList[size] = user;
            size++;
            System.out.println("User added successfully.");
        } else {
            System.out.println("User list is full.");
        }
    }

    public void displayAllUsers() {
        if (size == 0) {
            System.out.println("No users available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            userList[i].displayUser();
            System.out.println("--------------------");
        }
    }

    public User searchByUserId(String userId) {
        for (int i = 0; i < size; i++) {
            if (userList[i].getUserId().equalsIgnoreCase(userId)) {
                return userList[i];
            }
        }
        return null;
    }

    public void updateSubscription(String userId, String newSubscription) {
        User user = searchByUserId(userId);
        if (user != null) {
            user.setSubscriptionType(newSubscription);
            System.out.println("Subscription updated successfully.");
        } else {
            System.out.println("User not found.");
        }
    }
}