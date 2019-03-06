package com.cassey;

public class Account {

    private String name;
    private String accNumber;
    private double balance;

//constructor == function to set up data

    public Account(String name, String accNumber, double balance) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public Account(String name, String accNumber, String balance) {
    }

//getters and setters == functions


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount)
    {
        this.balance += amount;
    }

public void withdrawal(double amount)
{
    if (this.balance > amount)
    {
        this.balance -= amount;
    }
    else
    {
        System.out.println("Insufficient balance.");
    }
}

public void printDetails(){
    System.out.println("----------");
    System.out.println("Name :" +this.name);
    System.out.println("Acc Number :"+this.accNumber);
    System.out.println("Balance :"+this.balance);

    System.out.println("-----------");
    }

String Name = "John";

//    primitive


    int x = 10;
        double z = 88;
        boolean finished = true;

                Account[] accounts = {  };
for(Account k:accounts)
    {
        k.deposit(100);
        k.printDetails();
    }

}
