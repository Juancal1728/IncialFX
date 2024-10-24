package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.User;

public class TableController {

    @FXML
    private TableView<User> userTableView;

    @FXML
    private TableColumn<User, String> nameColumn;

    @FXML
    private TableColumn<User, String> codeColumn;

    @FXML
    private TableColumn<User, Double> scoreColumn;

    private final ObservableList<User> userList = FXCollections.observableArrayList();

    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
        codeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));

        userTableView.setItems(userList);
    }

    public void addUserToTable(User user) {
        userList.add(user);
    }

    public void loadUsers(ObservableList<User> users) {
        userList.setAll(users);
    }
}
