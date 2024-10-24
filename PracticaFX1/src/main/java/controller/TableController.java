package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.User;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class TableController {

    @FXML
    private Label LabelCode;

    @FXML
    private Label labelScore;

    @FXML
    private TableColumn<User, String> TableName;

    @FXML
    private TableColumn<User, Double> TableScore;

    @FXML
    private Button RegisterButtom;

    @FXML
    private TextField txtScore;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtCode;

    @FXML
    private TableColumn<User, String> TableCode;

    @FXML
    private HBox HboxNam;

    @FXML
    private Label labelName;

    @FXML
    private TableView<User> TableView1;

    private final ObservableList<User> userList = FXCollections.observableArrayList();

    public void addUser() {
        String name = txtName.getText();
        String code = txtCode.getText();
        Double score = Double.parseDouble(txtScore.getText());

        UserController.getInstance().addUser(new User(name,code, score));
        txtName.setText("");
        txtCode.setText("");
        txtScore.setText("");
    }



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
