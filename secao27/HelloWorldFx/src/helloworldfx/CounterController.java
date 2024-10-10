package helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {
    
    private CounterModel model;

    @FXML
    private Label counterLabel;

    public CounterController() {
        model = new CounterModel();
    }

    @FXML
    private void handleIncrement() {
        model.increment();
        // atualizar a view
        updateView();
    }

    @FXML
    private void handleReset() {
        model.reset();
        // atualizar a view
        updateView();
    }

    private void updateView() {
        counterLabel.setText(Integer.toString(model.getCount()));
    }

}
