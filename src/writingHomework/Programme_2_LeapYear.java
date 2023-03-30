package writingHomework;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapyear = new Programme_2_LeapYear();
        leapyear.isItLeapYear(year);
        // Closing the scanner object
        scanner.close();

    }

    //Checking is it leap year or not
    public void isItLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){

            System.out.println("The year " + year + " is a leap year");

            return;
        }
        System.out.println("The year " + year + " is not a leap year.");

    }

}
