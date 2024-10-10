package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class StageSceneExample extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // criar botão
        Button btn = new Button("Clique aqui!");

        // Criar um layout e adicionar o botao
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Criando uma cena com o layout
        Scene scene = new Scene(root, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
