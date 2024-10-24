package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userController = UserController.getInstance();
    }

    @FXML
    private Label welcomeText;

    @FXML
    private Label lname;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtCode;

    @FXML
    private TextField txtScore;

    @FXML
    private UserController userController;

    private TableController tableController;

    public void setTableController(TableController tableController) {
        this.tableController = tableController;
    }


    @FXML
    public void registerUser(){
        String name = txtName.getText();
        String code = txtCode.getText();
        double score;

        try {
            score = Double.parseDouble(txtScore.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Invalid Score");
            alert.setContentText("Please enter a valid number for the score.");
            alert.showAndWait();
            return;
        }

        if (name.isEmpty() || code.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Incomplete Data");
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }


        userController.addUser(new User(name, code, score));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("User Registered");
        alert.setHeaderText("Success");
        alert.setContentText("User Registered Successfully");
        alert.showAndWait();

        welcomeText.setText(userController.toString());

        txtName.clear();
        txtCode.clear();
        txtScore.clear();
    }

}