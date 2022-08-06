package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    ListView<String> expressionField = new ListView<>();
    @FXML
    TextField resultField = new TextField();
    @FXML
    Button clearSrceen;
    @FXML
    Button start;
    @FXML
    Button addition;
    @FXML
    Button subtraction;
    @FXML
    Button multiplication;
    @FXML
    Button division;
    @FXML
    Button exponential;
    @FXML
    Button mod;
    @FXML
    Button sqrt;
    @FXML
    Button result;

    private double res;
    public void getResult(ActionEvent event) {
        String expression = resultField.getText();
        res = EvaluationEpression.evaluation(expression);
    }

    public void showResult(ActionEvent event) {
        /*
        String showRes = String.valueOf(res);
        */
        String showRes = "24-4+54/6 +8*3";
        expressionField.getItems().add(showRes);
    }


}
