package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    private Label labelName;

    private Person person = new Person();



    @FXML
    public void initialize(){
        textField.setText(person.getName());
        labelName.setText(person.getName());
    }

    @FXML
    public void write(){
        labelName.setText(textField.getText());
        person.setName(textField.getText());
    }
}
