package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField expressionDisplay ;
    @FXML
    TextField resultDisplay ;
    @FXML
    Button clearSrceen;
    @FXML
    Button start;
    @FXML
    Button delete;
    @FXML
    Button shift;
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
    Button factorial;
    @FXML
    Button result;
    @FXML
    Button answer;
    @FXML
    Button pi;
    @FXML
    Button zero;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button Lparenthesis;
    @FXML
    Button Rparenthesis;
    @FXML
    Button squareRoot;

    public double res;

    StringBuffer exStr = new StringBuffer(" ");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void handleButton (ActionEvent event) {
        if ( event.getSource() == clearSrceen) {
            expressionDisplay.setText("");
            resultDisplay.setText("");
        }
        if ( event.getSource() == delete) {
            expressionDisplay.setText((expressionDisplay.getText()).substring(0,(expressionDisplay.getText()).length() -1 ));
        }
        if ( event.getSource() == zero) {
            expressionDisplay.setText(expressionDisplay.getText() + "0");
        }
        if ( event.getSource() == one) {
            expressionDisplay.setText(expressionDisplay.getText() + "1");
        }
        if ( event.getSource() == two) {
            expressionDisplay.setText(expressionDisplay.getText() + "2");
        }
        if ( event.getSource() == three) {
            expressionDisplay.setText(expressionDisplay.getText() + "3");
        }
        if ( event.getSource() == four) {
            expressionDisplay.setText(expressionDisplay.getText() + "4");
        }
        if ( event.getSource() == five) {
            expressionDisplay.setText(expressionDisplay.getText() + "5");
        }
        if ( event.getSource() == six) {
            expressionDisplay.setText(expressionDisplay.getText() + "6");
        }
        if ( event.getSource() == seven) {
            expressionDisplay.setText(expressionDisplay.getText() + "7");
        }
        if ( event.getSource() == eight) {
            expressionDisplay.setText(expressionDisplay.getText() + "8");
        }
        if ( event.getSource() == nine) {
            expressionDisplay.setText(expressionDisplay.getText() + "9");
        }
        if ( event.getSource() == Lparenthesis) {
            expressionDisplay.setText(expressionDisplay.getText() + "(");
        }
        if ( event.getSource() == Rparenthesis) {
            expressionDisplay.setText(expressionDisplay.getText() + ")");
        }
        if ( event.getSource() == addition) {
            expressionDisplay.setText(expressionDisplay.getText() + "+");
        }
        if ( event.getSource() == subtraction) {
            expressionDisplay.setText(expressionDisplay.getText() + "-");
        }
        if ( event.getSource() == multiplication) {
            expressionDisplay.setText(expressionDisplay.getText() + "*");
        }
        if ( event.getSource() == division) {
            expressionDisplay.setText(expressionDisplay.getText() + "/");
        }
        if ( event.getSource() == exponential) {
            expressionDisplay.setText(expressionDisplay.getText() + "^");
        }
        if ( event.getSource() == mod) {
            expressionDisplay.setText(expressionDisplay.getText() + "%");
        }
        if ( event.getSource() == factorial) {
            expressionDisplay.setText(expressionDisplay.getText() + "!");
        }
        if ( event.getSource() == squareRoot) {
            expressionDisplay.setText(expressionDisplay.getText() + "√");
        }
        if ( event.getSource() == result) {
            if (expressionDisplay.getText() == "Ans") {
                resultDisplay.setText(String.valueOf(res));
            } else {
                resultDisplay.setText(String.valueOf(EvaluationEpression.evaluation(expressionDisplay.getText())));
                res = EvaluationEpression.evaluation(expressionDisplay.getText());
            }

        }
        if ( event.getSource() == answer) {
            expressionDisplay.setText("Ans");
        }

    }



}
