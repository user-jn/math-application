package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;     // import the Scanner class
import java.util.*;

public class Example {
public static void main(String[] args) {

    // Create a Scanner
    Scanner scanner = new Scanner(System.in);

// Ask the user for input
    System.out.print("What is your name? ");
    String name = scanner.nextLine();

    System.out.print("How old are you? ");
    int age = scanner.nextInt();

// Display the results
    System.out.println("Hello " + name + "!");
    System.out.println("I'am " + age + " years old.");

    scanner.close();



 }
}
