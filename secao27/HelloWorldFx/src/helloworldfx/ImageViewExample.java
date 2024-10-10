package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ImageViewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Image image = new Image("file:D:\\CURSOS\\42_JAVA\\curso\\secao27\\HelloWorldFx\\src\\helloworldfx\\image.png");
        
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(200);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(imageView);

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



