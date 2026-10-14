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

        // Question 5:
        // declare variables here
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance;

        // then code solution
        distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        // then use System.out.println() to display results
        System.out.println("The distance is " + distance);

        // Question 6:
        // declare variables here
        double negativeNumber = -3.8;
        double absoluteValue;

        // then code solution
        absoluteValue = Math.abs(negativeNumber);

        // then use System.out.println() to display results
        System.out.println("The absolute value is " + absoluteValue);

        // Question 7:
        // declare variables here
        double randomNumber;

        // then code solution
        randomNumber = Math.random();

        // then use System.out.println() to display results
        System.out.println("The random number is " + randomNumber);

        // Question 8:
        // declare variables here
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int totalHours;
        int totalMinutes;

        // then code solution
        totalHours = days * hoursPerDay;
        totalMinutes = totalHours * minutesPerHour;

        // then use System.out.println() to display results
        System.out.println("The number of minutes in 24 days is " + totalMinutes);

        // BONUS: how many milliseconds
        // declare variables here
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;
        long totalSeconds;
        long totalMilliseconds;

        // then code solution
        totalSeconds = totalMinutes * secondsPerMinute;
        totalMilliseconds = totalSeconds * millisecondsPerSecond;

        // then use System.out.println() to display results
        System.out.println("The number of milliseconds in 24 days is " + totalMilliseconds);








    }
}
