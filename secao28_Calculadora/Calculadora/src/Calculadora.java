import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.geometry.Insets;


public class Calculadora extends Application {

    private Label display = new Label("");
    private String currentInput = "";
    private String operator = "";
    private double previousValue = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Calculadora simples");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        // Display
        display.setId("display");
        display.setMinSize(200, 50);
        display.setMaxSize(200, 50);
        display.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(display, Priority.NEVER);
        root.getChildren().add(display);

        // Layout dos botoes
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };


        // 1, 2, 3
        // 1, 2, 3 (2 linha)
        int row = 0;
        int col = 0;
        for(String text : buttons) {
            Button button = new Button(text);
            button.setMinSize(50, 50);
            // evento
            button.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> handleButtonPress(text));

            grid.add(button, col, row);

            col++;
            if(col > 3) {
                col = 0;
                row++;
            }
        }

        root.getChildren().add(grid);

        // Configurar a cena
        Scene scene = new Scene(root, 300, 400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }

    // Lógica da calculadora
    private void handleButtonPress(String value) {
        switch(value) {

            case "C":
                currentInput = "";
                operator = "";
                previousValue = 0;
                display.setText("");
                break;
            case "=":
                if(!currentInput.isEmpty() && !operator.isEmpty()) {
                    double currentValue = Double.parseDouble(currentInput);
                    double result = calculate(previousValue, currentValue, operator);
                    display.setText(String.valueOf(result));
                    currentInput = String.valueOf(result);
                    operator = "";
                }
                break;
            case "+": case "-": case "*": case "/":
                if(!currentInput.isEmpty()) {
                    operator = value;
                    previousValue = Double.parseDouble(currentInput);
                    currentInput = "";
                }
                break;
            default:
                currentInput += value;
                display.setText(currentInput);
                break;
        }
    }

    // realizar o calculo
    private double calculate(double a, double b, String op) {

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
