package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class TextFieldTextAreaExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        TextField textField = new TextField();
        textField.setPromptText("Digite o seu nome...");

        TextField textField2 = new TextField();
        textField2.setPromptText("Digite a sua idade...");

        // limitar os caracteres
        textField2.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.length() > 3) {
                textField2.setText(oldValue);
            }
        });

        // textarea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Escreva como foi o seu dia");
        textArea.setPrefRowCount(5);

        Label label = new Label("Texto do textArea:");

        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Texto do textArea: " + newValue);
        });

        VBox vbox = new VBox();
        vbox.getChildren().addAll(textField, textField2, textArea, label);

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


