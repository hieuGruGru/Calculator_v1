package sample;

import java.util.Stack;

public class EvaluationEpression {
    public static double evaluation(String expression) {

        char[] tokens = expression.toCharArray();
        final double PI = 3.1415926535897;
        Stack<Double> valueStack = new Stack<Double>();
        Stack<Character> operatorStack = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] == 'π') {
                valueStack.push(PI);
            } else {
                if (tokens[i] >= '0' && tokens[i] <= '9') {
                    StringBuffer tempStr = new StringBuffer();
                    while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                        tempStr.append(tokens[i++]);
                    }
                    valueStack.push((double) Integer.parseInt(tempStr.toString()));
                    i--;
                } else {
                    if (tokens[i] == '.') {
                        StringBuffer tempStr = new StringBuffer();
                        double decStr;
                        int n = i + 1;
                        while (n < tokens.length && tokens[n] >= '0' && tokens[n] <= '9') {
                            tempStr.append(tokens[n++]);
                        }
                        n--;
                        i = n;
                        decStr = (double) Integer.parseInt(tempStr.toString());
                        decStr = decStr / (Math.pow(10, (tempStr.toString().length())));
                        valueStack.push(valueStack.peek() + decStr);
                    } else {
                        if (tokens[i] == '(') {
                            operatorStack.push(tokens[i]);
                        } else {
                            if (tokens[i] == '(') {
                                operatorStack.push(tokens[i]);
                            } else {
                                if (tokens[i] == ')') {
                                    while (operatorStack.peek() != '(') {
                                        double topElement = valueStack.pop();
                                        valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));

                                    }
                                    operatorStack.pop();
                                } else {
                                    if (Operators.isOperator(tokens[i])) {
                                        while (!operatorStack.empty() && Operators.hasPrecedence(tokens[i], operatorStack.peek())) {
                                            double topElement = valueStack.pop();
                                            valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));
                                        }
                                        operatorStack.push(tokens[i]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        while (!operatorStack.empty()) {
            double topElement = valueStack.pop();
            valueStack.push(Execution.calculate(operatorStack.pop(), valueStack.pop(), topElement));
        }
        return valueStack.pop();
    }
}

