package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.printf("What is your age? ");
        userInput = Integer.parseInt(input.nextLine());

        String output = userInput  >= 16
            ? "You are old enough to legally drive.\n"
            : "You are not old enough to legally drive.\n";
        System.out.printf("%s\n", output);

    }
}
