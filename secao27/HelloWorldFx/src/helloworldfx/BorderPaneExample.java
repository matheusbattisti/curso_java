package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class BorderPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // criar alguns botoes vbox
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        Button btn4 = new Button("Botão 4");
        Button btn5 = new Button("Botão 5");
        Button btn6 = new Button("Botão 6");

        // crio o borderpane
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(btn1);
        borderPane.setBottom(btn2);
        borderPane.setLeft(btn3);
        borderPane.setRight(btn4);
        borderPane.setCenter(btn5);

        // aqui substitui o 1 pelo botao 6
        borderPane.setTop(btn6);


        // Criando uma cena com o layout
        Scene scene = new Scene(borderPane, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
