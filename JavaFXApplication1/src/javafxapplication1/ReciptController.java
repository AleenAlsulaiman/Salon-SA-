package javafxapplication1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ReciptController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        artist.setText(StaticValues.article);
        email.setText(StaticValues.email);
        service.setText(StaticValues.services);
        price.setText(String.valueOf(StaticValues.prix));
        phone.setText(StaticValues.phone);
        name.setText(StaticValues.name);
        time.setText(StaticValues.time);
        remise.setText(String.valueOf(StaticValues.priceAfter));
    }

    @FXML
    private TextField artist;

    @FXML
    private TextField email;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField price;

    @FXML
    private TextField service;

    @FXML
    private TextField time;

    @FXML
    private TextField remise;

    @FXML
    void exit(ActionEvent event) {
        Stage stage = (Stage) time.getScene().getWindow();
        stage.close();
    }
}
