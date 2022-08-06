package sample;

public class Execution {
    public static double calculate (char op, double a, double b) {
        switch (op){
            case '+':
                return Operators.Addition(a, b);
            case '-':
                return Operators.Subtraction(a, b);
            case '*':
            case '.':
                return Operators.Multiplication(a, b);
            case '/':
            case ':':
                if (b == 0) throw new UnsupportedOperationException("Ổn không vậy ba ... sao mà chia cho 0 được");
                return Operators.Division(a, b);
            case '^':
                return Operators.Exponential(a, b);
            case '%':
                return Operators.Remainder(a, b);
            case '!':
                return Operators.Factorial(a);
            case '√':
                return Operators.SquareRoot(a);
        }
        return 0;
    }
}