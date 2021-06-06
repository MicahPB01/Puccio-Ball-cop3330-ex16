package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */
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
