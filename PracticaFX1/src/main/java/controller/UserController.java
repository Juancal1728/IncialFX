package controller;

import javafx.collections.FXCollections;
import model.User;
import javafx.collections.ObservableList;

public class UserController {
    private static UserController instance;
    private final ObservableList<User> users;

    public UserController() {
        this.users = FXCollections.observableArrayList();
    }

    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }
    public ObservableList<User> getUsers() {
        return users;

    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();
        for (User user : users) {
            msg.append(user.toString()).append("\n");
        }
        return msg.toString();
    }

}
