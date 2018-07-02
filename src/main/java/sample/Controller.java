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
        textField.textProperty().bindBidirectional(person.propertyTextFieldProperty());
        labelName.textProperty().bind(person.propertyTextFieldProperty());
    }

    @FXML
    public void write(){

    }
}
