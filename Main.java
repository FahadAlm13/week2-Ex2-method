import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) - Write a Java method to find the smallest number among three numbers.
        //Test Data:

//        System.out.println("Please enter your first number ");
//        int num = sc.nextInt();
//        System.out.println("Please enter your Second number ");
//        int num2 = sc.nextInt();
//        System.out.println("Please enter your third number ");
//        int num3 = sc.nextInt();
//
//        System.out.println("The smallest value is : " + smallestValue(num, num2, num3));


        //Q2) Write a Java method that check if the entered number is
        //negative or positive or zero.

//        System.out.println("Please enter a number : ");
//        int n = sc.nextInt();
//        check(n);

        //Q3) Write a Java method to check whether a string is a valid password.
        //Password rules:
        //A password must have at least ten characters. 
        //A password consists of only letters and digits.
        //A password must contain at least two digits.

        System.out.println("Please enter your password to check if it's valid or not :");
        String password = sc.nextLine();
        if (!validPassword(password)) {
            System.out.println("Your pass " + password + " is not valid");
        } else
            System.out.println("Your password " + password + " is valid ");

    }

//    public static int smallestValue(int a, int b, int c) {
//        if (a < b && a < c) {
//            return a;
//        } else if (b < a && b < c) {
//            return b;
//        } else return c;
//    }

//    public static void check(int n) {
//        if (n > 0) {
//            System.out.println("The number is positive");
//        } else if (n < 0) {
//            System.out.println("The number is negative");
//        } else System.out.println("The number is zero");
//    }


    public static boolean validPassword(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count >= 2;
    }
}