package com.mendes;

import java.util.Scanner;

public class Main {

    private static final int DIAMETER_LIMIT = 1;
    private static final double ERROR = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer for diameter:");
        int input = scanner.nextInt();

        System.out.println("circle calculation:");
        circleCircumferenceCalculation(input);

        System.out.println("\narea calculation:");
        double circleArea = circleAreaCalculation(input);
        if (circleArea == ERROR) {
            System.out.println("don't enter small diameter value from " + DIAMETER_LIMIT);
        } else {
            System.out.println("diameter value " + input + " circle area: " + String.format("%.2f", circleArea));
        }
        scanner.close();
    }

    private static void circleCircumferenceCalculation(int diameter) {
        if (diameter < DIAMETER_LIMIT) {
            System.out.println("don't enter small diameter value from " + DIAMETER_LIMIT);
        } else {
            double radius = (double) diameter / 2;
            double circle = 2 * Math.PI * radius;
            System.out.println("radius " + radius + " circle circumference: " + String.format("%.2f", circle));
        }
    }

    private static double circleAreaCalculation(int diameter) {
        double result = -1;
        if (diameter < DIAMETER_LIMIT) {
            System.out.println("entered an wrong value");
        } else {
            result = Math.PI * Math.pow(diameter, 2);
        }
        return result;
    }
}