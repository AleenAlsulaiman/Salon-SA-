package javafxapplication1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void booking(ActionEvent event) {
//FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("services.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    void back1(ActionEvent event) {
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void next1(ActionEvent event) {
        StaticValues.prix = 0;
        if (check1.isSelected()) {
            StaticValues.prix += 200;
            StaticValues.services += " full body message";
        }
        if (check2.isSelected()) {
            StaticValues.prix += 300;
            StaticValues.services += " Morrocan Bath";
        }
        if (check3.isSelected()) {
            StaticValues.prix += 100;
            StaticValues.services += " Pedicure";
        }
        if (check4.isSelected()) {
            StaticValues.prix += 100;
            StaticValues.services += " Monicure";
        }
        System.out.println(StaticValues.services + " " + StaticValues.prix);
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("timing.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    ////// buy

    @FXML
    private TextField eCode;

    @FXML
    private TextField eName;

    @FXML
    private TextField ePhone;

    @FXML
    private TextField eEmail;

    @FXML
    void back3(ActionEvent event) {
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("timing.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void next3(ActionEvent event) {
        StaticValues.name = eName.getText();
        StaticValues.phone = ePhone.getText();
        StaticValues.email = eEmail.getText();
        if (eCode.getText().equals("SA99"))
            StaticValues.priceAfter = StaticValues.prix - ((StaticValues.prix * 15) / 100);
        else {
            if (!eCode.getText().equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("");
                //alert.setHeaderText("Results:");
                alert.setContentText("Code is invalid !");
                alert.showAndWait();
                return;
            }
        }


        System.out.println(StaticValues.name);
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("recipt.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void clear(ActionEvent event) {
        eCode.setText("");
        eEmail.setText("");
        ePhone.setText("");
        eName.setText("");
    }

}