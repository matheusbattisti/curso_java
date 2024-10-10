package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class VBoxHBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // criar alguns botoes vbox
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");

        VBox vbox = new VBox(15);
        vbox.getChildren().addAll(btn1, btn2, btn3);

        // criar alguns botoes hbox
        Button btn4 = new Button("Botão 4");
        Button btn5 = new Button("Botão 5");
        Button btn6 = new Button("Botão 6");

        HBox hbox = new HBox(25);
        hbox.getChildren().addAll(btn4, btn5, btn6);


        VBox root = new VBox(20);
        root.getChildren().addAll(vbox, hbox);

        // Criando uma cena com o layout
        Scene scene = new Scene(root, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
