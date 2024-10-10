import javafx.animation.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;


public class Cronometro extends Application {

    private Label timeLabel = new Label("00:00:00");
    private int secondsElapsed = 0;
    private Timeline timeline;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Cronômetro");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        // Display do tempo
        timeLabel.setId("timeLabel");
        root.getChildren().add(timeLabel);

        // Layout dos botões
        HBox hbox = new HBox();
        hbox.setSpacing(10);

        Button startButton = new Button("Iniciar");
        startButton.setMinSize(100, 50);
        startButton.setId("startButton");
        startButton.setOnAction(e -> startTimer());

        Button pauseButton = new Button("Pausar");
        pauseButton.setMinSize(100, 50);
        pauseButton.setId("pauseButton");
        pauseButton.setOnAction(e -> pauseTimer());

        Button resetButton = new Button("Reiniciar");
        resetButton.setMinSize(100, 50);
        resetButton.setId("resetButton");
        resetButton.setOnAction(e -> resetTimer());

        hbox.getChildren().addAll(startButton, pauseButton, resetButton);

        root.getChildren().addAll(hbox);

        // Configurar a cena
        Scene scene = new Scene(root, 400, 200);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }

    // inicializar o temporizador
    private void startTimer() {
        if(timeline == null || timeline.getStatus() != Timeline.Status.RUNNING) {
            timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateTimer()));
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        }
    }

    // pausar o tempo
    private void pauseTimer() {
        if(timeline != null) {
            timeline.pause();
        }
    }

    // zerar o tempo
    private void resetTimer() {
        if(timeline != null) {
            timeline.stop();
        }
        secondsElapsed = 0;
        updateTimerDisplay();
    }

    // atualizar o display
    private void updateTimer() {
        secondsElapsed++;
        updateTimerDisplay();
    }

    private void updateTimerDisplay() {
        int hours = secondsElapsed / 3600; // < 3600 = 0; > 3600 1; 7200 2
        int minutes = (secondsElapsed % 3600) / 60;
        int seconds = secondsElapsed % 60; // 1234:59:59

        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
