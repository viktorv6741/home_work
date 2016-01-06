package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML private TextField a;
    @FXML private TextField b;
    @FXML private TextField result;

    @FXML
    private void area(ActionEvent event){
       Model model = new Model(checkVariable(a.getText()), checkVariable(b.getText()));
        if (model.areaCalculation() == 0)result.setText("Not Appropriate Values");
        else result.setText(Integer.toString(model.areaCalculation()));
    }

    @FXML
    private void perimeter(ActionEvent event){
        Model model = new Model(checkVariable(a.getText()), checkVariable(b.getText()));
        if (model.perimeterCalculation() == 0)result.setText("Not Appropriate Values");
        else result.setText(Integer.toString(model.perimeterCalculation()));
    }

    @FXML
    private void clear(ActionEvent event){
        a.clear();
        b.clear();
        result.clear();
    }

        private String checkVariable(String string) {
        return string.matches("(?!0)[0-9]*") ? string : "0";
    }
}
