import java.util.Scanner;

public class Ecalculator {
    public static void main(String[] args) {
    Scanner tick = new Scanner(System.in);
        char operator;
        double num1 , num2;
            System.out.println("enter operator: (+ , - , * , /)");
                operator = tick.next().charAt(0);
            System.out.println("enter first num: ");
                num1 = tick.nextDouble();
            System.out.println("enter second num: ");
                num2 = tick.nextDouble();
    tick.close();
        switch(operator) {
        case '+' :
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
        case '-' :
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
        case '*' :
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
        case '/' :
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                break; 
        }
    }
}
