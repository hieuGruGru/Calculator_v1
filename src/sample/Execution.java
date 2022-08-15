package sample;

public class Execution {
    public static double calculate (char op, double a, double b) {
        switch (op){
            case '+':
                return Addition(a, b);
            case '-':
                return Subtraction(a, b);
            case '*':
                return Multiplication(a, b);
            case '/':
            case ':':
                if (b == 0) throw new UnsupportedOperationException("Ổn không vậy ba ... sao mà chia cho 0 được");
                return Division(a, b);
            case '^':
                return Exponential(a, b);
            case '%':
                return Remainder(a, b);
            case '!':
                return Factorial(a,b);
        }
        return 0;
    }
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
        a = Math.round(a);
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