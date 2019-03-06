package com.cassey;

public class Conditions {

    public static void main(String[] args) {
        int age = 25;
        if (age < 13) {
            System.out.println("You are a kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        } else if (age >= 20 && age <= 35) {
            System.out.println("You are a youth");
        } else if (age >= 36 && age <= 55) {
            System.out.println("You are middle-aged");
        } else {
            System.out.println("You are old");
        }


    }
}
