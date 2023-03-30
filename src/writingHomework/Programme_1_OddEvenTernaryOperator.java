package writingHomework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {

     //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number : ");

        int num = scanner.nextInt();

        isItOddOrEvenNumber(num);
        //Closing the Scanner Object
        scanner.close();
    }

    //Checking the number is even or odd

    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0)? "even" : "Odd";
        System.out.println("The " + number + " is an " + evenOrOdd + " number.");
    }
}
