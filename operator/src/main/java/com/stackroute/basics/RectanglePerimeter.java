package com.stackroute.basics;
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println(perimeterCalculator(length, breadth));
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        System.out.println("Expected output: ");
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
