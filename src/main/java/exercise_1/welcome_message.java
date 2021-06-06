/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

//this is the package that i created inside the java folder
package exercise_1;

//this creates a scanner to input strings and such
import java.util.Scanner;

public class welcome_message {
    public static void main (String[] args){
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        //creates a variable for the person's name and scans the next line for it
        String New_Person = input.nextLine();

        //prints out the person's name and welcome message
        System.out.println("Hello " + New_Person + " nice to meet you!");
    }
}
