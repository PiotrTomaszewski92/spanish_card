package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "John Snow");

    public String getPropertyTextField() {
        return propertyTextField.get();
    }

    public StringProperty propertyTextFieldProperty() {
        return propertyTextField;
    }

    public void setPropertyTextField(String propertyTextField) {
        this.propertyTextField.set(propertyTextField);
    }
}
