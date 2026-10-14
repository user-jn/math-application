package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        double bobSalary = 100000;
        double garySalary = 150000;
        double highestSalary;

        // then code solution
        highestSalary = Math.max(bobSalary, garySalary);

        // then use System.out.println() to display results
        System.out.println("The highest salary is " + highestSalary);
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 2
        // declare variables here
        double carPrice = 30000;
        double truckPrice = 45000;
        double lowestPrice;

        // then code solution
        lowestPrice = Math.min(carPrice, truckPrice);

        // then use System.out.println() to display results
        System.out.println("The lowest price is " + lowestPrice);

        // Question 3:
        // declare variables here
        double radius = 7.25;
        double circleArea;

        // then code solution
        circleArea = Math.PI * Math.pow(radius, 2);

        // then use System.out.println() to display results
        System.out.println("The area of the circle is " + circleArea);

        // Question 4:
        // declare variables here
        double number = 5.0;
        double squareRoot;

        // then code solution
        squareRoot = Math.sqrt(number);

        // then use System.out.println() to display results
        System.out.println("The square root is " + squareRoot);
    }
}
