import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner theScan = new Scanner(System.in);
        boolean check = true;
        String operator = null;
        System.out.println("Please enter a number");
        double a = theScan.nextDouble();
        System.out.println("Please enter another number");
        double b = theScan.nextDouble();
        while (check) {
             operator = theScan.nextLine();
             if (!validOperator(operator)) {
                System.out.println("Please enter a valid operator ('+', '-', '*', '/', '%')");
            }
            if (validOperator(operator)) {
                check = false;
                theScan.close();
            }
        }
        System.out.println("The number " + a +" "+ operatorType(operator)+" " + b + " is " + calculation(a, b, operator));
    }
    public static String operatorType(String operator){
        return switch (operator) {
            case "/" -> "/";
            case "+" -> "+";
            case "-" -> "-";
            case "*" -> "*";
            case "%" -> "%";
            default -> "Unexpected operator";
        };
    }
    public static boolean validOperator(String operator){
        return !operatorType(operator).equals(("Unexpected operator"));
    }
    public static double calculation(double a, double b, String operator){
        return switch (operator) {
            case "/" -> a / b;
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "%" -> a % b;
            default -> 0;
        };
    }
}