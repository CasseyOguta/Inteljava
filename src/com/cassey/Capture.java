package com.cassey;

import java.util.Scanner;

public class Capture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
        System.out.println("Enter the first number");
int x = s.nextInt();
if (x==666)
    break;
        System.out.println("Enter the second number");
double y = s.nextDouble();

double result = x * y;
        System.out.println("Result is " + result);

    }
}
}