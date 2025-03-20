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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TimingController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ComboBox<String> comboArticle;

    @FXML
    private ComboBox<String> comboTime;

    ObservableList<String> listArticle = FXCollections.observableArrayList("Sara", "Liso", "Eva", "Roza");
    ObservableList<String> listTime = FXCollections.observableArrayList("10:30 am", "11:00 am", "12:00 pm", "01:30 pm", "03:30 pm");

    @FXML
    void back2(ActionEvent event) {
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
    void next2(ActionEvent event) {
        StaticValues.time = comboTime.getValue();
        StaticValues.article = comboArticle.getValue();
        System.out.println(StaticValues.article + StaticValues.time);
        Parent fxmlLoader = null;
        try {
            fxmlLoader = FXMLLoader.load(getClass().getResource("buy.fxml"));
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
        comboTime.setItems(listTime);
        comboArticle.setItems(listArticle);
    }
}
