package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Controller {
    @FXML
    private Pane titlePane;
    @FXML
    private ImageView minimize, close;
    @FXML
    private TextField expressionDisplay ;
    @FXML
    private TextField resultDisplay ;
    @FXML
    private Button clearScreen;
    @FXML
    private Button start;
    @FXML
    private Button delete;
    @FXML
    private Button shift;
    @FXML
    private Button addition;
    @FXML
    private Button subtraction;
    @FXML
    private Button multiplication;
    @FXML
    private Button division;
    @FXML
    private Button exponential;
    @FXML
    private Button squareRoot;
    @FXML
    private Button mod;
    @FXML
    private Button factorial;
    @FXML
    private Button result;
    @FXML
    private Button answer;
    @FXML
    private Button pi;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button Lparenthesis;
    @FXML
    private Button Rparenthesis;
    @FXML
    private Button decimalPoint;
    @FXML
    private Button recentResultUp;
    @FXML
    private Button recentResultDown;
    @FXML
    private Button editExpressionLeft;
    @FXML
    private Button editExpressionRight;

    private double res;
    private double x, y;
    private StringBuilder expressionToCalculate = new StringBuilder();

    ArrayList<String> expList = new ArrayList<String>();
    ArrayList<Double> resList = new ArrayList<Double>();
    Count count1 = new Count(0);//Đối tượng có thuộc tính count để đếm số lần thực hiện phép tính
    Count count2 = new Count(0);//Đối tượng có thuộc tính count để đồng bộ index trong mảng kết quả gần đây

    protected void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });
        close.setOnMouseClicked(mouseEvent -> stage.close());
        minimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }

    @FXML
    protected void handleButton (ActionEvent event) {
        if (event.getSource() == start) {
            expressionDisplay.setText("");
            resultDisplay.setText("");
            expressionToCalculate.delete(0, expressionToCalculate.length());
            res = 0;
            count1.setCount(0);
            expList.removeAll(expList);
            resList.removeAll(resList);
        }
        if( event.getSource() == pi) {
            expressionDisplay.setText(expressionDisplay.getText() + "π");
            expressionToCalculate.append("π");
        }
        if ( event.getSource() == zero) {
            expressionDisplay.setText(expressionDisplay.getText() + "0");
            expressionToCalculate.append("0");
        }
        if ( event.getSource() == one) {
            expressionDisplay.setText(expressionDisplay.getText() + "1");
            expressionToCalculate.append("1");
        }
        if ( event.getSource() == two) {
            expressionDisplay.setText(expressionDisplay.getText() + "2");
            expressionToCalculate.append("2");
        }
        if ( event.getSource() == three) {
            expressionDisplay.setText(expressionDisplay.getText() + "3");
            expressionToCalculate.append("3");
        }
        if ( event.getSource() == four) {
            expressionDisplay.setText(expressionDisplay.getText() + "4");
            expressionToCalculate.append("4");
        }
        if ( event.getSource() == five) {
            expressionDisplay.setText(expressionDisplay.getText() + "5");
            expressionToCalculate.append("5");
        }
        if ( event.getSource() == six) {
            expressionDisplay.setText(expressionDisplay.getText() + "6");
            expressionToCalculate.append("6");
        }
        if ( event.getSource() == seven) {
            expressionDisplay.setText(expressionDisplay.getText() + "7");
            expressionToCalculate.append("7");
        }
        if ( event.getSource() == eight) {
            expressionDisplay.setText(expressionDisplay.getText() + "8");
            expressionToCalculate.append("8");
        }
        if ( event.getSource() == nine) {
            expressionDisplay.setText(expressionDisplay.getText() + "9");
            expressionToCalculate.append("9");
        }
        if ( event.getSource() == Lparenthesis) {
            expressionDisplay.setText(expressionDisplay.getText() + "(");
            expressionToCalculate.append("(");
        }
        if ( event.getSource() == Rparenthesis) {
            expressionDisplay.setText(expressionDisplay.getText() + ")");
            expressionToCalculate.append(")");
        }
        if ( event.getSource() == decimalPoint){
            expressionDisplay.setText(expressionDisplay.getText() + ".");
            expressionToCalculate.append(".");
        }
        if ( event.getSource() == addition) {
            expressionDisplay.setText(expressionDisplay.getText() + "+");
            expressionToCalculate.append("+");
        }
        if ( event.getSource() == subtraction) {
            expressionDisplay.setText(expressionDisplay.getText() + "-");
            expressionToCalculate.append("-");
        }
        if ( event.getSource() == multiplication) {
            expressionDisplay.setText(expressionDisplay.getText() + "*");
            expressionToCalculate.append("*");
        }
        if ( event.getSource() == division) {
            expressionDisplay.setText(expressionDisplay.getText() + "/");
            expressionToCalculate.append("/");
        }
        if ( event.getSource() == exponential) {
            expressionDisplay.setText(expressionDisplay.getText() + "^");
            expressionToCalculate.append("^");
        }
        if ( event.getSource() == squareRoot) {
            expressionDisplay.setText(expressionDisplay.getText() + "√");
            expressionToCalculate.append("√");
        }
        if ( event.getSource() == mod) {
            expressionDisplay.setText(expressionDisplay.getText() + "%");
            expressionToCalculate.append("%");
        }
        if ( event.getSource() == factorial) {
            expressionDisplay.setText(expressionDisplay.getText() + "!");
            expressionToCalculate.append("!1");
        }
        if ( event.getSource() == answer) {
            expressionDisplay.setText(expressionDisplay.getText() + "Ans");
            expressionToCalculate.append(res);
        }
        if ( event.getSource() == clearScreen) {
            expressionDisplay.setText("");
            resultDisplay.setText("");
            expressionToCalculate.delete(0, expressionToCalculate.length());
        }
        if ( event.getSource() == delete) {
            expressionDisplay.setText((expressionDisplay.getText()).substring(0,(expressionDisplay.getText()).length() -1 ));
            expressionToCalculate.delete(expressionToCalculate.length() - 1, expressionToCalculate.length());
        }
        if ( event.getSource() == recentResultUp) {
            count2.decrease();
            expressionDisplay.setText(expList.get(count2.getCount()));
            resultDisplay.setText((resList.get(count2.getCount())).toString());
        }
        if ( event.getSource() == recentResultDown) {
            count2.increase();
            if (count2.count < count1.count) {
                expressionDisplay.setText(expList.get(count2.getCount()));
                resultDisplay.setText((resList.get(count2.getCount())).toString());
            } else {
                expressionDisplay.setText("Trống");
                resultDisplay.setText(("Trống"));
            }
        }
        /*
        if ( event.getSource() == editExpressionLeft) {
        }
        if ( event.getSource() == editExpressionRight) {
        }
        */
        if ( event.getSource() == result) {
            resultDisplay.setText(String.valueOf(ExpressionParser.parser(expressionToCalculate)));
            res = ExpressionParser.parser(expressionToCalculate);
            Counting(count1,count2);
            recentCalculation(count1.getCount(), res, expressionDisplay.getText(), expList, resList);
        }
    }

    protected static void recentCalculation(int count, double res, String expDisplay, ArrayList<String> expList, ArrayList<Double> resList) {
        if ( count < 10) {
            resList.add(res);
            expList.add(expDisplay);
        } else {
            resList.add(res);
            resList.remove(0);
            expList.remove(0);
            expList.add(expDisplay);
        }
    }

    protected static void setText(String str1, String str2) {

    }

    protected static void Counting (Count count1, Count count2) {
        count1.increase();
        count2.setCount(count1.count);
        }

}

