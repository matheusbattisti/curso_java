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
import javafx.scene.canvas.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.animation.*;


public class SmoothAnimationExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Circle circle = new Circle(50, Color.BLUE);

        circle.setTranslateX(-200);

        Timeline timeline = new Timeline();

        KeyFrame keyframe = new KeyFrame(
            Duration.seconds(2),
            new KeyValue(circle.translateXProperty(), 200)
        );

        timeline.getKeyFrames().add(keyframe);

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        timeline.play();

        StackPane stack = new StackPane();
        stack.getChildren().add(circle);

        // configuração do Stage
        Scene scene = new Scene(stack, 500, 500);

        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



