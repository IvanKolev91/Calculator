import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
         System.out.println("Enter a:");
         double a = scan.nextDouble();
         System.out.println("Enter b:");
         double b= scan.nextDouble();
         System.out.println("Enter mathematical operation\nChoose between *(multiplication), /(division), +(addition), -(subtraction)");
         char symbol = scan.next().charAt(0);
             if (symbol == '/') {
                System.out.printf("The result after divison is: %.2f",division(a,b));
        }
             else if (symbol == '*'){
                 System.out.printf("The result after multiplication is: %.2f",multiplication(a,b));

        }
             else if (symbol == '+'){
                System.out.printf("The result after addition is: %.0f",addition(a,b));
        }
             else if (symbol == '-'){
                 System.out.printf("The result after subtraction is: %.0f",subtraction(a,b));
             }
             else {
                 System.out.println("Wrong mathematical operation");
             }
    }
    private static double division(double a, double b) {
        if (b == 0) {
            System.out.printf("You cannot divison by %.2f\n", b);
        }
        return a / b;
    }

    private static double multiplication(double a, double b){
        return a*b;
    }

    private static double addition(double a, double b){
        return  a+b;
    }

    private static double subtraction(double a, double b){
        return a-b;
    }

}
