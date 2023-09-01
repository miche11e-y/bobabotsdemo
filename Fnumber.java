import java.util.Scanner;

public class Fnumber {
    public static void main(String[] args) {
        /*System.out.print(exponent(2,2));
    }
    
    public static double exponent (double A, double B) {
        double result = 1;
        for(int i=0; i<B; i++){
        result*=A;
        }
        return result; 
*/
Scanner input = new Scanner (System.in);
/*      double total = 0;
        double grade;
        double average;
        int counter = 0;
    while(counter < 2) {
        grade = input.nextInt();
        total = total + grade;
        counter++;
    }
    average = total/counter;
    System.out.println("the average is " + average); */

int A = input.nextInt();
int B = input.nextInt();

if(A > B) {
    System.out.print(A);
    System.out.println(" is greater than ");
    System.out.print(B);
}
else if(A < B) {
    System.out.print(B);
    System.out.print(" is greater than ");
    System.out.println(A);
}
    }

}

//make a method that has two numbers and gives out the average
//make method that takes two numbers and returns the bigger one
