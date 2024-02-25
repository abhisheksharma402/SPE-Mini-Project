package org.example;
import java.util.*;
import java.lang.*;
public class Main {


    public static void displayMenu(){

        System.out.println("******************WELCOME******************");
        System.out.println(
                "\n\nI can perform the following operations:\n\n" +
                "1. Square root of a number\n\n" +
                "2. Factorial of a number\n\n" +
                "3. Natural Logarithm of a number\n\n" +
                "4. Power of a number\n\n"+
                "Press 5 to exit\n\n"
        );
    }

    public static double sqrt(int number){
        if(number<0)return Double.NaN;
        return Math.sqrt(number);
    }

    public static double factorial(int number){
        if(number<0)return Double.NaN;
        if(number==0)return 1;
        int x=number;
        int ans=x;
        while(x>1){
            x--;
            ans *= x;
        }

        return ans;
    }


    public static double ln(double number){
        if(number<0)return Double.NaN;
        return Math.log(number);
    }

    public static double power(double number, double exp){
        return Math.pow(number, exp);
    }

    public static void main(String[] args) {

        while (true){
            displayMenu();
            int choice=-1;
            System.out.println("What do you want to calculate?\n\n");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Enter the number: ");
                    int number = sc.nextInt();
                    System.out.println("Square root of "+number+" is: "+sqrt(number));
                    break;
                }
                case 2:{
                    System.out.println("Enter the number: ");
                    int number = sc.nextInt();
                    System.out.println("Factorial of "+number+" is: "+factorial(number));
                    break;
                }
                case 3:{
                    System.out.println("Enter the number: ");
                    int number = sc.nextInt();
                    System.out.println("Natural Logarithm of "+number+" is: "+ln(number));
                    break;
                }
                case 4:{
                    System.out.println("Enter the base: ");
                    double base = sc.nextInt();
                    System.out.println("Enter the exponent: ");
                    double exp = sc.nextInt();
                    System.out.println(base+" raised to the power of "+exp+" is: "+power(base,exp));
                    break;
                }
                case 5:{
                    System.out.println("\nGoodbye!!\n");
                    return;
                }
                default:{
                    System.out.println("Please enter a valid choice!");
                    break;
                }
            }
        }

    }
}