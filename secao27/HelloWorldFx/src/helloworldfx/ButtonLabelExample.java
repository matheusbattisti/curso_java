package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ButtonLabelExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Label label = new Label("Este é um label");

        Button button = new Button("Clique aqui!");

        button.setOnAction(event -> label.setText("Clicou no botão"));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(label, button);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


