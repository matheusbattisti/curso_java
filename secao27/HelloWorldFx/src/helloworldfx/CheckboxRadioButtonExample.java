package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class CheckboxRadioButtonExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // Criando checkboxes
        CheckBox checkbox1 = new CheckBox("Opção 1");
        CheckBox checkbox2 = new CheckBox("Opção 2");

        Label checkboxLabel = new Label("Checkbox selecionados: ");

        checkbox1.setOnAction(event -> updateCheckboxLabel(checkbox1, checkbox2, checkboxLabel));
        checkbox2.setOnAction(event -> updateCheckboxLabel(checkbox1, checkbox2, checkboxLabel));

        // radio button
        RadioButton radioButton1 = new RadioButton("Opção A");
        RadioButton radioButton2 = new RadioButton("Opção B");

        ToggleGroup toggleGroup = new ToggleGroup();

        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        Label radioLabel = new Label("Radio button Selecionado: ");

        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue != null) {
                RadioButton selecteRadioButton = (RadioButton) toggleGroup.getSelectedToggle();

                radioLabel.setText("Radio button Selecionado: " + selecteRadioButton.getText());
            }
        });
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(checkboxLabel, checkbox1, checkbox2, radioLabel, radioButton1, radioButton2);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox e HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void updateCheckboxLabel(CheckBox cb1, CheckBox cb2, Label label) {

        String selected = "Checkbox selecionados: ";
        if(cb1.isSelected()) selected += cb1.getText() + " ";
        if(cb2.isSelected()) selected += cb2.getText();

        label.setText(selected);

    }


    public static void main(String[] args) {
        launch(args);
    }
}



