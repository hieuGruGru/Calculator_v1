package sample;

public class Operators {
    public static double Addition (double a, double b) {
        return a + b;
    }

    public static double Subtraction (double a, double b) {
        return a - b;
    }

    public static double Multiplication (double a, double b) {
        return a * b;
    }

    public static double Division (double a, double b) {
        return a / b;
    }

    public static double Exponential (double a, double b) {
        return Math.pow(a, b);
    }

    public static double Remainder (double a, double b) {
        return a % b;
    }

    public static double Factorial (double a, double b) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a*Factorial(a - 1,1);
        }
    }


    public static boolean isOperator (char a) {
        if(a == '+' || a == '-'  ||
           a == '*' || a == '.'  ||
           a == '/' || a == ':'  ||
           a == '^' || a == '%'  ||
           a == '!'){
            return true;
        }
        else {
            throw new UnsupportedOperationException("Khoan đã ... Nhập cái toán tử gì vậy ba");
        }
    }
    public static boolean hasPrecedence (char op1, char op2) {//trả về true nếu op2 ưu tiên hơn op1
        if (op2 == '(' || op2 == ')')
            return false;
        if (op1 == '^')
            return false;
        if ((op1 == '*' || op1 == '/' || op1 == ':') && (op2 == '+' || op2 == '-' || op2 == '%' || op2 == '!'))
            return false;
        else
            return true;
    }

}
