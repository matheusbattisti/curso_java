package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class StackPaneAnchorPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // criar alguns botoes vbox
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        Button btn4 = new Button("Botão 4");
        Button btn5 = new Button("Botão 5");
        Button btn6 = new Button("Botão 6");

        // criar o stackpane
        StackPane stackPane = new StackPane();

        stackPane.getChildren().addAll(btn1, btn2);

        Scene stackScene = new Scene(stackPane, 400, 400);

        // criar o anchorpane
        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(btn3, 10.0);
        AnchorPane.setRightAnchor(btn3, 10.0);

        anchorPane.getChildren().add(btn3);

        Scene anchorScene = new Scene(anchorPane, 400, 400);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(stackScene);
        primaryStage.show();

        // mudar a cena apos 2seg
        new Thread(() -> {
            try {
                Thread.sleep(2000);

                Platform.runLater(() -> primaryStage.setScene(anchorScene));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }).start();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

