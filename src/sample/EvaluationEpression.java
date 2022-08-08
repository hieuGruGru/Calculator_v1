package sample;

import java.util.Stack;

public class EvaluationEpression {
    public static double evaluation(String expression) {

        char[] tokens = expression.toCharArray();

        Stack<Double> valueStack = new Stack<Double>();
        Stack<Character> operatorStack = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;

            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuffer tempStr = new StringBuffer();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    tempStr.append(tokens[i++]);
                }
                valueStack.push((double) Integer.parseInt(tempStr.toString()));
                i--;
                }

            else if (tokens[i] == '(')
                    operatorStack.push(tokens[i]);

                    // Closing brace encountered,
                    // solve entire brace
                else if (tokens[i] == ')') {
                    while (operatorStack.peek() != '(') {
                        double topElement = valueStack.pop();
                        valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));

                }
                operatorStack.pop();
            }

            // Current token is an operator.
            else if (Operators.isOperator(tokens[i]))
            {
                while (!operatorStack.empty() && Operators.hasPrecedence(tokens[i], operatorStack.peek())) {
                    double topElement = valueStack.pop();
                    valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));
                }
                // Push current token to 'operatorStack'.
                operatorStack.push(tokens[i]);
            }
        }


        while (!operatorStack.empty()) {
            double topElement = valueStack.pop();
            valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));
        }
        return valueStack.pop();
    }
}