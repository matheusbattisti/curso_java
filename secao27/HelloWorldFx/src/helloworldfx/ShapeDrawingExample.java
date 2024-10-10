package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
import javafx.stage.*;


public class ShapeDrawingExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // retangulo
        Rectangle rectangle = new Rectangle(200, 100);

        rectangle.setFill(Color.CHOCOLATE);
        rectangle.setStroke(Color.AQUA);
        rectangle.setStrokeWidth(4);

        // circulo
        Circle circle = new Circle(50);

        circle.setFill(Color.DARKSALMON);
        circle.setStroke(Color.GOLD);
        circle.setStrokeWidth(20);

        Ellipse ellipse = new Ellipse(50, 100);

        ellipse.setFill(Color.SLATEGRAY);


        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(rectangle, circle, ellipse);

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



