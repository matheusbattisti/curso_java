package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class MultipleWindowsExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        

        Button button = new Button("Abrir Janela Secundaria");

        button.setOnAction(event -> openSecondaryWindow());

        StackPane primaryLayout = new StackPane();

        primaryLayout.getChildren().add(button);

        Scene primaryScene = new Scene(primaryLayout, 300, 300);
        

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public void openSecondaryWindow() {

        Stage secondaryStage = new Stage();

        Label label = new Label("Janela secundária");

        StackPane secondaryLayout = new StackPane();

        secondaryLayout.getChildren().add(label);

        Scene secondaryScene = new Scene(secondaryLayout, 400, 400);

        secondaryStage.setTitle("Janela secundária");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



