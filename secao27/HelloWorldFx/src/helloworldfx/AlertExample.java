package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.*;


public class AlertExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        

        Button buttonInfo = new Button("Alerta de info");

        buttonInfo.setOnAction(event -> showAlert(AlertType.INFORMATION, "Informação", "Alerta de informação"));
        

        Button buttonError = new Button("Alerta de Error");

        buttonError.setOnAction(event -> showAlert(AlertType.ERROR, "Erro", "Alerta de Erro"));
        

        Button buttonWarning = new Button("Alerta de Warning");

        buttonWarning.setOnAction(event -> showAlert(AlertType.WARNING, "Aviso", "Alerta de aviso"));
        

        Button buttonConfirmation = new Button("Alerta de Confirmation");

        buttonConfirmation.setOnAction(event -> showAlert(AlertType.CONFIRMATION, "Confirmação", "Alerta de Confirmação"));
        

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(buttonInfo, buttonError, buttonWarning, buttonConfirmation);

        // configuração do Stage
        Scene scene = new Scene(vbox, 500, 500);

        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);

        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



