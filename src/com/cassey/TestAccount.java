package com.cassey;

public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account("Cassey","001","9000");
        Account acc2 = new Account("Stacy","002","8000");
        Account acc3 = new Account("Tracy","003","7000");
        Account acc4 = new Account("Jessie","004","6000");
        Account acc5 = new Account("Macy","005","5000");

        System.out.println( acc2.getBalance() );


acc2.deposit(1000);
acc2.printDetails();
acc2.withdrawal(200);
acc2.printDetails();

    }
}
