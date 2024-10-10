package helloworldfx;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ComboBoxListViewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        // ComboBox
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().addAll("Opção 1", "Opção 2", "Opção 3");

        comboBox.setPromptText("Selecione uma opção");

        Label comboBoxLabel = new Label("Seleção na ComboBox: ");
        
        comboBox.setOnAction(event -> {
            String selected = comboBox.getSelectionModel().getSelectedItem();

            comboBoxLabel.setText("Seleção na ComboBox: " + selected);
        });
        


        // ListView
        ObservableList<String> items = FXCollections.observableArrayList("Item A", "Item B", "Item C", "Item D");

        ListView<String> listView = new ListView<>(items);

        listView.setPrefHeight(150);

        Label listViewLabel = new Label("Seleção na ComboBox: ");
        
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            listViewLabel.setText("Seleção na list view: " + newValue);
        });

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(comboBoxLabel, comboBox,listViewLabel, listView);

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



