package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {

    public Button btnbutton;
    public TextField txtField;
    public Label lblLabel;
    private Model model = new Model();


    public void handleButtonClick(ActionEvent actionEvent) {
        model.increment();
        lblLabel.setText(String.valueOf(model.getCount()));
    }
}
